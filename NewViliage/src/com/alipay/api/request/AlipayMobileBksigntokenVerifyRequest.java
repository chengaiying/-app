package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMobileBksigntokenVerifyResponse;

/**
 * ALIPAY API: alipay.mobile.bksigntoken.verify request
 * 
 * @author auto create
 * @since 1.0, 2015-06-18 15:23:55
 */
public class AlipayMobileBksigntokenVerifyRequest implements AlipayRequest<AlipayMobileBksigntokenVerifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 设备标识
	 */
	private String deviceid;

	/** 
	* 调用来源
	 */
	private String source;

	/** 
	* 查询token
	 */
	private String token;

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDeviceid() {
		return this.deviceid;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource() {
		return this.source;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken() {
		return this.token;
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
		return "alipay.mobile.bksigntoken.verify";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("deviceid", this.deviceid);
		txtParams.put("source", this.source);
		txtParams.put("token", this.token);
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

	public Class<AlipayMobileBksigntokenVerifyResponse> getResponseClass() {
		return AlipayMobileBksigntokenVerifyResponse.class;
	}
}
