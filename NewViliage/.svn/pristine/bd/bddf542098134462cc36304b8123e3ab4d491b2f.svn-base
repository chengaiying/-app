package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户可以通过此接口对商品进行库存等信息的修改（库存修改值只能大于当前值）
 *
 * @author auto create
 * @since 1.0, 2015-12-18 10:53:16
 */
public class AlipayOfflineMarketItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2786359243718892114L;

	/**
	 * 审核规则
	 */
	@ApiField("audit_rule")
	private AlipayItemAuditRule auditRule;

	/**
	 * 商品失效时间，只能延长，不能缩短
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 库存
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户接口异步通知的地址
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 商品操作上下文
	 */
	@ApiField("operation_context")
	private AlipayItemOperationContext operationContext;

	/**
	 * 请求id，必须保证单商户下唯一
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售规则
	 */
	@ApiField("sales_rule")
	private AlipayItemSalesRule salesRule;

	/**
	 * 商品展示权重
	 */
	@ApiField("weight")
	private Long weight;

	public AlipayItemAuditRule getAuditRule() {
		return this.auditRule;
	}
	public void setAuditRule(AlipayItemAuditRule auditRule) {
		this.auditRule = auditRule;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
	}
	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}

	public AlipayItemOperationContext getOperationContext() {
		return this.operationContext;
	}
	public void setOperationContext(AlipayItemOperationContext operationContext) {
		this.operationContext = operationContext;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AlipayItemSalesRule getSalesRule() {
		return this.salesRule;
	}
	public void setSalesRule(AlipayItemSalesRule salesRule) {
		this.salesRule = salesRule;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
