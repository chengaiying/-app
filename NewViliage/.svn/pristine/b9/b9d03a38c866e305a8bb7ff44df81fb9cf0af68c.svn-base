package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayAssetAccountUnbindResponse;

/**
 * ALIPAY API: alipay.asset.account.unbind request
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:17:01
 */
public class AlipayAssetAccountUnbindRequest implements AlipayRequest<AlipayAssetAccountUnbindResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务参数 使用该app提供用户信息的商户在支付宝签约时的支付宝账户userID，可以和app相同。
	 */
	private String providerId;

	/** 
	* 用户在商户网站的会员标识。商户需确保其唯一性，不可变更。
	 */
	private String providerUserId;

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderUserId(String providerUserId) {
		this.providerUserId = providerUserId;
	}
	public String getProviderUserId() {
		return this.providerUserId;
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
		return "alipay.asset.account.unbind";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("provider_id", this.providerId);
		txtParams.put("provider_user_id", this.providerUserId);
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

	public Class<AlipayAssetAccountUnbindResponse> getResponseClass() {
		return AlipayAssetAccountUnbindResponse.class;
	}
}
