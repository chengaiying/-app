package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayMerchantTicketUseResponse;

/**
 * ALIPAY API: alipay.merchant.ticket.use request
 * 
 * @author auto create
 * @since 1.0, 2015-03-19 16:09:39
 */
public class AlipayMerchantTicketUseRequest implements AlipayRequest<AlipayMerchantTicketUseResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 业务请求的标识信息
	 */
	private String bizInfo;

	/** 
	* 红包发放者商户信息，json格式。商户可以传自己的PID，平台商可以传其它商户的PID用于查询指定商户的信息
目前仅支持如下key：
unique：商户唯一标识
unique_type：支持以下1种取值。
  PID：商户所在平台商的partner id[唯一]
	 */
	private String merchantInfo;

	/** 
	* 商户券的券码，用于标识一张券
	 */
	private String ticketCode;

	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}
	public String getBizInfo() {
		return this.bizInfo;
	}

	public void setMerchantInfo(String merchantInfo) {
		this.merchantInfo = merchantInfo;
	}
	public String getMerchantInfo() {
		return this.merchantInfo;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	public String getTicketCode() {
		return this.ticketCode;
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
		return "alipay.merchant.ticket.use";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_info", this.bizInfo);
		txtParams.put("merchant_info", this.merchantInfo);
		txtParams.put("ticket_code", this.ticketCode);
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

	public Class<AlipayMerchantTicketUseResponse> getResponseClass() {
		return AlipayMerchantTicketUseResponse.class;
	}
}
