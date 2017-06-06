package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品销售规则
 *
 * @author auto create
 * @since 1.0, 2015-12-18 10:53:16
 */
public class AlipayItemSalesRule extends AlipayObject {

	private static final long serialVersionUID = 5611561112939496927L;

	/**
	 * 购买人群限制集合
	 */
	@ApiListField("buyer_crowd_limit")
	@ApiField("string")
	private List<String> buyerCrowdLimit;

	/**
	 * 商品单日销售上限
	 */
	@ApiField("daily_sales_limit")
	private Long dailySalesLimit;

	/**
	 * 用户购买策略
	 */
	@ApiListField("user_sales_limit")
	@ApiField("string")
	private List<String> userSalesLimit;

	public List<String> getBuyerCrowdLimit() {
		return this.buyerCrowdLimit;
	}
	public void setBuyerCrowdLimit(List<String> buyerCrowdLimit) {
		this.buyerCrowdLimit = buyerCrowdLimit;
	}

	public Long getDailySalesLimit() {
		return this.dailySalesLimit;
	}
	public void setDailySalesLimit(Long dailySalesLimit) {
		this.dailySalesLimit = dailySalesLimit;
	}

	public List<String> getUserSalesLimit() {
		return this.userSalesLimit;
	}
	public void setUserSalesLimit(List<String> userSalesLimit) {
		this.userSalesLimit = userSalesLimit;
	}

}
