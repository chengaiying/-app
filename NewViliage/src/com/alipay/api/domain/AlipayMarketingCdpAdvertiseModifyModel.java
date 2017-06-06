package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给ISV、开发者修改广告的接口，修改广告后投放渠道包括钱包APP，聚牛APP等，投放支持的APP应用
 *
 * @author auto create
 * @since 1.0, 2015-11-05 11:34:25
 */
public class AlipayMarketingCdpAdvertiseModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4792199958286544272L;

	/**
	 * 行为地址。用户点击广告后，跳转URL地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 广告ID
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * 广告内容
	 */
	@ApiField("content")
	private String content;

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

	public String getAdId() {
		return this.adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

}
