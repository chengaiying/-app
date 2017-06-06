package com.moa.viliage.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.moa.viliage.interceptor.FarmerAuthInterceptor;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.loan.Bank;
import com.moa.viliage.loan.BankLoader;
import com.moa.viliage.loan.FiProd;
import com.moa.viliage.loan.FiProdLoader;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.result.obj.EmptyResultObj;
import com.moa.viliage.service.LoanService;

/**
 * 贷款控制器
 * @author zf21100
 *
 */
public class LoanController extends Controller {
	
	private static final String TAG = "LoanController";
	
	/** 申请贷款 */
	@Before({TokenInterceptor.class, FarmerAuthInterceptor.class})
	public void apply() {
		ResultInfo<EmptyResultObj> ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = LoanService.apply(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("loan apply error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	/** 产品列表 */
	//@Before(TokenInterceptor.class)
	public void prodList() {
		/*ResultInfo<List<FiProd>> ret = new ResultInfo<List<FiProd>>(ResultCodes.RET_SUCCESS, "ok", FiProdLoader.getInstance().getFiProdList());
		renderText(ret.toJsonIgnorPrivateAttr());*/
		ResultInfo<List<FiProd>> ret = new ResultInfo<List<FiProd>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = LoanService.prodList(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("query fi_prod  error:" + e.getMessage());
		}
		renderText(ret.toJsonIgnorPrivateAttr());;
	
	}
	
	/** 金融机构列表 */
	//@Before(TokenInterceptor.class)
	public void bankList() {
		/*ResultInfo<List<Bank>> ret = new ResultInfo<List<Bank>>(ResultCodes.RET_SUCCESS, "ok", BankLoader.getInstance().getBankList());
		renderText(ret.toJson());*/
		ResultInfo<List<Bank>> ret = new ResultInfo<List<Bank>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = LoanService.bankList(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("query bank  error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	public void prodDetail() {
		ResultInfo<FiProd> ret = LoanService.prodDetail(this);
		renderText(ret.toJson());
	}
	
	/** 我的贷款 */
	@Before(TokenInterceptor.class)
	public void myLoans() {
		ResultInfo<List<Map<String, Object>>> ret = new ResultInfo<List<Map<String, Object>>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = LoanService.myLoans(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("query my loans error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
	/** 取消贷款申请 */
	@Before(TokenInterceptor.class)
	public void cancel() {
		ResultInfo<EmptyResultObj> ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = LoanService.cancel(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("cancel loan apply error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/** 新增评价信息 */
	@Before(TokenInterceptor.class)
	public void saveEvaluate() {
		ResultInfo<EmptyResultObj> ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = LoanService.saveEvaluateById(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("cancel loan apply error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/** 查询评价信息 */
	@Before(TokenInterceptor.class)
	public void queryEvaluate() {
		ResultInfo<Map<String, Integer>> ret = new ResultInfo<Map<String, Integer>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = LoanService.queryEvaluateById(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("cancel loan apply error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	
}
