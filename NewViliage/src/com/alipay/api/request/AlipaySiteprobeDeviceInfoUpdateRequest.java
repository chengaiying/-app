package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySiteprobeDeviceInfoUpdateResponse;

/**
 * ALIPAY API: alipay.siteprobe.device.info.update request
 * 
 * @author auto create
 * @since 1.0, 2014-12-18 09:03:52
 */
public class AlipaySiteprobeDeviceInfoUpdateRequest implements AlipayRequest<AlipaySiteprobeDeviceInfoUpdateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* Json格式的业务参数，其中:
device_id ：设备Id
ssid ：WiFi名称
bssid ：路由器mac地址（必须）
password ：路由器密码
auth_type ： 认证类型
auth_id ：认证子类型ID，可空，白名单必填，OTP不填
shop_id ：店铺Id
status ：1 - 上架，2 - 不上架
	 */
	private String bizContent;

	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}
	public String getBizContent() {
		return this.bizContent;
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
		return "alipay.siteprobe.device.info.update";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_content", this.bizContent);
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

	public Class<AlipaySiteprobeDeviceInfoUpdateResponse> getResponseClass() {
		return AlipaySiteprobeDeviceInfoUpdateResponse.class;
	}
}
