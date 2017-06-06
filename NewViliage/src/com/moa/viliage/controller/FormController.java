package com.moa.viliage.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.moa.viliage.form.FormDef;
import com.moa.viliage.form.FormDefLoader;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.model.TableResourceModel;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.service.FormService;
import com.moa.viliage.service.FormSubmitService;

public class FormController extends Controller {
	private static final String TAG = "FormController";
	
	/** 列出所有表单 */
	public void formList() {
		ResultInfo<List<Map<String, Object>>> ret = new ResultInfo<List<Map<String, Object>>>(ResultCodes.RET_SUCCESS, "success", FormDefLoader.getInstance().simpleFormList);
		renderText(ret.toJson());
	}
	
	/**
	 * 查看表单结构信息
	 */
	public void formDefDetail() {
		ResultInfo<FormDef> ret = new ResultInfo<FormDef>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = FormService.formDefDetail(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("formDetail error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	/**
	 * 查询再次上报最后一条历史记录
	 */
	public void historyReportQuery() {
		ResultInfo<FormDef> ret = new ResultInfo<FormDef>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = FormService.historyReportQuery(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("historyReportQuery error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	/** 表单提交  */
//	@Before({TokenInterceptor.class, FarmerAuthInterceptor.class})
	@Before({TokenInterceptor.class})
	public void submit() {
		ResultInfo<FormDef> ret = new ResultInfo<FormDef>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = FormSubmitService.submit(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("formDetail error:" + e.getMessage());
			e.printStackTrace();
		}
		renderText(ret.toJson());
	}
	
	/** 表单详细信息  */
	@Before(TokenInterceptor.class)
	public void formDetail() {
		ResultInfo<FormDef> ret = new ResultInfo<FormDef>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = FormService.formDetail(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("formDetail error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	
	/** 表单详细信息  */
	@Before(TokenInterceptor.class)
	public void allFormDetail() {
		ResultInfo<List<FormDef>> ret = new ResultInfo<List<FormDef>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = FormService.allFormDetail(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("allFormDetail error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
//	@Before(TokenInterceptor.class)
//	public void getAllFormStatus() {
//		ResultInfo<List<String>> ret = new ResultInfo<List<String>>(ResultCodes.RET_UNKNOWN_ERROR);
//		try {
//			ret = FormService.getAllFormStatus(this);
//		} catch (Exception e) { 
//			LoggerFactory.getLogger(TAG).error("formDetail error:" + e.getMessage());
//		}
//		renderText(ret.toJson());
//	}
	
	@Before(TokenInterceptor.class)
	public void myReportedInfo() {
		ResultInfo<List<Map<String, Object>>> ret = new ResultInfo<List<Map<String, Object>>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = FormService.myReportedInfos(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("get my reported infos error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/**
	 * 获取各级目录（从二级菜单开始获取）
	 * @author linluole 2016-12-02
	 */
	@Before(TokenInterceptor.class)
	public void getMul() {
		ResultInfo<List<TableResourceModel>> ret = new ResultInfo<List<TableResourceModel>>(
				ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = FormService.getMul(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error(
					"formDetail error:" + e.getMessage());
		}
		renderText(ret.toJson());

	}
	@Before(TokenInterceptor.class)
	public void adminAction() {
//		if (! WebConfig.isDebug) {
//			if ("20880066897590751944804121014242".equals(getAttr(TokenInterceptor.PARAM_ALIPAY_USER_ID))) {
//				try {
//					TestForm.load(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
//					renderText("ok");
//				} catch (Exception e) {
//					renderText("error");
//				}
//			}
//		} else {
//			try {
//				TestForm.load(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
//				renderText("ok");
//			} catch (Exception e) {
//				renderText("error");
//			}
//		}
	}
}
