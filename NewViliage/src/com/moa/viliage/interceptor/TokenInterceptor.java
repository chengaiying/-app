package com.moa.viliage.interceptor;

import org.apache.log4j.Logger;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.db.Tables.TAlipayUser;
import com.moa.viliage.db.Tables.TFormDef;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.result.obj.EmptyResultObj;
import com.moa.viliage.token.AlipayUserInfo;
import com.moa.viliage.token.AlipayUserInfoCache;


public class TokenInterceptor implements Interceptor {
	Logger logger = Logger.getLogger(getClass());

	public static final String PARAM_TOKEN = "access_token";
	
	public static final String PARAM_ALIPAY_USER_ID = "alipay_user_id";
	
	public static final String USER_ID = "user_id";
	
	@Override
	public void intercept(ActionInvocation ai) {
		try {
			Object tokenObj = ai.getController().getRequest().getSession().getAttribute(PARAM_TOKEN);
			Object alipayUserIdObj = ai.getController().getRequest().getSession().getAttribute(PARAM_ALIPAY_USER_ID);
//			Object userIdObj = ai.getController().getRequest().getSession().getAttribute(PARAM_ALIPAY_USER_ID);
			if (tokenObj != null) {
				String token =  tokenObj.toString();
				if (alipayUserIdObj != null) {
					String alipayUserId = alipayUserIdObj.toString();
					boolean tokenValidate = AlipayUserInfoCache.getInstance().checkTokenValidate(token, alipayUserId);
					if (tokenValidate) {
						AlipayUserInfo alipayUser = AlipayUserInfoCache.getInstance().findUserInfoByToken(token);
						Record aliUserRecord = Db.findFirst("select id,is_hzs,principal_Id,province,city from alipay_user where alipay_user_id=?",alipayUserId);
						if (aliUserRecord != null) {
							alipayUser.id = aliUserRecord.getInt(TAlipayUser.COL_USER_ID).toString();
							alipayUser.isHzs = aliUserRecord.getStr(TAlipayUser.COL_IS_HZS);
							alipayUser.province=aliUserRecord.getStr(TAlipayUser.COL_PROVINCE);
							alipayUser.city=aliUserRecord.getStr(TAlipayUser.COL_CITY);
							if (aliUserRecord.getInt(TAlipayUser.COL_PRINCIPAL_ID) != null) {
								alipayUser.principalId = aliUserRecord.getInt(TAlipayUser.COL_PRINCIPAL_ID).toString();
							}
						}
						ai.getController().getRequest().getSession().setAttribute(USER_ID,alipayUser.id);
						logger.info("农户/合作社信息：" + alipayUser.id + ":::" + alipayUser.isHzs + ":::" + alipayUser.principalId);
						
//						String userId = userIdObj.toString();
						ai.getController().setAttr(PARAM_TOKEN, token);
						ai.getController().setAttr(PARAM_ALIPAY_USER_ID, alipayUserId);
						Object userFlagObj = ai.getController().getRequest().getSession().getAttribute(TFormDef.COL_FLAG);
						if (userFlagObj == null) {
							
							Record record = Db.findFirst("select * from alipay_user where id=?", alipayUser.id);
							if (record != null) {
								String isHzs = record.getStr(TAlipayUser.COL_IS_HZS);
								ai.getController().getRequest().getSession().setAttribute(TAlipayUser.COL_IS_HZS, isHzs);
							}
						}
						
						ai.invoke();
						return;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResultInfo<EmptyResultObj> ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_TOKEN_INVALIDATE, "need oauth");
		ai.getController().renderText(ret.toJson());
	}

}
