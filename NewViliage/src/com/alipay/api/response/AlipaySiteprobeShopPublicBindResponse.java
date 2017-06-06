package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.siteprobe.shop.public.bind response.
 * 
 * @author auto create
 * @since 1.0, 2014-12-18 09:03:32
 */
public class AlipaySiteprobeShopPublicBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 7697234553254743718L;

	/** 
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 返回码说明
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 服务窗Logo连接
	 */
	@ApiField("public_logo")
	private String publicLogo;

	/** 
	 * 服务窗名称
	 */
	@ApiField("public_name")
	private String publicName;

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

	public void setPublicLogo(String publicLogo) {
		this.publicLogo = publicLogo;
	}
	public String getPublicLogo( ) {
		return this.publicLogo;
	}

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}
	public String getPublicName( ) {
		return this.publicName;
	}

}
