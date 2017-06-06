package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品适用信息(数据)
 *
 * @author auto create
 * @since 1.0, 2015-10-30 10:11:15
 */
public class AlipayDataItemLimitPeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 4412977412713672557L;

	/**
	 * 区间范围枚举
	 */
	@ApiField("rule")
	private String rule;

	/**
	 * 单位描述
	 */
	@ApiField("unit")
	private String unit;

	/**
	 * 区间范围值
	 */
	@ApiListField("value")
	@ApiField("number")
	private List<Long> value;

	public String getRule() {
		return this.rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	public List<Long> getValue() {
		return this.value;
	}
	public void setValue(List<Long> value) {
		this.value = value;
	}

}
