package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayDataItemDescription;
import com.alipay.api.domain.AlipayDataItemSalesRule;
import com.alipay.api.domain.AlipayDataItemVoucherTemplete;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.product.querydetail response.
 * 
 * @author auto create
 * @since 1.0, 2015-12-21 14:31:35
 */
public class AlipayOfflineMarketProductQuerydetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 2536963913153637424L;

	/** 
	 * 商品首图
	 */
	@ApiField("cover")
	private String cover;

	/** 
	 * 商品描述
	 */
	@ApiListField("descriptions")
	@ApiField("alipay_data_item_description")
	private List<AlipayDataItemDescription> descriptions;

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
	 * 商品状态
	 */
	@ApiField("item_status")
	private String itemStatus;

	/** 
	 * 商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/** 
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */
	@ApiField("pic_coll")
	private String picColl;

	/** 
	 * 商品购买类型 OBTAIN，AUTO_OBTAIN
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/** 
	 * 销售规则
	 */
	@ApiField("sales_rule")
	private AlipayDataItemSalesRule salesRule;

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
	private AlipayDataItemVoucherTemplete voucherTemplete;

	/** 
	 * 商品顺序描述
	 */
	@ApiField("weight")
	private Long weight;

	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getCover( ) {
		return this.cover;
	}

	public void setDescriptions(List<AlipayDataItemDescription> descriptions) {
		this.descriptions = descriptions;
	}
	public List<AlipayDataItemDescription> getDescriptions( ) {
		return this.descriptions;
	}

	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	public Date getGmtEnd( ) {
		return this.gmtEnd;
	}

	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}
	public Date getGmtStart( ) {
		return this.gmtStart;
	}

	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}
	public Long getInventory( ) {
		return this.inventory;
	}

	public void setIsAutoExpanded(Boolean isAutoExpanded) {
		this.isAutoExpanded = isAutoExpanded;
	}
	public Boolean getIsAutoExpanded( ) {
		return this.isAutoExpanded;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public String getItemStatus( ) {
		return this.itemStatus;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType( ) {
		return this.itemType;
	}

	public void setPicColl(String picColl) {
		this.picColl = picColl;
	}
	public String getPicColl( ) {
		return this.picColl;
	}

	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}
	public String getPurchaseMode( ) {
		return this.purchaseMode;
	}

	public void setSalesRule(AlipayDataItemSalesRule salesRule) {
		this.salesRule = salesRule;
	}
	public AlipayDataItemSalesRule getSalesRule( ) {
		return this.salesRule;
	}

	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}
	public List<String> getShopList( ) {
		return this.shopList;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject( ) {
		return this.subject;
	}

	public void setVoucherTemplete(AlipayDataItemVoucherTemplete voucherTemplete) {
		this.voucherTemplete = voucherTemplete;
	}
	public AlipayDataItemVoucherTemplete getVoucherTemplete( ) {
		return this.voucherTemplete;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public Long getWeight( ) {
		return this.weight;
	}

}
