package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统商通过该接口可以查询单个门店的详细信息，包括门店基础信息，门店状态等信息
 *
 * @author auto create
 * @since 1.0, 2015-12-21 14:31:26
 */
public class AlipayOfflineMarketShopQuerydetailModel extends AlipayObject {

	private static final long serialVersionUID = 1318822761165297471L;

	/**
	 * 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
