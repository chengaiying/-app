package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySiteprobeWifiUnconnectResponse;

/**
 * ALIPAY API: alipay.siteprobe.wifi.unconnect request
 * 
 * @author auto create
 * @since 1.0, 2014-03-20 16:52:09
 */
public class AlipaySiteprobeWifiUnconnectRequest implements AlipayRequest<AlipaySiteprobeWifiUnconnectResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* wifi对应设备的编号
	 */
	private String deviceId;

	/** 
	* wifi设备的mac地址
	 */
	private String deviceMac;

	/** 
	* 合作商户的分店ID
	 */
	private String merchantId;

	/** 
	* 分配和合作方的id
	 */
	private String partnerId;

	/** 
	* 连接wifi的设备的mac地址
	 */
	private String userMac;

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceMac(String deviceMac) {
		this.deviceMac = deviceMac;
	}
	public String getDeviceMac() {
		return this.deviceMac;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantId() {
		return this.merchantId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId() {
		return this.partnerId;
	}

	public void setUserMac(String userMac) {
		this.userMac = userMac;
	}
	public String getUserMac() {
		return this.userMac;
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
		return "alipay.siteprobe.wifi.unconnect";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("device_id", this.deviceId);
		txtParams.put("device_mac", this.deviceMac);
		txtParams.put("merchant_id", this.merchantId);
		txtParams.put("partner_id", this.partnerId);
		txtParams.put("user_mac", this.userMac);
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

	public Class<AlipaySiteprobeWifiUnconnectResponse> getResponseClass() {
		return AlipaySiteprobeWifiUnconnectResponse.class;
	}
}
