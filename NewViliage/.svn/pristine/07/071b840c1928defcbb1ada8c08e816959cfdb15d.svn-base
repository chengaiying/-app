package com.moa.viliage.controller;

import org.slf4j.LoggerFactory;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.service.FileService;

public class FileController extends Controller {
	private static final String TAG = "FileController";
	
	@Before(TokenInterceptor.class)
	public void uploadByBase64() {
		ResultInfo<String> ret = new ResultInfo<String>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = FileService.uploadBase64(this);
			ret.code=0;
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("upload file error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}

}
