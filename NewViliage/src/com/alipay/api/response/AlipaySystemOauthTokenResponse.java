package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.system.oauth.token response.
 * 
 * @author auto create
 * @since 1.0, 2016-01-14 17:03:13
 */
public class AlipaySystemOauthTokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 6895612477642614253L;

	/** 
	 * 访问令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/** 
	 * 支付宝用户的id，默认不返回
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 访问令牌的有效时间，单位是秒。
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/** 
	 * 刷新令牌的有效时间，单位是秒。
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/** 
	 * 刷新令牌
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	/** 
	 * 对应alipayUserId, 标准userId格式
	 */
	@ApiField("user_id")
	private String userId;

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessToken( ) {
		return this.accessToken;
	}

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getExpiresIn( ) {
		return this.expiresIn;
	}

	public void setReExpiresIn(String reExpiresIn) {
		this.reExpiresIn = reExpiresIn;
	}
	public String getReExpiresIn( ) {
		return this.reExpiresIn;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getRefreshToken( ) {
		return this.refreshToken;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
