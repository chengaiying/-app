package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过此接口，商户可以出传入item_id与上下架标识，对商户创建的商品进行上架或下架处理
 *
 * @author auto create
 * @since 1.0, 2015-12-18 10:53:26
 */
public class AlipayOfflineMarketItemListingModel extends AlipayObject {

	private static final long serialVersionUID = 5661685723748256724L;

	/**
	 * 审核规则
	 */
	@ApiField("audit_rule")
	private AlipayItemAuditRule auditRule;

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
	 * 商户通知地址
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
	 * 商品上下架
	 */
	@ApiField("state_type")
	private String stateType;

	public AlipayItemAuditRule getAuditRule() {
		return this.auditRule;
	}
	public void setAuditRule(AlipayItemAuditRule auditRule) {
		this.auditRule = auditRule;
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

	public String getStateType() {
		return this.stateType;
	}
	public void setStateType(String stateType) {
		this.stateType = stateType;
	}

}
