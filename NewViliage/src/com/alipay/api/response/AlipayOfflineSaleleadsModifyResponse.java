package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.saleleads.modify response.
 * 
 * @author auto create
 * @since 1.0, 2015-11-20 19:13:43
 */
public class AlipayOfflineSaleleadsModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4338264964757521821L;

	/** 
	 * 被修改leadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

}
