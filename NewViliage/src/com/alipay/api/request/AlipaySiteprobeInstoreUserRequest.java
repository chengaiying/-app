package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySiteprobeInstoreUserResponse;

/**
 * ALIPAY API: alipay.siteprobe.instore.user request
 * 
 * @author auto create
 * @since 1.0, 2014-03-20 16:45:41
 */
public class AlipaySiteprobeInstoreUserRequest implements AlipayRequest<AlipaySiteprobeInstoreUserResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 合作商户的分店ID
	 */
	private String merchantId;

	/** 
	* 是否查询当天生日
	 */
	private Boolean needBirthday;

	/** 
	* 分配给公众号的ID
	 */
	private String publicId;

	/** 
	* 支付宝用户的uesrid
	 */
	private String userId;

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId() {
		return this.merchantId;
	}

	public void setNeedBirthday(Boolean needBirthday) {
		this.needBirthday = needBirthday;
	}
	public Boolean getNeedBirthday() {
		return this.needBirthday;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId() {
		return this.publicId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
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
		return "alipay.siteprobe.instore.user";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("merchant_id", this.merchantId);
		txtParams.put("need_birthday", this.needBirthday);
		txtParams.put("public_id", this.publicId);
		txtParams.put("user_id", this.userId);
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

	public Class<AlipaySiteprobeInstoreUserResponse> getResponseClass() {
		return AlipaySiteprobeInstoreUserResponse.class;
	}
}
