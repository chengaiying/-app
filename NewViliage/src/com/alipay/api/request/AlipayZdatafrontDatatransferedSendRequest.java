package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayZdatafrontDatatransferedSendResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.send request
 * 
 * @author auto create
 * @since 1.0, 2015-02-10 09:58:54
 */
public class AlipayZdatafrontDatatransferedSendRequest implements AlipayRequest<AlipayZdatafrontDatatransferedSendResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 数据字段，identity对应的其他数据字段。使用json格式组织，且仅支持字符串类型，其他类型请转为字符串。
	 */
	private String data;

	/** 
	* 合作伙伴的主键数据，同一合作伙伴要保证该字段唯一，若出现重复，后入数据会覆盖先入数据。使用json格式组织，且仅支持字符串类型，其他类型请转为字符串。
	 */
	private String identity;

	/** 
	* 合作伙伴标识字段，用来区分数据来源。建议使用公司域名或公司名。
	 */
	private String typeId;

	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return this.data;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getIdentity() {
		return this.identity;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeId() {
		return this.typeId;
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
		return "alipay.zdatafront.datatransfered.send";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("data", this.data);
		txtParams.put("identity", this.identity);
		txtParams.put("type_id", this.typeId);
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

	public Class<AlipayZdatafrontDatatransferedSendResponse> getResponseClass() {
		return AlipayZdatafrontDatatransferedSendResponse.class;
	}
}
