package com.moa.viliage.service;

import java.io.File;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.IAtom;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.WebConfig;
import com.moa.viliage.common.Utils;
import com.moa.viliage.db.Tables.TBizRecord;
import com.moa.viliage.db.Tables.TFormData;
import com.moa.viliage.db.Tables.TLoanApply;
import com.moa.viliage.form.FormDef;
import com.moa.viliage.form.FormDefLoader;
import com.moa.viliage.form.WordDef;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.token.AlipayUserInfo;
import com.moa.viliage.token.AlipayUserInfoCache;

public class FormSubmitService {

	private static final String TAG = "FormSubmitService";

	/**
	 * 表单提交
	 * @param controller
	 * @return
	 */
	public static ResultInfo<FormDef> submit(final Controller controller) {
		int formId = -1;
		try {
			//表单类型id
			formId = controller.getParaToInt(FormService.PARAM_FORM_ID);
		} catch (Exception e) {
			return new ResultInfo<FormDef>(ResultCodes.RET_PARAM_ERROR, "form id must be number");
		}
		//查找对应表单定义信息
		FormDef formDef = FormDefLoader.getInstance().findForm(formId);
		if (formDef == null) {
			return new ResultInfo<FormDef>(ResultCodes.RET_DATA_NOT_EXIST, "form not exist");
		}

		long nowMillis = System.currentTimeMillis();
		long endMillis = Utils.getMillisByStr(formDef.endDate);

		if (nowMillis > endMillis) {
			return new ResultInfo<FormDef>(ResultCodes.RET_EXCEED_TIME_LIMIT, "超出上报周期，不得上报");
		}

		String tokenStr = controller.getAttr(TokenInterceptor.PARAM_TOKEN);
		AlipayUserInfo userInfoObj = AlipayUserInfoCache.getInstance().findUserInfoByToken(tokenStr);

		final Record record = new Record();
		final String uuid = Utils.createUUID();
		record.set(TFormData.COL_ID, uuid);
		record.set(TFormData.COL_FORM_ID, formId);
		record.set(TFormData.COL_DATE, Utils.getCurrentTimeStr());
		record.set(TFormData.COL_ALIPAY_USER_ID, controller.getAttr(TokenInterceptor.PARAM_ALIPAY_USER_ID));
		record.set(TFormData.COL_IS_LAST, "1");
		 //判断是否是合作社 1-合作社 0-农场主
	    String uid = "";
  		if(!Utils.isEmpty(userInfoObj.principalId)){
  			uid = userInfoObj.principalId;
  		}else{
  			uid = userInfoObj.id;  			
  		}
  		record.set(TLoanApply.COL_USER_ID, uid);
		//form_data中新增modify_time（修改时间），modify(修改者)字段
		record.set(TFormData.COL_MODIFY_TIME, Timestamp.valueOf(Utils.getCurrentTimeStr()));
		record.set(TFormData.COL_MODIFY,userInfoObj.id);
		
		WordDef[] wordDefArray = formDef.getWordDefs();
		List<String> fileNameList = new ArrayList<String>();
		for (int i = 0; i < wordDefArray.length; i++) {
			WordDef word = wordDefArray[i];
			if (word != null) {
				if(word.dataType == WordDef.DATA_TYPE_FILE) {
					String tmpFileName = userInfoObj.findTmpFileName("form_" + formId + "_" + word.paramName);
					if (! Utils.isEmpty(tmpFileName)) {
						File tmpFile = new File(tmpFileName);
						String newFileName = Utils.createUUID() + ".jpg";
						fileNameList.add(newFileName);
						String newFilePath = WebConfig.formDir + File.separator + formId + File.separator + newFileName;
						if (tmpFile.renameTo(new File(newFilePath))) {
							record.set(TFormData.COL_DATA_ARRAY[i], "form/" + formId + "/" + newFileName); 
						}
					}
				} else if(word.dataType == WordDef.DATA_TYPE_CHECKBOX){
					String[] items = controller.getParaValues(word.paramName);
					if (! checkMultiSelectWords(word, items)) {
						return new ResultInfo<FormDef>(ResultCodes.RET_PARAM_ERROR, word.paramName + " error");
					}
					record.set(TFormData.COL_DATA_ARRAY[i], Utils.toJson(items));
				} else {
					String v = controller.getPara(word.paramName);
					if (! checkWordType(word, v)) {
						return new ResultInfo<FormDef>(ResultCodes.RET_PARAM_ERROR, word.paramName + " error");
					}
					record.set(TFormData.COL_DATA_ARRAY[i], v);
				}
			}
		}

		try {
			boolean bool = Db.tx(new IAtom() {
				@Override
				public boolean run() throws SQLException {
					try {
						//修改参数中新增修改者，修改时间参数
						Db.update("update form_data set is_last=? where alipay_user_id=? and form_id=? and modify_time=? and modify=?", "0", record.getStr(TFormData.COL_ALIPAY_USER_ID), record.getInt(TFormData.COL_FORM_ID),record.getTimestamp(TFormData.COL_MODIFY_TIME),record.getStr(TFormData.COL_MODIFY));
					} catch (Exception e) {
						LoggerFactory.getLogger(TAG).error(e.getMessage());
						return false;
					}
					//把创建人放入record中
					String tokenStr =controller.getSession().getAttribute(TokenInterceptor.PARAM_TOKEN).toString();
				    AlipayUserInfo userInfoObj = AlipayUserInfoCache.getInstance().findUserInfoByToken(tokenStr);
					record.set(TBizRecord.COL_CREATEOR, userInfoObj.id);
					
					boolean b1= Db.save(TFormData.TABLE_NAME, record);
					return b1;
				}
			});
			if (bool) {
				return new ResultInfo<FormDef>(ResultCodes.RET_SUCCESS);
			} else {
				Utils.deleteAllFilesByName(fileNameList);
				return new ResultInfo<FormDef>(ResultCodes.RET_FAILED);
			}
		} catch(Exception e) {
			Utils.deleteAllFilesByName(fileNameList);
			LoggerFactory.getLogger(TAG).error("submit form " + formId + " ...."  + e.getMessage());
		}

		return new ResultInfo<FormDef>(ResultCodes.RET_FAILED);
	}

	private static boolean checkWordType(WordDef word, String value) {
		//如果必填项为空，则返回失败.如果非必填项为空，则返回成功。
		if (Utils.isEmpty(value)) {
			boolean ret = ! "1".equals(word.required);
			if (! ret) {
				LoggerFactory.getLogger(TAG).warn("check Word failed: type:" + word.dataType + ", value:" + value);
			}

			return ret;
		}

		switch (word.dataType) {
		case WordDef.DATA_TYPE_NUM:
			return checkNumWord(word, value);
		case WordDef.DATA_TYPE_TEXT:
			return checkTextWord(word, value);
		case WordDef.DATA_TYPE_OPTION:
			return true;
//			return checkOptionWord(word, value);
		case WordDef.DATA_TYPE_FILE:
			return true;
		case WordDef.DATA_TYPE_DATE:
			return checkDateWord(value);
		case WordDef.DATA_TYPE_CHECKBOX:
			return true;
		default:
			return false;
		}

	}


	/**
	 * 判断数字类型字段的有效性
	 * @param word
	 * @param value
	 * @return
	 */
	private static boolean checkNumWord(WordDef word, String value) {
		try {
			Double num = Double.parseDouble(value);
			//如果下限为空，则表示对下限没有要求
			if (! Utils.isEmpty(word.minLimit)) {
				Double min = Double.parseDouble(word.minLimit);
				if (num < min) {
					return false;
				}
			}
			//如果上限为空，则表示对上限没有要求
			if (! Utils.isEmpty(word.maxLimit)) {
				Double max = Double.parseDouble(word.maxLimit);
				if (num > max) {
					return false;
				}
			}
		} catch (Exception e) {
			return false; 
		}
		return true;
	}

	/**
	 * 判断文本类型字段的有效性
	 * @param word
	 * @param value
	 * @return
	 */
	private static boolean checkTextWord(WordDef word, String value) {
		try {
			int maxLen = Integer.parseInt(word.lenMaxLimit);
			int minLen = Integer.parseInt(word.lenMinLimit);
			return value.length() >= minLen && value.length() <= maxLen;
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error(e.getMessage());
			return true;
		}
	}

	/**
	 * 判断选项类型字段的有效性
	 * 用户可以手填选项外的内容，所以不再做选项检查
	 * @param word
	 * @param value
	 * @return
	 */
	private static boolean checkOptionWord(WordDef word, String value) {
		if (word.options == null || word.options.length == 0) {
			return false;
		}
//		for (String option : word.options) {
//			if (option != null && option.equals(value)) {
//				return true;
//			}
//		}
		return true;
	}

	private static boolean checkDateWord(String value) {
		boolean ret = Utils.getDateByStr(value) != null;
		LoggerFactory.getLogger(TAG).info("check Word :" + ret  + "type:date, Value: " + value);
		return ret;
	}

	/**
	 * 判断多选项类型字段的有效性
	 * @param word
	 * @param String[] items
	 * @return
	 */
	private static boolean checkMultiSelectWords(WordDef word, String[] items) {
		if (word.options == null || word.options.length == 0 || items == null || items.length == 0) {
			return "0".equals(word.required);
		}
		try {
			for (String item : items) {
				boolean flag = false;
				for (String option : word.options) {

					if (option.equals(item)) {
						flag = true;
						break;
					}
				}
				if (flag) {
					continue;
				} else {
					return false;
				}
			}
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error(e.getMessage());
			return false;
		}

		return true;
	}

}
