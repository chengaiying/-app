package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 系统商需要通过该接口在口碑平台帮助商户创建商品。
 *
 * @author auto create
 * @since 1.0, 2016-01-04 10:51:03
 */
public class AlipayOfflineMarketItemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3544813843991378148L;

	/**
	 * 审核规则
	 */
	@ApiField("audit_rule")
	private AlipayItemAuditRule auditRule;

	/**
	 * 商品首图
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 商品描述
	 */
	@ApiListField("descriptions")
	@ApiField("alipay_item_description")
	private List<AlipayItemDescription> descriptions;

	/**
	 * 商品下架时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 商品生效时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 商品库存数量
	 */
	@ApiField("inventory")
	private Long inventory;

	/**
	 * 是否自动延期，默认true
	 */
	@ApiField("is_auto_expanded")
	private Boolean isAutoExpanded;

	/**
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

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
	 * 商品购买类型 OBTAIN，AUTO_OBTAIN
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

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
	 * 上架门店id
	 */
	@ApiListField("shop_list")
	@ApiField("string")
	private List<String> shopList;

	/**
	 * 商品的标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 券模板信息
	 */
	@ApiField("voucher_templete")
	private AlipayItemVoucherTemplete voucherTemplete;

	/**
	 * 商品顺序描述
	 */
	@ApiField("weight")
	private Long weight;

	public AlipayItemAuditRule getAuditRule() {
		return this.auditRule;
	}
	public void setAuditRule(AlipayItemAuditRule auditRule) {
		this.auditRule = auditRule;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public List<AlipayItemDescription> getDescriptions() {
		return this.descriptions;
	}
	public void setDescriptions(List<AlipayItemDescription> descriptions) {
		this.descriptions = descriptions;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public Long getInventory() {
		return this.inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}

	public Boolean getIsAutoExpanded() {
		return this.isAutoExpanded;
	}
	public void setIsAutoExpanded(Boolean isAutoExpanded) {
		this.isAutoExpanded = isAutoExpanded;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
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

	public String getPurchaseMode() {
		return this.purchaseMode;
	}
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
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

	public List<String> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AlipayItemVoucherTemplete getVoucherTemplete() {
		return this.voucherTemplete;
	}
	public void setVoucherTemplete(AlipayItemVoucherTemplete voucherTemplete) {
		this.voucherTemplete = voucherTemplete;
	}

	public Long getWeight() {
		return this.weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}

}
