package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品券模板
 *
 * @author auto create
 * @since 1.0, 2015-11-06 19:20:18
 */
public class AlipayItemVoucherTemplete extends AlipayObject {

	private static final long serialVersionUID = 7235545889363945916L;

	/**
	 * 延迟生效时间
	 */
	@ApiField("delay_minute")
	private Long delayMinute;

	/**
	 * 券使用规则描述
	 */
	@ApiListField("desc_details")
	@ApiField("alipay_item_description")
	private List<AlipayItemDescription> descDetails;

	/**
	 * 折扣率
	 */
	@ApiField("discount_rate")
	private Long discountRate;

	/**
	 * 外部单品列表
	 */
	@ApiField("external_goods_list")
	private AlipayItemGoodsList externalGoodsList;

	/**
	 * 使用规则说明
	 */
	@ApiListField("limit_period_info_list")
	@ApiField("alipay_item_limit_period_info")
	private List<AlipayItemLimitPeriodInfo> limitPeriodInfoList;

	/**
	 * 商品原金额
	 */
	@ApiField("original_amount")
	private Long originalAmount;

	/**
	 * 券原折扣
	 */
	@ApiField("original_rate")
	private Long originalRate;

	/**
	 * 减至金额，代表券可抵扣至多少
	 */
	@ApiField("reduce_to_amount")
	private Long reduceToAmount;

	/**
	 * 折扣金额取整规则
	 */
	@ApiField("rounding_rule")
	private String roundingRule;

	/**
	 * 起步金额
	 */
	@ApiField("threshold_amount")
	private Long thresholdAmount;

	/**
	 * 起步数量，用于指定可享受优惠的起步单品购买数量
	 */
	@ApiField("threshold_quantity")
	private Long thresholdQuantity;

	/**
	 * 有效期，单位：分钟
	 */
	@ApiField("valid_period")
	private Long validPeriod;

	/**
	 * 价值金额
CASH类型为代金券金额
DISCOUNT类型为优惠封顶金额
	 */
	@ApiField("value_amount")
	private Long valueAmount;

	/**
	 * 券的描述信息
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public Long getDelayMinute() {
		return this.delayMinute;
	}
	public void setDelayMinute(Long delayMinute) {
		this.delayMinute = delayMinute;
	}

	public List<AlipayItemDescription> getDescDetails() {
		return this.descDetails;
	}
	public void setDescDetails(List<AlipayItemDescription> descDetails) {
		this.descDetails = descDetails;
	}

	public Long getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(Long discountRate) {
		this.discountRate = discountRate;
	}

	public AlipayItemGoodsList getExternalGoodsList() {
		return this.externalGoodsList;
	}
	public void setExternalGoodsList(AlipayItemGoodsList externalGoodsList) {
		this.externalGoodsList = externalGoodsList;
	}

	public List<AlipayItemLimitPeriodInfo> getLimitPeriodInfoList() {
		return this.limitPeriodInfoList;
	}
	public void setLimitPeriodInfoList(List<AlipayItemLimitPeriodInfo> limitPeriodInfoList) {
		this.limitPeriodInfoList = limitPeriodInfoList;
	}

	public Long getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(Long originalAmount) {
		this.originalAmount = originalAmount;
	}

	public Long getOriginalRate() {
		return this.originalRate;
	}
	public void setOriginalRate(Long originalRate) {
		this.originalRate = originalRate;
	}

	public Long getReduceToAmount() {
		return this.reduceToAmount;
	}
	public void setReduceToAmount(Long reduceToAmount) {
		this.reduceToAmount = reduceToAmount;
	}

	public String getRoundingRule() {
		return this.roundingRule;
	}
	public void setRoundingRule(String roundingRule) {
		this.roundingRule = roundingRule;
	}

	public Long getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(Long thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public Long getThresholdQuantity() {
		return this.thresholdQuantity;
	}
	public void setThresholdQuantity(Long thresholdQuantity) {
		this.thresholdQuantity = thresholdQuantity;
	}

	public Long getValidPeriod() {
		return this.validPeriod;
	}
	public void setValidPeriod(Long validPeriod) {
		this.validPeriod = validPeriod;
	}

	public Long getValueAmount() {
		return this.valueAmount;
	}
	public void setValueAmount(Long valueAmount) {
		this.valueAmount = valueAmount;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
