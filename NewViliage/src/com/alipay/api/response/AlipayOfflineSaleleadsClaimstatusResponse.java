package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.saleleads.claimstatus response.
 * 
 * @author auto create
 * @since 1.0, 2015-11-20 19:13:54
 */
public class AlipayOfflineSaleleadsClaimstatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 7126966721638146913L;

	/** 
	 * success(成功);fail(失败)
	 */
	@ApiField("res_msg")
	private String resMsg;

	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	public String getResMsg( ) {
		return this.resMsg;
	}

}
