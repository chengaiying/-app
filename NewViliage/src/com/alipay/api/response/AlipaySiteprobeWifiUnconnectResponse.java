package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.siteprobe.wifi.unconnect response.
 * 
 * @author auto create
 * @since 1.0, 2014-03-20 16:52:09
 */
public class AlipaySiteprobeWifiUnconnectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7511568563988959338L;

	/** 
	 * 请求响应码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 请求响应描述
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
