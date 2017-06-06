package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayDataBillDownloadurlGetResponse;

/**
 * ALIPAY API: alipay.data.bill.downloadurl.get request
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:17:00
 */
public class AlipayDataBillDownloadurlGetRequest implements AlipayRequest<AlipayDataBillDownloadurlGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 账单时间：日账单格式为yyyy-MM-dd,月账单格式为yyyy-MM
	 */
	private String billDate;

	/** 
	* 账单类型，目前支持的类型有：air
	 */
	private String billType;

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate() {
		return this.billDate;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getBillType() {
		return this.billType;
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
		return "alipay.data.bill.downloadurl.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("bill_date", this.billDate);
		txtParams.put("bill_type", this.billType);
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

	public Class<AlipayDataBillDownloadurlGetResponse> getResponseClass() {
		return AlipayDataBillDownloadurlGetResponse.class;
	}
}
