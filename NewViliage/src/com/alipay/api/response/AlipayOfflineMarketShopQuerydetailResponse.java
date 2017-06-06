package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.querydetail response.
 * 
 * @author auto create
 * @since 1.0, 2015-12-21 14:31:26
 */
public class AlipayOfflineMarketShopQuerydetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 5495639867763928493L;

	/** 
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 审核描述
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 店铺图片列表
	 */
	@ApiField("audit_images")
	private String auditImages;

	/** 
	 * 审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 授权函
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/** 
	 * 平均价格
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/** 
	 * 是否有包厢
	 */
	@ApiField("box")
	private String box;

	/** 
	 * 分店名称
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/** 
	 * 品牌LOGO
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/** 
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/** 
	 * 经营许可证图片id
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/** 
	 * 经营许可证有效期，yyyymmdd日期格式，或者“长期”字符串
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/** 
	 * 营业时间
	 */
	@ApiField("business_time")
	private String businessTime;

	/** 
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 联系方式
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/** 
	 * 区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 机具号
	 */
	@ApiField("implement_id")
	private String implementId;

	/** 
	 * 是否上线
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 是否第三方平台已上线
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/** 
	 * 是否展示
	 */
	@ApiField("is_show")
	private String isShow;

	/** 
	 * 服务提供商uid
	 */
	@ApiField("isv_uid")
	private String isvUid;

	/** 
	 * 维度
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 营业执照
	 */
	@ApiField("licence")
	private String licence;

	/** 
	 * 营业执照编号
	 */
	@ApiField("licence_code")
	private String licenceCode;

	/** 
	 * 执照名称
	 */
	@ApiField("licence_name")
	private String licenceName;

	/** 
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 首页图片地址key
	 */
	@ApiField("main_image")
	private String mainImage;

	/** 
	 * 总店名称
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/** 
	 * 是否禁止吸烟
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/** 
	 * 接收收款成功消息的手机号，可以支持多个手机号,多条通过“,”分割
	 */
	@ApiField("notify_mobile")
	private String notifyMobile;

	/** 
	 * 第三方平台上线图片列表
	 */
	@ApiField("online_image")
	private String onlineImage;

	/** 
	 * 通知地址
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/** 
	 * 是否支持停车场
	 */
	@ApiField("parking")
	private String parking;

	/** 
	 * 收款账户
	 */
	@ApiField("payment_account")
	private String paymentAccount;

	/** 
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */
	@ApiField("pic_coll")
	private String picColl;

	/** 
	 * 经过加工后的门店收款二维码
	 */
	@ApiField("processed_qr_code")
	private String processedQrCode;

	/** 
	 * 服务商小二支付宝pid
	 */
	@ApiField("provider_xiaoer_uid")
	private String providerXiaoerUid;

	/** 
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 门店收款二维码裸码
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 外部门店号
	 */
	@ApiField("store_id")
	private String storeId;

	/** 
	 * 附加属性
	 */
	@ApiField("value_added")
	private String valueAdded;

	/** 
	 * 是否支持无线
	 */
	@ApiField("wifi")
	private String wifi;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditImages(String auditImages) {
		this.auditImages = auditImages;
	}
	public String getAuditImages( ) {
		return this.auditImages;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setAuthLetter(String authLetter) {
		this.authLetter = authLetter;
	}
	public String getAuthLetter( ) {
		return this.authLetter;
	}

	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}
	public String getAvgPrice( ) {
		return this.avgPrice;
	}

	public void setBox(String box) {
		this.box = box;
	}
	public String getBox( ) {
		return this.box;
	}

	public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}
	public String getBranchShopName( ) {
		return this.branchShopName;
	}

	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}
	public String getBrandLogo( ) {
		return this.brandLogo;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName( ) {
		return this.brandName;
	}

	public void setBusinessCertificate(String businessCertificate) {
		this.businessCertificate = businessCertificate;
	}
	public String getBusinessCertificate( ) {
		return this.businessCertificate;
	}

	public void setBusinessCertificateExpires(String businessCertificateExpires) {
		this.businessCertificateExpires = businessCertificateExpires;
	}
	public String getBusinessCertificateExpires( ) {
		return this.businessCertificateExpires;
	}

	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}
	public String getBusinessTime( ) {
		return this.businessTime;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactNumber( ) {
		return this.contactNumber;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setImplementId(String implementId) {
		this.implementId = implementId;
	}
	public String getImplementId( ) {
		return this.implementId;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	public String getIsOnline( ) {
		return this.isOnline;
	}

	public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}
	public String getIsOperatingOnline( ) {
		return this.isOperatingOnline;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getIsShow( ) {
		return this.isShow;
	}

	public void setIsvUid(String isvUid) {
		this.isvUid = isvUid;
	}
	public String getIsvUid( ) {
		return this.isvUid;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getLicence( ) {
		return this.licence;
	}

	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}
	public String getLicenceCode( ) {
		return this.licenceCode;
	}

	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}
	public String getLicenceName( ) {
		return this.licenceName;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	public String getMainImage( ) {
		return this.mainImage;
	}

	public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}
	public String getMainShopName( ) {
		return this.mainShopName;
	}

	public void setNoSmoking(String noSmoking) {
		this.noSmoking = noSmoking;
	}
	public String getNoSmoking( ) {
		return this.noSmoking;
	}

	public void setNotifyMobile(String notifyMobile) {
		this.notifyMobile = notifyMobile;
	}
	public String getNotifyMobile( ) {
		return this.notifyMobile;
	}

	public void setOnlineImage(String onlineImage) {
		this.onlineImage = onlineImage;
	}
	public String getOnlineImage( ) {
		return this.onlineImage;
	}

	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}
	public String getOperateNotifyUrl( ) {
		return this.operateNotifyUrl;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getParking( ) {
		return this.parking;
	}

	public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	public String getPaymentAccount( ) {
		return this.paymentAccount;
	}

	public void setPicColl(String picColl) {
		this.picColl = picColl;
	}
	public String getPicColl( ) {
		return this.picColl;
	}

	public void setProcessedQrCode(String processedQrCode) {
		this.processedQrCode = processedQrCode;
	}
	public String getProcessedQrCode( ) {
		return this.processedQrCode;
	}

	public void setProviderXiaoerUid(String providerXiaoerUid) {
		this.providerXiaoerUid = providerXiaoerUid;
	}
	public String getProviderXiaoerUid( ) {
		return this.providerXiaoerUid;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

	public void setValueAdded(String valueAdded) {
		this.valueAdded = valueAdded;
	}
	public String getValueAdded( ) {
		return this.valueAdded;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getWifi( ) {
		return this.wifi;
	}

}
