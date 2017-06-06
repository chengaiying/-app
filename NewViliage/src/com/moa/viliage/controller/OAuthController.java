package com.moa.viliage.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.slf4j.LoggerFactory;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.request.AlipayUserUserinfoShareRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayUserUserinfoShareResponse;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.moa.viliage.WebConfig;
import com.moa.viliage.common.AlipayAPIClientFactory;
import com.moa.viliage.common.AlipayServiceEnvConstants;
import com.moa.viliage.common.AppAuthRequest;
import com.moa.viliage.common.Utils;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.result.obj.EmptyResultObj;
import com.moa.viliage.service.OauthService;
import com.moa.viliage.token.AlipayUserInfo;
import com.moa.viliage.token.AlipayUserInfoCache;

public class OAuthController extends Controller {
	private static final String TAG = "OAuthController";
	/**  网页授权认证 */
	public void publicAppAuthorize() {
		System.out.println("enter publicAppAuthorize");
		String oriUrl = getPara("ori_url");
		String tmp = "ori_url=" + oriUrl;
		if (WebConfig.isDebug) {
			String userId = Utils.genRandomNumStr(18);
//			userId = "456";
//			userId = "tl2016";
			userId = "373331422825485457";
			String token = Utils.createUUID();
			AlipayUserInfo info = new AlipayUserInfo(token, userId);
//			info.id = "503747";
//			info.id = "12";
			info.id = "503811";
			info.isHzs = "0";
			info.principalId = "";
			
			LoggerFactory.getLogger(TAG).info("开发模式授权, alipayUserId:" + userId + ", accessToken:" + token);
			AlipayUserInfoCache.getInstance().put(info);
			getRequest().getSession().setAttribute(TokenInterceptor.PARAM_TOKEN, token);
        	getRequest().getSession().setAttribute(TokenInterceptor.PARAM_ALIPAY_USER_ID, userId);
        	getRequest().getSession().setAttribute(TokenInterceptor.USER_ID, info.id);
			redirect(oriUrl);
		} else {
			LoggerFactory.getLogger(TAG).info("通过支付宝授权");
			
			redirect("https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?app_id=" + AlipayServiceEnvConstants.APP_ID + "&scope=auth_userinfo&redirect_uri=" + WebConfig.callbackUrl + "&" + tmp);
		}
	}
	
	public void authCallback() {
        String authCode = getPara("auth_code");
        String ori_url = getPara("ori_url");
        
        try {
        	ori_url = URLDecoder.decode(ori_url, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        
        //获取支付宝令牌
        AlipaySystemOauthTokenResponse rsp = getAccessToken(authCode);
        
        if (rsp != null) {
        	AlipayUserUserinfoShareResponse userRsp = getUserInfo(rsp.getAccessToken());
        	if (userRsp != null) {
        		AlipayUserInfo alipayUser = new AlipayUserInfo(rsp.getAccessToken(), rsp.getUserId());
        		
        		//如果实名认证，且认证类型为身份证，则证件号码为身份证号
        		if ("T".equals(userRsp.getIsIdAuth()) && "T".equals(userRsp.getIsCertified())) {
        			alipayUser.isCertified = "1";
        			alipayUser.idNum = userRsp.getCertNo();
        		}
        		alipayUser.realName = userRsp.getRealName();
        		alipayUser.province = userRsp.getProvince();
        	
        		AlipayUserInfoCache.getInstance().put(alipayUser);
            	getRequest().getSession().setAttribute(TokenInterceptor.PARAM_TOKEN, rsp.getAccessToken());
            	getRequest().getSession().setAttribute(TokenInterceptor.PARAM_ALIPAY_USER_ID, alipayUser.alipayUserId);
            	if (! Utils.isEmpty(ori_url)) {
                	redirect(ori_url);
                }
            	return;
        	}
        }
        ResultInfo<EmptyResultObj> ret = new ResultInfo<>(ResultCodes.RET_FAILED);
    	renderText(ret.toJson());
	}
	
	
	
	@Before(TokenInterceptor.class)
	public void checkOAuth() {
		ResultInfo<EmptyResultObj> ret = new ResultInfo<>(ResultCodes.RET_SUCCESS);
    	renderText(ret.toJson());
	}
	
	/**
	 * 使用授权码换取支付宝accessToken
	 * @param auth_code		授权码
	 * @return
	 */
	private AlipaySystemOauthTokenResponse getAccessToken(String auth_code) {
		AlipaySystemOauthTokenRequest oauthTokenRequest = new AlipaySystemOauthTokenRequest();
		oauthTokenRequest.setCode(auth_code);
		oauthTokenRequest.setGrantType(AlipayServiceEnvConstants.GRANT_TYPE);
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
		try {
			AlipaySystemOauthTokenResponse oauthTokenResponse = alipayClient.execute(oauthTokenRequest);
			if (null != oauthTokenResponse && oauthTokenResponse.isSuccess()) {
				System.out.println("获取access token 成功:" + oauthTokenResponse.getBody());
				return oauthTokenResponse;
			} else {
				System.out.println("authCode换取authToken失败");
			}
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private AlipayUserUserinfoShareResponse getUserInfo(String token) {
		AlipayClient alipayClient = AlipayAPIClientFactory.getAlipayClient();
		AlipayUserUserinfoShareRequest userinfoShareRequest = new AlipayUserUserinfoShareRequest();
		AlipayUserUserinfoShareResponse userinfoShareResponse;
		try {
			userinfoShareResponse = alipayClient.execute(userinfoShareRequest, token);
			//成功获得用户信息
			if (null != userinfoShareResponse && userinfoShareResponse.isSuccess()) {
				//这里仅是简单打印， 请开发者按实际情况自行进行处理
				System.out.println("获取用户信息成功：" + userinfoShareResponse.getBody());
				System.out.println("realname:" + userinfoShareResponse.getRealName());
				System.out.println("province:" + userinfoShareResponse.getProvince());
				LoggerFactory.getLogger(TAG).info("获取用户信息成功[realname:" + userinfoShareResponse.getRealName() + ", province:" + userinfoShareResponse.getProvince() + "]");
				return userinfoShareResponse;

			} else {
				//这里仅是简单打印， 请开发者按实际情况自行进行处理
				System.out.println("获取用户信息失败");

			}
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void getAppAuthRequestContent() {
		ResultInfo<String> ret = new ResultInfo<String>(ResultCodes.RET_FAILED, "failed");
		AppAuthRequest request = new AppAuthRequest();
//		String str = request.createRequestStr("48498625000961500012");
		String str = request.createRequestStr(Utils.createUUID());
		if (str != null) {
			ret = new ResultInfo<String>(ResultCodes.RET_SUCCESS, "ok", str);
		}
		renderText(ret.toJson());
	}
	
	@Before(TokenInterceptor.class)
	public void userInfo() {
		String token = getAttrForStr(TokenInterceptor.PARAM_TOKEN);
		AlipayUserInfo userInfo = AlipayUserInfoCache.getInstance().findUserInfoByToken(token);
		ResultInfo<AlipayUserInfo> ret = new ResultInfo<AlipayUserInfo>(ResultCodes.RET_SUCCESS, "ok", userInfo);
		
		renderText(ret.toJson());
	}
	
	
	public void dummyLogin() {
		ResultInfo<String> ret = new ResultInfo<String>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = OauthService.dummyLogin(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("dummyLogin error:" + e.getMessage());
		}
		
		String ori_url = getPara("ori_url");
		if (Utils.isEmpty(ori_url)) {
			ori_url = "/web/menu.html?login_result=" + ret.code;
		} else {
			try {
				if (ret.code == ResultCodes.RET_NEED_AUTH) {
					ori_url = "/web/auth/index.html?login_result=-5";
					redirect(ori_url);
					return;
				}
				
				ori_url = URLDecoder.decode(ori_url, "utf-8");
				if (ori_url.contains("?")) {
					ori_url += "&login_result=" + ret.code;
				} else {
					ori_url += "?login_result=" + ret.code;
				}
			} catch (UnsupportedEncodingException e) {
				ori_url = "/web/menu.html?login_result=" + ret.code;
			}
		}
		redirect(ori_url);
		return;
		
//		renderText(ret.toJson());
	}
	
	
	
	public void dummyLogin2() {
		ResultInfo<String> ret = new ResultInfo<String>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = OauthService.dummyLogin(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("dummyLogin error:" + e.getMessage());
		}
		
		
		renderText(ret.toJson());
	}
	
}
