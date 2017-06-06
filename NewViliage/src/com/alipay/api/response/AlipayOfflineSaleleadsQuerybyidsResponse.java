package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantSaleLeadsQueryDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.saleleads.querybyids response.
 * 
 * @author auto create
 * @since 1.0, 2015-11-16 19:30:24
 */
public class AlipayOfflineSaleleadsQuerybyidsResponse extends AlipayResponse {

	private static final long serialVersionUID = 2887726691876167171L;

	/** 
	 * 查询Leads信息对象集合
	 */
	@ApiListField("merchantsaleleadsquerylist")
	@ApiField("merchant_sale_leads_query_d_t_o")
	private List<MerchantSaleLeadsQueryDTO> merchantsaleleadsquerylist;

	public void setMerchantsaleleadsquerylist(List<MerchantSaleLeadsQueryDTO> merchantsaleleadsquerylist) {
		this.merchantsaleleadsquerylist = merchantsaleleadsquerylist;
	}
	public List<MerchantSaleLeadsQueryDTO> getMerchantsaleleadsquerylist( ) {
		return this.merchantsaleleadsquerylist;
	}

}
