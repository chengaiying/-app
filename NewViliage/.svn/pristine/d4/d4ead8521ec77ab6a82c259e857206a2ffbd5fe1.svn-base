package com.moa.viliage.service;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.common.Utils;
import com.moa.viliage.db.Tables.TAlipayUser;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.token.AlipayUserInfo;
import com.moa.viliage.token.AlipayUserInfoCache;

public class OauthService {
	public static ResultInfo<String>  dummyLogin(Controller controller) {
		String alipayUserId = controller.getPara(TAlipayUser.COL_ALIPAY_USER_ID);
		if (Utils.isEmpty(alipayUserId)) {
			return new ResultInfo<>(ResultCodes.RET_PARAM_ERROR);
		}
		
		Record record = Db.findFirst("select * from alipay_user where alipay_user_id = ? and is_authed=?", alipayUserId, "1");
		if (record == null) {
			return new ResultInfo<>(ResultCodes.RET_NEED_AUTH, "need auth", "error");
		}
		
		String token = "dumyToken_" +Utils.createUUID();
		controller.getRequest().getSession().setAttribute(TokenInterceptor.PARAM_TOKEN, token);
		controller.getRequest().getSession().setAttribute(TokenInterceptor.PARAM_ALIPAY_USER_ID, alipayUserId);
		controller.getRequest().getSession().setAttribute(TAlipayUser.COL_IS_HZS, record.get(TAlipayUser.COL_IS_HZS));
		
		AlipayUserInfo userInfo = new AlipayUserInfo(token, alipayUserId);
		userInfo.idNum = record.getStr(TAlipayUser.COL_ID);
		userInfo.realName = record.getStr(TAlipayUser.COL_FARMER);
		userInfo.province = record.getStr(TAlipayUser.COL_PROVINCE);
		AlipayUserInfoCache.getInstance().put(userInfo);
		
		return new ResultInfo<>(ResultCodes.RET_SUCCESS, "ok", alipayUserId);
	}
}
