package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 为蚂蚁开放日提供奖品等级的判断，后续可以提供给各种场景的奖品发放判断标准。
 *
 * @author auto create
 * @since 1.0, 2015-10-13 15:53:54
 */
public class AlipayPcreditUserLevelGetModel extends AlipayObject {

	private static final long serialVersionUID = 4733328995248497429L;

	/**
	 * 请求来源
	 */
	@ApiField("request_from")
	private String requestFrom;

	/**
	 * 会员编码
	 */
	@ApiField("user_id")
	private String userId;

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
