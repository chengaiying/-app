package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给ISV、开发者创建广告的接口，创建广告后投放渠道包括钱包APP，聚牛APP等，投放支持的APP应用
 *
 * @author auto create
 * @since 1.0, 2015-12-23 18:14:43
 */
public class AlipayMarketingCdpAdvertiseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1316311316456316572L;

	/**
	 * 行为地址。用户点击广告后，跳转URL地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 钱包上开放给商家的广告位
	 */
	@ApiField("ad_code")
	private String adCode;

	/**
	 * 广告展示规则。该规则用于商家设置对用户是否展示广告的校验条件，目前支持设置城市规则、商家店铺规则。按业务要求应用对应规则即可。
	 */
	@ApiField("ad_rules")
	private String adRules;

	/**
	 * 广告内容。如果广告类型是H5，则传入H5链接地址；如果类型是图片，则传入图片ID标识
	 */
	@ApiField("content")
	private String content;

	/**
	 * 广告类型，目前包括HTML5和图片，分别传入：H5和PIC
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 高度
	 */
	@ApiField("height")
	private String height;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getAdCode() {
		return this.adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}

	public String getAdRules() {
		return this.adRules;
	}
	public void setAdRules(String adRules) {
		this.adRules = adRules;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

}
