package com.moa.viliage.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.result.obj.EmptyResultObj;
import com.moa.viliage.service.BizRecordService;
import com.moa.viliage.service.BizRecordService.AgriProdTypeLoader;

/**
 * 经营动态控制器
 * @author zf21100
 *
 */
public class BizRecordController extends Controller {
	
	private static final String TAG = "BizRecordController";
	
	@Before(TokenInterceptor.class)
	public void record() {
		ResultInfo<EmptyResultObj> ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = BizRecordService.record(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("record biz error " + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	@Before(TokenInterceptor.class)
	public void recordUpdate() {
		ResultInfo<EmptyResultObj> ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = BizRecordService.recordUpdate(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("record biz error " + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	@Before(TokenInterceptor.class)
	public void findRecord() {
		ResultInfo<Record> ret = new ResultInfo<Record>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = BizRecordService.findRecord(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("record biz error " + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	public void agriProdTypeList() {
		renderText(new ResultInfo<List<Map<String, Object>>>(ResultCodes.RET_SUCCESS, "ok", AgriProdTypeLoader.getInstance().getAgriProdTypeList()).toJson());
	}
	
	@Before(TokenInterceptor.class)
	public void recordSummary() {
		ResultInfo<List<Map<String, Object>>> ret = new ResultInfo<List<Map<String, Object>>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = BizRecordService.recordSummary(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("query biz record summary error" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	@Before(TokenInterceptor.class)
	public void recordList() {
		ResultInfo<List<Map<String, Object>>> ret = new ResultInfo<List<Map<String, Object>>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = BizRecordService.recordList(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("query biz record list error " + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
}
