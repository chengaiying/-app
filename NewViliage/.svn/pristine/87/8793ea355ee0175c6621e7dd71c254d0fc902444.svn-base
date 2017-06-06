package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统商需要通过该接口在口碑平台帮助商户创建门店信息。
 *
 * @author auto create
 * @since 1.0, 2015-12-17 23:34:21
 */
public class OfflineMarketShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7463546156159392686L;

	/**
	 * 门店详细地址，注：不含省市区
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店审核时需要的图片，至少包含一张门头照片，两张内景照片，必须反映真实的门店情况，审核才能够通过；多个图片之间以英文逗号分隔；
	 */
	@ApiField("audit_images")
	private String auditImages;

	/**
	 * 门店授权函,营业执照与签约账号主体不一致时需要
	 */
	@ApiField("auth_letter")
	private String authLetter;

	/**
	 * 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写；单位元，不需填写单位；
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/**
	 * 是否有包厢，T表示有包厢，F表示无包厢；不传值默认F
	 */
	@ApiField("box")
	private String box;

	/**
	 * 分店名
	 */
	@ApiField("branch_shop_name")
	private String branchShopName;

	/**
	 * 品牌Logo，不填写则默认为门店首图main_image
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 品牌名，不填写则默认为“其它品牌”
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 经营许可证，只有餐饮类目需要
	 */
	@ApiField("business_certificate")
	private String businessCertificate;

	/**
	 * 经营许可证有效期，格式：2020-03-20，只有餐饮类目需要
	 */
	@ApiField("business_certificate_expires")
	private String businessCertificateExpires;

	/**
	 * 营业时间，支持分段营业时间，以英文逗号分隔
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 类目编号
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 城市编码，国标码，详见国家统计局数据
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店电话号码，支持座机和手机，在客户端对用户展现，支持多个电话，以英文逗号分隔
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 店铺创建者，非授权模式必填，必须是服务商合法员工
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 区县编码，国标码，详见国家统计局数据
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 机具号，多个之间以英文逗号分隔
	 */
	@ApiField("implement_id")
	private String implementId;

	/**
	 * 是否在其他平台开店，T表示有开店，F表示未开店，用于证明其开店资质，如无营业执照必须有在其他平台的开店资质才能入住口碑平台，其他平台主要包括美团、点评。
	 */
	@ApiField("is_operating_online")
	private String isOperatingOnline;

	/**
	 * 标明该门店是由哪个ISV UID创建的，如果有口碑签订了返佣协议，则该字段作为返佣数据提取的依据
	 */
	@ApiField("isv_uid")
	private String isvUid;

	/**
	 * 纬度，注：高德坐标系，需要服务商引导用户校准经纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 门店营业执照图片，营业执照信息与is_operating_online至少填一项
	 */
	@ApiField("licence")
	private String licence;

	/**
	 * 门店营业执照编号，营业执照信息与is_operating_online至少填一项
	 */
	@ApiField("licence_code")
	private String licenceCode;

	/**
	 * 营业执照过期时间
	 */
	@ApiField("licence_expires")
	private String licenceExpires;

	/**
	 * 门店营业执照名称
	 */
	@ApiField("licence_name")
	private String licenceName;

	/**
	 * 经度，注：高德坐标系，需要服务商引导用户校准经纬度
	 */
	@ApiField("longitude")
	private Long longitude;

	/**
	 * 门店首图，非常重要，推荐尺寸2000*1500
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 主门店名
	 */
	@ApiField("main_shop_name")
	private String mainShopName;

	/**
	 * 无烟区，T表示禁烟，F表示不禁烟；不传值默认F
	 */
	@ApiField("no_smoking")
	private String noSmoking;

	/**
	 * 门店店长电话号码，用于接收门店状态变更通知，收款成功通知等通知消息，不在客户端展示
	 */
	@ApiField("notify_mobile")
	private String notifyMobile;

	/**
	 * 在其他平台的开店图片
	 */
	@ApiField("online_image")
	private String onlineImage;

	/**
	 * 当商户的门店审核状态发生变化时，会向该地址推送消息
	 */
	@ApiField("operate_notify_url")
	private String operateNotifyUrl;

	/**
	 * 门店是否支持停车，T表示支持，F表示不支持，不传默认为F
	 */
	@ApiField("parking")
	private String parking;

	/**
	 * 商户ID, 在某些开放场景下，不走授权模式，无法在上下文中获取商户ID, 需要显示传入商户ID参数
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 省份编码，国标码，详见国家统计局数据
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 请求ID，标识本次创建请求；
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 外部门店编号
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店其他的服务，门店与用户线下兑现
	 */
	@ApiField("value_added")
	private String valueAdded;

	/**
	 * 门店是否支持WIFI，T表示支持，F表示不支持，不传默认为F
	 */
	@ApiField("wifi")
	private String wifi;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAuditImages() {
		return this.auditImages;
	}
	public void setAuditImages(String auditImages) {
		this.auditImages = auditImages;
	}

	public String getAuthLetter() {
		return this.authLetter;
	}
	public void setAuthLetter(String authLetter) {
		this.authLetter = authLetter;
	}

	public String getAvgPrice() {
		return this.avgPrice;
	}
	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getBox() {
		return this.box;
	}
	public void setBox(String box) {
		this.box = box;
	}

	public String getBranchShopName() {
		return this.branchShopName;
	}
	public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBusinessCertificate() {
		return this.businessCertificate;
	}
	public void setBusinessCertificate(String businessCertificate) {
		this.businessCertificate = businessCertificate;
	}

	public String getBusinessCertificateExpires() {
		return this.businessCertificateExpires;
	}
	public void setBusinessCertificateExpires(String businessCertificateExpires) {
		this.businessCertificateExpires = businessCertificateExpires;
	}

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getImplementId() {
		return this.implementId;
	}
	public void setImplementId(String implementId) {
		this.implementId = implementId;
	}

	public String getIsOperatingOnline() {
		return this.isOperatingOnline;
	}
	public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}

	public String getIsvUid() {
		return this.isvUid;
	}
	public void setIsvUid(String isvUid) {
		this.isvUid = isvUid;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLicence() {
		return this.licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getLicenceCode() {
		return this.licenceCode;
	}
	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}

	public String getLicenceExpires() {
		return this.licenceExpires;
	}
	public void setLicenceExpires(String licenceExpires) {
		this.licenceExpires = licenceExpires;
	}

	public String getLicenceName() {
		return this.licenceName;
	}
	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}

	public Long getLongitude() {
		return this.longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getMainShopName() {
		return this.mainShopName;
	}
	public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}

	public String getNoSmoking() {
		return this.noSmoking;
	}
	public void setNoSmoking(String noSmoking) {
		this.noSmoking = noSmoking;
	}

	public String getNotifyMobile() {
		return this.notifyMobile;
	}
	public void setNotifyMobile(String notifyMobile) {
		this.notifyMobile = notifyMobile;
	}

	public String getOnlineImage() {
		return this.onlineImage;
	}
	public void setOnlineImage(String onlineImage) {
		this.onlineImage = onlineImage;
	}

	public String getOperateNotifyUrl() {
		return this.operateNotifyUrl;
	}
	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}

	public String getParking() {
		return this.parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getValueAdded() {
		return this.valueAdded;
	}
	public void setValueAdded(String valueAdded) {
		this.valueAdded = valueAdded;
	}

	public String getWifi() {
		return this.wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

}
