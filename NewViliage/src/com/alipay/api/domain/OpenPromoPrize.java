package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开放活动接口奖品
 *
 * @author auto create
 * @since 1.0, 2016-01-13 10:09:24
 */
public class OpenPromoPrize extends AlipayObject {

	private static final long serialVersionUID = 6351356768247528464L;

	/**
	 * 消费门槛设置，单位元
	 */
	@ApiField("prize_base_rule_amount")
	private String prizeBaseRuleAmount;

	/**
	 * 奖品详情说明，默认和活动详情相同
	 */
	@ApiField("prize_desc")
	private String prizeDesc;

	/**
	 * 周期性使用时段规则
	 */
	@ApiListField("prize_dimension_time")
	@ApiField("open_promo_prize_dimension")
	private List<OpenPromoPrizeDimension> prizeDimensionTime;

	/**
	 * 券指定可用有效结束日期，和相对可用时间互斥
	 */
	@ApiField("prize_end_time")
	private String prizeEndTime;

	/**
	 * 奖品名称，默认和活动名称相同
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 券相可用对时间，和指定可用时间互斥。
	 */
	@ApiField("prize_relative_time")
	private OpenPromoPrizeRelativeTime prizeRelativeTime;

	/**
	 * 券指定可用开始时间，和相对可用时间互斥
	 */
	@ApiField("prize_start_time")
	private String prizeStartTime;

	/**
	 * 店铺数据，支持多条
	 */
	@ApiListField("prize_suitable_shops")
	@ApiField("string")
	private List<String> prizeSuitableShops;

	/**
	 * 券模板有效结束日期，默认和活动结束时间相同
	 */
	@ApiField("prize_template_end_time")
	private String prizeTemplateEndTime;

	/**
	 * 券模板有效起始日期，默认和活动开始时间相同
	 */
	@ApiField("prize_template_start_time")
	private String prizeTemplateStartTime;

	/**
	 * 奖品类型，现在支持VOUCHER_TICKET：表示代金券
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 抵扣金额，单位元。
	 */
	@ApiField("prize_worth_amount")
	private String prizeWorthAmount;

	public String getPrizeBaseRuleAmount() {
		return this.prizeBaseRuleAmount;
	}
	public void setPrizeBaseRuleAmount(String prizeBaseRuleAmount) {
		this.prizeBaseRuleAmount = prizeBaseRuleAmount;
	}

	public String getPrizeDesc() {
		return this.prizeDesc;
	}
	public void setPrizeDesc(String prizeDesc) {
		this.prizeDesc = prizeDesc;
	}

	public List<OpenPromoPrizeDimension> getPrizeDimensionTime() {
		return this.prizeDimensionTime;
	}
	public void setPrizeDimensionTime(List<OpenPromoPrizeDimension> prizeDimensionTime) {
		this.prizeDimensionTime = prizeDimensionTime;
	}

	public String getPrizeEndTime() {
		return this.prizeEndTime;
	}
	public void setPrizeEndTime(String prizeEndTime) {
		this.prizeEndTime = prizeEndTime;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public OpenPromoPrizeRelativeTime getPrizeRelativeTime() {
		return this.prizeRelativeTime;
	}
	public void setPrizeRelativeTime(OpenPromoPrizeRelativeTime prizeRelativeTime) {
		this.prizeRelativeTime = prizeRelativeTime;
	}

	public String getPrizeStartTime() {
		return this.prizeStartTime;
	}
	public void setPrizeStartTime(String prizeStartTime) {
		this.prizeStartTime = prizeStartTime;
	}

	public List<String> getPrizeSuitableShops() {
		return this.prizeSuitableShops;
	}
	public void setPrizeSuitableShops(List<String> prizeSuitableShops) {
		this.prizeSuitableShops = prizeSuitableShops;
	}

	public String getPrizeTemplateEndTime() {
		return this.prizeTemplateEndTime;
	}
	public void setPrizeTemplateEndTime(String prizeTemplateEndTime) {
		this.prizeTemplateEndTime = prizeTemplateEndTime;
	}

	public String getPrizeTemplateStartTime() {
		return this.prizeTemplateStartTime;
	}
	public void setPrizeTemplateStartTime(String prizeTemplateStartTime) {
		this.prizeTemplateStartTime = prizeTemplateStartTime;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getPrizeWorthAmount() {
		return this.prizeWorthAmount;
	}
	public void setPrizeWorthAmount(String prizeWorthAmount) {
		this.prizeWorthAmount = prizeWorthAmount;
	}

}
