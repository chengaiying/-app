package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 为服务窗合作伙伴（如YunOS），提供查询所有服务窗的菜单的功能
 *
 * @author auto create
 * @since 1.0, 2015-12-18 11:34:54
 */
public class AlipayOpenPublicPartnerMenuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4351182148251513266L;

	/**
	 * 服务窗id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
