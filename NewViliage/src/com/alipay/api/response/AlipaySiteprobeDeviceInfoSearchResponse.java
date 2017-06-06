package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.siteprobe.device.info.search response.
 * 
 * @author auto create
 * @since 1.0, 2014-12-18 09:03:39
 */
public class AlipaySiteprobeDeviceInfoSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3658611455548524773L;

	/** 
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 总设备数
&#61548;	设备ID1
&#61550;	BSSID
&#61550;	SSID
&#61550;	密码（可空）
&#61550;	认证ID（可空，白名单必填，OTP不填）
&#61550;	AuthType
&#61550;	ShopID
&#61550;	是否上架
&#61548;	设备ID2
&#61548;	….
	 */
	@ApiField("devices")
	private String devices;

	/** 
	 * 返回码描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 店铺路由器总数
	 */
	@ApiField("total")
	private Long total;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setDevices(String devices) {
		this.devices = devices;
	}
	public String getDevices( ) {
		return this.devices;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
