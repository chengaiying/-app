package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.siteprobe.shop.info.update response.
 * 
 * @author auto create
 * @since 1.0, 2014-12-18 09:04:22
 */
public class AlipaySiteprobeShopInfoUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5599158867976213957L;

	/** 
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 返回值描述
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
