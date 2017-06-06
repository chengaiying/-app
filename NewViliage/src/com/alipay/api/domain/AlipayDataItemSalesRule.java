package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品销售规则(数据)
 *
 * @author auto create
 * @since 1.0, 2015-10-30 10:11:15
 */
public class AlipayDataItemSalesRule extends AlipayObject {

	private static final long serialVersionUID = 1231648873932137137L;

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
