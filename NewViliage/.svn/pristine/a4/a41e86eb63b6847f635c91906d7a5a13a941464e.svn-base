package com.moa.viliage.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.common.Utils;
import com.moa.viliage.db.Tables.TBizRecord;
import com.moa.viliage.db.Tables.TLoanApply;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.result.obj.EmptyResultObj;
import com.moa.viliage.token.AlipayUserInfo;
import com.moa.viliage.token.AlipayUserInfoCache;

public class BizRecordService {
	
	/**
	 * 农产品类型加载
	 * @author zf21100
	 */
	public static class AgriProdTypeLoader {
		
		private List<Map<String, Object>> prodTypeList = new ArrayList<>();
		
		private static AgriProdTypeLoader instance = new AgriProdTypeLoader();
		
		private AgriProdTypeLoader() {}
		
		public static AgriProdTypeLoader getInstance() {
			return instance;
		}
		
		public void loadAgriProdTypes() {
			prodTypeList.clear();
			List<Record> list = Db.find("select * from agri_prod_type order by has_child desc");
			
			Iterator<Record> iterator = list.iterator();
			while (iterator.hasNext()) {
				Record record = iterator.next();
				prodTypeList.add(record.getColumns());
			}
		}
		
		public List<Map<String, Object>> getAgriProdTypeList() {
			return prodTypeList;
		}
	}
	
	
	public static ResultInfo<EmptyResultObj> record(Controller controller) {
		String inOrExp = controller.getPara(TBizRecord.COL_IN_OR_EXP);
		String scene = controller.getPara(TBizRecord.COL_SCENE);
		String agriProdType = controller.getPara(TBizRecord.COL_AGRI_PROD_TYPE);
		String sceneName = controller.getPara(TBizRecord.COL_SCENE_NAME);
		String createDate = controller.getPara(TBizRecord.COL_CREATE_DATE);
		
		if (Utils.isEmpty(inOrExp) || (!"1".equals(inOrExp) && !"2".equals(inOrExp))) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "收支类型填写错误");
		}
		
		if (Utils.isEmpty(scene)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "场景id错误");
		}
		
		if (Utils.isEmpty(sceneName)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "场景名称错误");
		}
		
		if (Utils.isEmpty(createDate)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "日期错误");
		}
		
//		if (Utils.isEmpty(scene) || Utils.isEmpty(sceneName) || Utils.isEmpty(createDate)) {
//			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "场景或类型填写错误");
//		}
		Record record = new Record();
		record.set(TBizRecord.COL_ID, Utils.createUUID());
		record.set(TBizRecord.COL_ALIPAY_USER_ID, controller.getAttr(TokenInterceptor.PARAM_ALIPAY_USER_ID));
		
		Calendar calendar = Calendar.getInstance();
		Date date = Utils.getDateTimeByStr(createDate);
		if (date != null) {
			calendar.setTime(date);
		}
		record.set(TBizRecord.COL_CREATE_DATE, Utils.SDF.format(calendar.getTime()));
		record.set(TBizRecord.COL_YEAR_AND_MONTH, calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1));
		record.set(TBizRecord.COL_IN_OR_EXP, inOrExp);
		record.set(TBizRecord.COL_SCENE, scene);
		record.set(TBizRecord.COL_AGRI_PROD_TYPE, agriProdType);
		record.set(TBizRecord.COL_SCENE_NAME, sceneName);
		//把创建人放入record中
		String tokenStr =controller.getSession().getAttribute(TokenInterceptor.PARAM_TOKEN).toString();
	    AlipayUserInfo userInfoObj = AlipayUserInfoCache.getInstance().findUserInfoByToken(tokenStr);
		record.set(TBizRecord.COL_CREATEOR, userInfoObj.id);
		 //判断是否是合作社 1-合作社 0-农场主
	    String uid = "";
  		if(!Utils.isEmpty(userInfoObj.principalId)){
  			uid = userInfoObj.principalId;
  		}else{
  			uid = userInfoObj.id;  			
  		}
  		record.set(TLoanApply.COL_USER_ID, uid);
		if (! controller.isParaBlank(TBizRecord.COL_UNIT_PRICE)) {
			String priceStr = controller.getPara(TBizRecord.COL_UNIT_PRICE);
			try {
				BigDecimal price = new BigDecimal(priceStr).setScale(2, BigDecimal.ROUND_HALF_UP);
				record.set(TBizRecord.COL_UNIT_PRICE, price);
			} catch (Exception e) {
			}
		}
		if (! controller.isParaBlank(TBizRecord.COL_COUNT)) {
			try {
				record.set(TBizRecord.COL_COUNT, controller.getParaToInt(TBizRecord.COL_COUNT));
			} catch (Exception e) {}
		}
		
		String totalStr = controller.getPara(TBizRecord.COL_TOTAL);
		if (Utils.isEmpty(totalStr)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "总金额不能为空");
		}
		
		try {
			BigDecimal total = new BigDecimal(totalStr).setScale(2, BigDecimal.ROUND_HALF_UP);
			record.set(TBizRecord.COL_TOTAL, total);
		} catch (Exception e) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "总金额格式错误");
		}
		
		if (Db.save(TBizRecord.TABLE_NAME, record)) {
			return new ResultInfo<>(ResultCodes.RET_SUCCESS, "ok");
		}
		
		return new ResultInfo<>(ResultCodes.RET_UNKNOWN_ERROR, "failed");
	}
	//修改经营项目
	public static ResultInfo<EmptyResultObj> recordUpdate(Controller controller) {
		String inOrExp = controller.getPara(TBizRecord.COL_IN_OR_EXP);
		String scene = controller.getPara(TBizRecord.COL_SCENE);
		String agriProdType = controller.getPara(TBizRecord.COL_AGRI_PROD_TYPE);
		String sceneName = controller.getPara(TBizRecord.COL_SCENE_NAME);
		String createDate = controller.getPara(TBizRecord.COL_CREATE_DATE);
		String id = controller.getPara(TBizRecord.COL_ID);
		if (Utils.isEmpty(inOrExp) || (!"1".equals(inOrExp) && !"2".equals(inOrExp))) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "收支类型填写错误");
		}
		if (Utils.isEmpty(scene)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "场景id错误");
		}
		
		if (Utils.isEmpty(sceneName)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "场景名称错误");
		}
		
		if (Utils.isEmpty(createDate)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "日期错误");
		}
		if(Utils.isEmpty(id)){
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "id不能为空");
		}
		Record record = new Record();
		record.set(TBizRecord.COL_ID, id);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateTime = simpleDateFormat.format(new Date());
		record.set(TBizRecord.COL_MODIFY_TIME,dateTime);
		record.set(TBizRecord.COL_IN_OR_EXP, inOrExp);
		record.set(TBizRecord.COL_SCENE, scene);
		record.set(TBizRecord.COL_AGRI_PROD_TYPE, agriProdType);
		record.set(TBizRecord.COL_SCENE_NAME, sceneName);
		if (! controller.isParaBlank(TBizRecord.COL_UNIT_PRICE)) {
			String priceStr = controller.getPara(TBizRecord.COL_UNIT_PRICE);
			try {
				BigDecimal price = new BigDecimal(priceStr).setScale(2, BigDecimal.ROUND_HALF_UP);
				record.set(TBizRecord.COL_UNIT_PRICE, price);
			} catch (Exception e) {
			}
		}
		if (! controller.isParaBlank(TBizRecord.COL_COUNT)) {
			try {
				record.set(TBizRecord.COL_COUNT, controller.getParaToInt(TBizRecord.COL_COUNT));
			} catch (Exception e) {}
		}
		
		String totalStr = controller.getPara(TBizRecord.COL_TOTAL);
		if (Utils.isEmpty(totalStr)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "总金额不能为空");
		}		
		try {
			BigDecimal total = new BigDecimal(totalStr).setScale(2, BigDecimal.ROUND_HALF_UP);
			record.set(TBizRecord.COL_TOTAL, total);
		} catch (Exception e) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "总金额格式错误");
		}
		
		if (Db.update(TBizRecord.TABLE_NAME, record)) {
			return new ResultInfo<>(ResultCodes.RET_SUCCESS, "ok");
		}
		return new ResultInfo<>(ResultCodes.RET_UNKNOWN_ERROR, "failed");
	}
	
	
	//查询经营项目
	public static ResultInfo<Record> findRecord(Controller controller) {
		String id = controller.getPara(TBizRecord.COL_ID);
		if(Utils.isEmpty(id)){
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "id不能为空");
		}
		Record record= Db.findFirst("select b.*,a.name from (select * from biz_record  where id=?)b left join agri_prod_type a on b.agri_prod_type=a.id", id);
		if(null == record){
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "未查询到此记录");
		}
		 return new ResultInfo<Record>(ResultCodes.RET_SUCCESS, "ok",record);
	}
	
	/**
	 * 统计指定月份，各类型的数据总额
	 * @param controller
	 */
	public static ResultInfo<List<Map<String, Object>>> recordSummary(Controller controller) {
		String yearAndMonth = controller.getPara(TBizRecord.COL_YEAR_AND_MONTH);
		
		if (Utils.isEmpty(yearAndMonth)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "年月不能为空");
		}
		String alipayUserId = controller.getAttrForStr(TokenInterceptor.PARAM_ALIPAY_USER_ID);
		List<Record> list = Db.find("select scene, in_or_exp, year_and_month, sum(total) as total from biz_record where alipay_user_id=? and year_and_month=? group by scene, year_and_month", alipayUserId, yearAndMonth);
		
		List<Map<String, Object>> results = new ArrayList<>();
		for (Record record : list) {
			results.add(record.getColumns());
		}
		
		return new ResultInfo<>(ResultCodes.RET_SUCCESS, "ok", results);
	}
	
	public static ResultInfo<List<Map<String, Object>>> recordList(Controller controller) {
		String yearAndMonth = controller.getPara(TBizRecord.COL_YEAR_AND_MONTH);
		
		if (Utils.isEmpty(yearAndMonth)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "年月不能为空");
		}
//		String alipayUserId = controller.getAttrForStr(TokenInterceptor.PARAM_ALIPAY_USER_ID);
		String tokenStr = controller.getSession().getAttribute(TokenInterceptor.PARAM_TOKEN).toString();
	    AlipayUserInfo userInfoObj = AlipayUserInfoCache.getInstance().findUserInfoByToken(tokenStr);
		String userId = userInfoObj.id;
		if(!Utils.isEmpty(userInfoObj.principalId)) {
			userId = userInfoObj.principalId;
		}
		
		List<Record> list = Db.find("select * from biz_record where user_id=? and year_and_month=? order by create_date desc", userId, yearAndMonth);
		List<Map<String, Object>> results = new ArrayList<>();
		
		for (Record record : list) {
			Map<String, Object> map = record.getColumns();
			map.remove(TBizRecord.COL_ALIPAY_USER_ID);
			map.remove(TBizRecord.COL_UNIT_PRICE);
			map.remove(TBizRecord.COL_COUNT);
			map.remove(TBizRecord.COL_NOTE);
			map.remove(TBizRecord.COL_YEAR_AND_MONTH);
			
			results.add(map);
		}
		
		return new ResultInfo<List<Map<String,Object>>>(ResultCodes.RET_SUCCESS, "ok", results);
	}
	
}
