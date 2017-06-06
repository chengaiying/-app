package com.moa.viliage.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.common.Utils;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.result.obj.EmptyResultObj;


public class FarmerAuthInterceptor implements Interceptor {
	
	@Override
	public void intercept(ActionInvocation ai) {
		ResultInfo<EmptyResultObj> ret = null;
		
		String alipayUserId = ai.getController().getAttrForStr(TokenInterceptor.PARAM_ALIPAY_USER_ID);
		if (Utils.isEmpty(alipayUserId)) {
			ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_TOKEN_INVALIDATE, "need oauth");
			ai.getController().renderText(ret.toJson());
			return;
		}
		
		Record aliUserRecord = Db.findFirst("select alipay_user_id from alipay_user where alipay_user_id=? and is_authed=?", alipayUserId, 1);
		if (aliUserRecord == null) {
			ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_NEED_AUTH, "请先进行农场主认证");
			ai.getController().renderText(ret.toJson());
		} else {
			ai.invoke();
			return;
		}
	}

}
