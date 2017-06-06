package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用应用授权码（app_auth_code）换取或者刷新应用授权令牌(app_auth_token)
 *
 * @author auto create
 * @since 1.0, 2015-10-19 10:14:00
 */
public class OpenAuthTokenAppModel extends AlipayObject {

	private static final long serialVersionUID = 6844146756143785348L;

	/**
	 * 授权码，如果grant_type的值为authorization_code。该值必须填写
	 */
	@ApiField("code")
	private String code;

	/**
	 * authorization_code表示换取app_auth_token。
refresh_token表示刷新app_auth_token。
	 */
	@ApiField("grant_type")
	private String grantType;

	/**
	 * 刷新令牌，如何grant_type值为refresh_token。该值不能为空。
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getGrantType() {
		return this.grantType;
	}
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

}
