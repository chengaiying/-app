package com.moa.viliage.controller;

import org.slf4j.LoggerFactory;

import com.jfinal.core.Controller;
import com.moa.viliage.form.FormDefLoader;
import com.moa.viliage.loan.BankLoader;
import com.moa.viliage.loan.FiProdLoader;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.result.obj.EmptyResultObj;

public class ResourseLoaderController extends Controller {
	
	public static final String TAG = "ResourseLoaderController";
	
	public void reload() {
		ResultInfo<EmptyResultObj> ret = new ResultInfo<>(ResultCodes.RET_UNKNOWN_ERROR);
		int port = getRequest().getLocalPort();
		if (port != 88) {
			ret = new ResultInfo<>(ResultCodes.RET_NO_PERMISSION, "no permission");
		} else {
			int optCode = 0;
			try {
				optCode = getParaToInt("opt_code");
			} catch (Exception e) {
				LoggerFactory.getLogger(TAG).error("reload error:" + e.getMessage());
			}
			ret = new ResultInfo<>(ResultCodes.RET_SUCCESS, "ok");
			switch (optCode) {
			case 1:
				FormDefLoader.getInstance().loadFormDefs();
				break;
			case 2:
				BankLoader.getInstance().loadBanks();
				break;
			case 3:
				FiProdLoader.getInstance().loadFiProds();
				break;
			default:
				ret = new ResultInfo<>(ResultCodes.RET_PARAM_ERROR, "opt_code error");
				break;
			}
		}
		renderText(ret.toJson());
	}
}
