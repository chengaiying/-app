package com.moa.viliage.common;

import java.util.Map;
import java.util.TreeMap;

import org.slf4j.LoggerFactory;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;

public class AppAuthRequest {
	
	private static final String TAG = "AppAuthRequest";
	
	/** 服务对应的名称，常量值为com.alipay.account.auth */
	public static final String API_NAME = "com.alipay.account.auth";
	
	/** 接口名称，常量值为alipay.open.auth.sdk.code.get */
	public static final String METHOD = "alipay.open.auth.sdk.code.get";
	
	/** 调用来源方的标识，常量值为mc */
	public static final String APP_NAME = "mc";
	
	/** 调用业务的类型，常量值为openservice  */
	public static final String BIZ_TYPE = "openservice";
	
	/** 产品码，常量值为APP_FAST_LOGIN */
	public static final String PRODUCT_ID = "APP_FAST_LOGIN";
	
	/** 授权范围，常量值为kuaijie */
	public static final String SCOPE = "kuaijie";
	
	
	/** 
	 * 标识授权类型，取值范围：
	 * AUTHACCOUNT代表授权；
	 * LOGIN代表登录
	 * */
	public static final String AUTH_TYPE = "AUTHACCOUNT";
	
	public String createRequestStr(String targetId) {
		//sortedParams
		Map<String, String> map = new TreeMap<String, String>();
		
		map.put("apiname", API_NAME);
		map.put("method", METHOD);
		map.put("app_id", AlipayServiceEnvConstants.APP_ID);
		map.put("app_name", APP_NAME);
		map.put("biz_type", BIZ_TYPE);
		map.put("pid", AlipayServiceEnvConstants.PARTNER);
		map.put("product_id", PRODUCT_ID);
		map.put("scope", SCOPE);
		map.put("target_id", targetId);
		map.put("auth_type", AUTH_TYPE);
		map.put("sign_type", AlipayServiceEnvConstants.SIGN_TYPE);
		
		String signContent = AlipaySignature.getSignContent(map);
		try {
			String signStr = AlipaySignature.rsaSign(signContent, AlipayServiceEnvConstants.PRIVATE_KEY, AlipayServiceEnvConstants.CHARSET);
			map.put("sign", java.net.URLEncoder.encode(signStr));
			return AlipaySignature.getSignContent(map);
		} catch (AlipayApiException e) {
			LoggerFactory.getLogger(TAG).error("sign error" + e.getMessage());
		}
		
		return null;
	} 
	
}
