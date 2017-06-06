package com.moa.viliage.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.LoggerFactory;

import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.token.AlipayUserInfoCache;

public class SessionListener implements HttpSessionListener {
	
	private static final String TAG = "SessionListener";
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		event.getSession().setMaxInactiveInterval(1800);
		LoggerFactory.getLogger(TAG).info("session created:" + event.getSession().getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		LoggerFactory.getLogger(TAG).info("session destroyed:" + event.getSession().getId());
		Object tokenObj = event.getSession().getAttribute(TokenInterceptor.PARAM_TOKEN);
		if (tokenObj != null) {
			String tokenStr = tokenObj.toString();
			AlipayUserInfoCache.getInstance().remove(tokenStr);
		}
	}
}
