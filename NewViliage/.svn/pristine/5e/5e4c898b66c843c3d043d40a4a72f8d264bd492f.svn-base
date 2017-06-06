package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过该接口可以查询商户录入的指定商品详细信息
 *
 * @author auto create
 * @since 1.0, 2015-12-21 14:31:35
 */
public class AlipayOfflineMarketProductQuerydetailModel extends AlipayObject {

	private static final long serialVersionUID = 1557455748377694624L;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER
	 */
	@ApiField("op_role")
	private String opRole;

	/**
	 * 门店id，服务商调用时必须传递
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

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
