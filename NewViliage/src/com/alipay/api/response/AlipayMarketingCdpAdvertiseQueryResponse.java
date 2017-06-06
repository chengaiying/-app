package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.advertise.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-11-05 11:34:36
 */
public class AlipayMarketingCdpAdvertiseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3137218595979638448L;

	/** 
	 * 行为地址。用户点击广告后，跳转URL地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/** 
	 * 广告标识码,钱包上开放给商家的广告位标识码
	 */
	@ApiField("ad_code")
	private String adCode;

	/** 
	 * 广告展示规则。该规则用于商家设置对用户是否展示广告的校验条件，目前支持设置城市规则、商家店铺规则。按业务要求应用对应规则即可。
	 */
	@ApiField("ad_rules")
	private String adRules;

	/** 
	 * 广告内容
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 广告内容类型，目前包括HTML5和图片，分别传入：H5和PIC
	 */
	@ApiField("content_type")
	private String contentType;

	/** 
	 * 高度
	 */
	@ApiField("height")
	private String height;

	/** 
	 * 在线：ONLINE , 下线：OFFLINE
	 */
	@ApiField("status")
	private String status;

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
	public String getActionUrl( ) {
		return this.actionUrl;
	}

	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}
	public String getAdCode( ) {
		return this.adCode;
	}

	public void setAdRules(String adRules) {
		this.adRules = adRules;
	}
	public String getAdRules( ) {
		return this.adRules;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentType( ) {
		return this.contentType;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	public String getHeight( ) {
		return this.height;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
