package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMemberCouponQuerydetailResponse;

/**
 * ALIPAY API: alipay.member.coupon.querydetail request
 * 
 * @author auto create
 * @since 1.0, 2014-11-19 15:53:06
 */
public class AlipayMemberCouponQuerydetailRequest implements AlipayRequest<AlipayMemberCouponQuerydetailResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 红包编号
	 */
	private String couponNo;

	/** 
	* 红包发放者商户信息，json格式。商户可以传自己的PID，平台商可以传其它商户的PID用于查询指定商户的信息
目前仅支持如下key：
	unique：商户唯一标识
	unique_type：支持以下1种取值。
PID：商户所在平台商的partner id[唯一]
	 */
	private String merchantInfo;

	/** 
	* 劵所有者买家用户信息，必须是支付宝的用户，json格式。
目前仅支持如下key：
	unique：用户唯一标识
	unique_type：支持以下1种取值。
UID：用户支付宝账户的唯一ID
OPENID：用户支付宝账户在某商户下的唯一ID
	 */
	private String userInfo;

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}
	public String getCouponNo() {
		return this.couponNo;
	}

	public void setMerchantInfo(String merchantInfo) {
		this.merchantInfo = merchantInfo;
	}
	public String getMerchantInfo() {
		return this.merchantInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public String getUserInfo() {
		return this.userInfo;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.member.coupon.querydetail";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("coupon_no", this.couponNo);
		txtParams.put("merchant_info", this.merchantInfo);
		txtParams.put("user_info", this.userInfo);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayMemberCouponQuerydetailResponse> getResponseClass() {
		return AlipayMemberCouponQuerydetailResponse.class;
	}
}
