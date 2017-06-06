package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.account.bind response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:17:01
 */
public class AlipayAssetAccountBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5529495397439765881L;

	/** 
	 * 用户的支付宝账号对应的支付宝唯一用户标识，不可变更。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 使用该app提供用户信息的商户，可以和app相同。
	 */
	@ApiField("provider_id")
	private String providerId;

	/** 
	 * 用户在商户网站的会员标识。商户需确保其唯一性，不可变更。
	 */
	@ApiField("provider_user_id")
	private String providerUserId;

	/** 
	 * 用户在商户网站的会员名（登录号或昵称）。
	 */
	@ApiField("provider_user_name")
	private String providerUserName;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getProviderId( ) {
		return this.providerId;
	}

	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}
	public String getProviderUserId( ) {
		return this.providerUserId;
	}

	public void setProviderUserName(String providerUserName) {
		this.providerUserName = providerUserName;
	}
	public String getProviderUserName( ) {
		return this.providerUserName;
	}

}
