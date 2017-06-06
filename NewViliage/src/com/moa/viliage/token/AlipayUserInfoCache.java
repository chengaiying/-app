package com.moa.viliage.token;

import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.LoggerFactory;

import com.moa.viliage.common.Utils;

public class AlipayUserInfoCache {

	private static final String TAG = "AlipayUserInfoCache";
	
	private ConcurrentHashMap<String, AlipayUserInfo> cache = new ConcurrentHashMap<String, AlipayUserInfo>();

	private static AlipayUserInfoCache instance = new AlipayUserInfoCache();

	public static AlipayUserInfoCache getInstance() {
		return instance;
	}

	public void put(AlipayUserInfo user) {
		LoggerFactory.getLogger(TAG).info("put user: " + user);
		cache.put(user.accessToken, user);
	}

	public AlipayUserInfo remove(String tokenStr) {
		AlipayUserInfo userInfo = cache.remove(tokenStr);
		//删除所有图片
		if (userInfo != null) {
			userInfo.deleteAllImgs();
		}
		LoggerFactory.getLogger(TAG).info("remove user: " + userInfo);
		return userInfo;
	}

	public boolean contains(AlipayUserInfo token) {
		return cache.contains(token);
	}

	public AlipayUserInfo findUserInfoByToken(String tokenStr) {
		return cache.get(tokenStr);
	}

	public boolean checkTokenValidate(String tokenStr, String userId) {
		if (Utils.isEmpty(tokenStr) || Utils.isEmpty(userId)) {
			return false;
		}
		
		AlipayUserInfo tokenObj = cache.get(tokenStr);
		if (tokenObj == null) {
			return false;
		}
		return userId.equals(tokenObj.alipayUserId);
	}
	
}
