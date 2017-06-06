package com.moa.viliage.mail;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.common.Utils;
import com.moa.viliage.db.Tables.INSApply;
import com.moa.viliage.db.Tables.INSProd;
import com.moa.viliage.db.Tables.TAlipayUser;
import com.moa.viliage.db.Tables.TFiProd;
import com.moa.viliage.db.Tables.TFormData;
import com.moa.viliage.db.Tables.TLoanApply;
import com.moa.viliage.form.FormDef;
import com.moa.viliage.form.FormDefLoader;
import com.moa.viliage.form.WordDef;

public class MailContentLoader {
	
	private static final String TAG = "MailContentLoader";
	
	private static final String LOAN_NOTIFY_APPLY_INFO_CONTENT = "【农场主基本信息】<br/>农场主姓名：%s<br/>农场主身份证号：%s<br/>农场主联系方式：%s<br/>农场名称：%s<br/>农场地址：%s<br/><br/>"
			+ "【贷款申请信息】<br/>申请贷款产品名称：%s<br/>申请提交时间：%s<br/>贷款金额：%s 万元<br/>贷款期限：%s 个月<br/>联系方式：%s<br/>贷款用途：%s<br/><br/>";
	
	private static final String LOAN_NOTIFY_APPLY_INFO_CONTENT2 = "【合作社基本信息】<br/>农场主姓名：%s<br/>农场主联系方式：%s<br/>农场名称：%s<br/>农场地址：%s<br/><br/>"
			+ "【贷款申请信息】<br/>申请贷款产品名称：%s<br/>申请提交时间：%s<br/>贷款金额：%s 万元<br/>贷款期限：%s 个月<br/>联系方式：%s<br/>贷款用途：%s<br/><br/>";
	////0-家庭农场主  1-合作社  2-规模化养殖场
	private static final String INSURE_NOTIFY_APPLY_INFO_CONTENT0 = "【家庭农场主】<br/>农场主姓名：%s<br/>农场主联系方式：%s<br/>农场名称：%s<br/>农场地址：%s<br/><br/>"
			+ "【保险申请信息】<br/>产品名称：%s<br/>申请日期：%s<br/>投保金额：%s 万元<br/>保障金额：%s 万元<br/>保障期限：%s 个月<br/>联系方式：%s<br/><br/>";
	private static final String INSURE_NOTIFY_APPLY_INFO_CONTENT1 = "【合作社】<br/>合作社姓名：%s<br/>合作社联系方式：%s<br/>合作社名称：%s<br/>合作社地址：%s<br/><br/>"
			+ "【保险申请信息】<br/>产品名称：%s<br/>申请日期：%s<br/>投保金额：%s 万元<br/><br/>保障金额：%s 万元<br/>保障期限：%s 个月<br/>联系方式：%s<br/><br/>";
	private static final String INSURE_NOTIFY_APPLY_INFO_CONTENT2 = "【规模化养殖场】<br/>养殖场主姓名：%s<br/>养殖场主联系方式：%s<br/>养殖场名称：%s<br/>养殖场地址：%s<br/><br/>"
			+ "【保险申请信息】<br/>产品名称：%s<br/>申请日期：%s<br/>投保金额：%s 万元<br/><br/>保障金额：%s 万元<br/>保障期限：%s 个月<br/>联系方式：%s<br/><br/>";
	
	/** 家庭基本信息表单id */
	private static final int FAMILY_FORM_ID = 1;
	
	/** 土地信息表单id */
	private static final int LAND_FORM_ID = 2;
	
	/** 生产经营信息(种植类)id */
	private static final int PROD_PLANT_FORM_ID = 3;
	
	/** 生产经营信息(养殖类)id */
	private static final int PROD_BREED_FORM_ID = 4;
	
	/** 生产经营信息(水产类)id */
	private static final int PROD_FISHING_FORM_ID = 12;
	
	/**
	 * 获得保险申请人信息和该保险项目信息
	 * @return
	 */
	public static String[] getInsureApplyContent(String insureApplyId){
		
		String sql="select au.farmer,au.contact,au.farm_name,au.province,au.city,au.district, ip.ins_name,ia.apply_date,ip.price,ip.claim_amount,ip.ins_content,ip.ins_term,"
				+ "ip.telphone,ip.email,au.is_hzs from ins_apply ia LEFT JOIN alipay_user au on ia.farmer_id=au.alipay_user_id LEFT JOIN ins_prod ip "
				+ "on ip.id=ia.insprod_id where ia.id=?";
		Record record = Db.findFirst(sql, insureApplyId);
		if(null==record){
			return null;
		}
		StringBuffer address =new StringBuffer(); 
	    address.append(record.getStr(TAlipayUser.COL_PROVINCE)+"·").append(record.getStr(TAlipayUser.COL_CITY) + "·").append(record.getStr(TAlipayUser.COL_DISTRICT));
		String village=record.getStr(TAlipayUser.COL_VILIAGE);
		if(null!=village){
			address.append("·").append(village);
		}
		String isHzs = record.getStr(TAlipayUser.COL_IS_HZS);
		String content = "";
		//0-家庭农场主  1-合作社  2-规模化养殖场
		if("0".equals(isHzs)){//如果是农场主
			   content = String.format(INSURE_NOTIFY_APPLY_INFO_CONTENT0, 
			   record.getStr(TAlipayUser.COL_FARMER), 			//农场主姓名
			   record.getStr(TAlipayUser.COL_CONTACT),			//农场主联系方式
			   record.getStr(TAlipayUser.COL_FARM_NAME),		//农场名称
			   address,//农场地址
			
			   record.getStr(INSProd.COL_INSPROD_NAME),//产品名称
			   record.getStr(INSApply.COL_APPLY_DATE),//申请日期
			   record.getStr(INSProd.COL_INSPROD_PRICE),//投保金额
			   record.getStr(INSProd.COL_INSPROD_CLAIMAMOUNT),//保障金额
			   record.getStr(INSProd.COL_INSPROD_INSTERM),//保障期限
			   record.getStr(INSProd.COL_TELPHONE)//联系方式
			);
			
		}else if("1".equals(isHzs)){//如果是合作社
			   content = String.format(INSURE_NOTIFY_APPLY_INFO_CONTENT0, 
			   record.getStr(TAlipayUser.COL_FARMER), 			//农场主姓名
			   record.getStr(TAlipayUser.COL_CONTACT),			//农场主联系方式
			   record.getStr(TAlipayUser.COL_FARM_NAME),		//农场名称
			   address,//农场地址
			
			   record.getStr(INSProd.COL_INSPROD_NAME),//产品名称
			   record.getStr(INSApply.COL_APPLY_DATE),//申请日期
			   record.getStr(INSProd.COL_INSPROD_PRICE),//投保金额
			   record.getStr(INSProd.COL_INSPROD_CLAIMAMOUNT),//保障金额
			   record.getStr(INSProd.COL_INSPROD_INSTERM),//保障期限
			   record.getStr(INSProd.COL_TELPHONE)//联系方式
			   );
			
		}else if("2".equals(isHzs)){//如果是规模化养殖场
			   content = String.format(INSURE_NOTIFY_APPLY_INFO_CONTENT0, 
			   record.getStr(TAlipayUser.COL_FARMER), 			//农场主姓名
			   record.getStr(TAlipayUser.COL_CONTACT),			//农场主联系方式
			   record.getStr(TAlipayUser.COL_FARM_NAME),		//农场名称
			   address,//农场地址
			
			   record.getStr(INSProd.COL_INSPROD_NAME),//产品名称
			   record.getStr(INSApply.COL_APPLY_DATE),//申请日期
			   record.getStr(INSProd.COL_INSPROD_PRICE),//投保金额
			   record.getStr(INSProd.COL_INSPROD_CLAIMAMOUNT),//保障金额
			   record.getStr(INSProd.COL_INSPROD_INSTERM),//保障期限
			   record.getStr(INSProd.COL_TELPHONE)//联系方式
			   );
		}
		
		return new String[]{content, record.getStr("email")};
	}
	
	/**
	 * 针对每一笔贷款申请，会有不同的
	 * @param applyId
	 * @return
	 */
	public static String[] getLoanApplyContent(String applyId) {
		String sql = "select apply.prod_id, apply.farmer_id,apply.amount, apply.period, farmer.contact, apply.purpose, apply.apply_date, apply.biz_num, " +
				" farmer.farm_name, farmer.province, farmer.city, farmer.district, farmer.viliage, farmer.is_hzs, " +
				" farmer.farmer, farmer.farm_name,  farmer.id_num, prod.prod_name, apply.phone, prod.contact as email " +
				" from loan_apply apply " +
				" left join alipay_user farmer on farmer.alipay_user_id=apply.farmer_id " +
				" left join fi_prod prod on prod.id=apply.prod_id " +
				" where apply.id=?";
		Record record = Db.findFirst(sql, applyId);
		if (record == null) {
			return null;
		}
		
		String address = record.getStr(TAlipayUser.COL_PROVINCE) + "·" + record.getStr(TAlipayUser.COL_CITY) + "·" + record.getStr(TAlipayUser.COL_DISTRICT) + "·" + record.getStr(TAlipayUser.COL_VILIAGE);
		String isHzs = record.getStr(TAlipayUser.COL_IS_HZS);
		String content = "";
		if ("1".equals(isHzs)) {
			content = String.format(LOAN_NOTIFY_APPLY_INFO_CONTENT2, 
					record.getStr(TAlipayUser.COL_FARMER), 			//农场主姓名
					record.getStr(TAlipayUser.COL_CONTACT),			//农场主联系方式
					record.getStr(TAlipayUser.COL_FARM_NAME),		//农场名称
					address,										//农场地址
					record.getStr(TFiProd.COL_PROD_NAME),			//贷款产品名称
					record.getStr(TLoanApply.COL_APPLY_DATE),		//贷款日期
					record.getInt(TLoanApply.COL_AMOUNT),			//贷款金额
					record.getInt(TLoanApply.COL_PERIOD),			//贷款期限
					record.getStr(TLoanApply.COL_PHONE),			//贷款联系电话
					//record.getStr(TLoanApply.COL_BIZ_NUM),			//农场工商号
					record.getStr(TLoanApply.COL_PURPOSE)			//贷款用途
					);
		} else {
			content = String.format(LOAN_NOTIFY_APPLY_INFO_CONTENT, 
					record.getStr(TAlipayUser.COL_FARMER), 			//农场主姓名
					record.getStr(TAlipayUser.COL_ID),				//农场主身份证号
					record.getStr(TAlipayUser.COL_CONTACT),			//农场主联系方式
					record.getStr(TAlipayUser.COL_FARM_NAME),		//农场名称
					address,										//农场地址
					record.getStr(TFiProd.COL_PROD_NAME),			//贷款产品名称
					record.getStr(TLoanApply.COL_APPLY_DATE),		//贷款日期
					record.getInt(TLoanApply.COL_AMOUNT),			//贷款金额
					record.getInt(TLoanApply.COL_PERIOD),			//贷款期限
					record.getStr(TLoanApply.COL_PHONE),			//贷款联系电话
					//record.getStr(TLoanApply.COL_BIZ_NUM),			//农场工商号
					record.getStr(TLoanApply.COL_PURPOSE)			//贷款用途
					);
		}
		
		
//		String formInfoStr = getFormInfo(userId);
//		if (! Utils.isEmpty(formInfoStr)) {
//			content += formInfoStr;
//		}
		
		return new String[]{content, record.getStr("email")};
	}
	
	
	public static String getFormInfo(String userId) {
		StringBuilder formInfoGather = new StringBuilder();
		
		String sql = "select *, max(date) as lastDate from form_data where alipay_user_id=? and form_id in (?,?,?,?,?) GROUP BY form_id ";
		List<Record> recordList = Db.find(sql, userId, FAMILY_FORM_ID, LAND_FORM_ID, PROD_PLANT_FORM_ID, PROD_BREED_FORM_ID, PROD_FISHING_FORM_ID);
		
		for (Record record : recordList) {
			String str = genSingleFormInfo(record);
			if (! Utils.isEmpty(str)) {
				formInfoGather.append(str + "<br/>");
			}
		}
		
		return formInfoGather.toString();
	}
	
	private static String genSingleFormInfo(Record record) {
		StringBuilder sb = null;
		
		if (record == null) {
			return "";
		}
		
		int formId = record.getInt(TFormData.COL_FORM_ID);
		
		FormDef formDef = FormDefLoader.getInstance().findForm(formId);
		if (formDef == null) {
			return "";
		}
		
		WordDef[] words = formDef.getWordDefs();
		for (int i = 0; i < words.length; i++) {
			if (words[i] == null || words[i].dataType == WordDef.DATA_TYPE_FILE) {
				continue;
			}
			
			String value = record.getStr(TFormData.COL_DATA_ARRAY[i]);
			if (! Utils.isEmpty(value)) {
				if (sb == null) {
					sb = new StringBuilder("【" + formDef.formName + "】<br/>");
				}
				sb.append(words[i].display.replace("&nbsp", " ") + ": " + value);
				if (! Utils.isEmpty(words[i].unit)) {
					sb.append("" + words[i].unit);
				}
				sb.append("<br/>");
			}
		}
		
		return sb == null ? "" : sb.toString();
	}
	
}
