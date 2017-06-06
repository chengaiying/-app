package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品适用信息
 *
 * @author auto create
 * @since 1.0, 2015-11-06 19:20:18
 */
public class AlipayItemLimitPeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 8575865161585375514L;

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
