package com.moa.viliage.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.http.util.TextUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.LoggerFactory;

import com.jfinal.core.Controller;
import com.moa.viliage.WebConfig;
import com.moa.viliage.common.Utils;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.token.AlipayUserInfo;
import com.moa.viliage.token.AlipayUserInfoCache;

public class FileService {
	
	private static final String TAG = "FileService";
	
	private static final String FILE_PARAM_NAME = "file_param_name";
	
	public static ResultInfo<String> uploadBase64(Controller controller) {
		String fileParamName = controller.getPara(FILE_PARAM_NAME);
		if (TextUtils.isEmpty(fileParamName)) {
			return new ResultInfo<String> (ResultCodes.RET_FAILED); 
		}
		
		String tokenStr = controller.getAttr(TokenInterceptor.PARAM_TOKEN);
		AlipayUserInfo userInfoObj = AlipayUserInfoCache.getInstance().findUserInfoByToken(tokenStr);
		
		String base64Str = controller.getPara("file");
		if (Utils.isEmpty(base64Str)) {
			return new ResultInfo<String> (ResultCodes.RET_FAILED); 
		}
		
		int index = base64Str.indexOf(",");
		base64Str = base64Str.substring(index + 1);
		if (base64Str.length() > FarmerService.PHOTO_FILE_LIMIT) {
			return new ResultInfo<String> (ResultCodes.RET_FILE_TOO_LARGE);
		}
		
		byte[] data = Base64.decodeBase64(base64Str.getBytes());
		String fileName = Utils.createUUID() + ".jpg";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(WebConfig.tmpDir + File.separator + fileName);
			fos.write(data);
			fos.flush();
			
			userInfoObj.addTmpFile(fileParamName, WebConfig.tmpDir + File.separator + fileName);
			return new ResultInfo<String>(ResultCodes.RET_SUCCESS, "upload file success", "tmp/" + fileName);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("write to file error");
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return new ResultInfo<String> (ResultCodes.RET_UNKNOWN_ERROR); 
	}
	
}