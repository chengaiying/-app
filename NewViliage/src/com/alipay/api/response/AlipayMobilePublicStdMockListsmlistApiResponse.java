package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ListListSmMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.listsmlist.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-10-09 17:57:31
 */
public class AlipayMobilePublicStdMockListsmlistApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 8854222641178886581L;

	/** 
	 * 简单对象嵌套List
	 */
	@ApiListField("list_sm_model_list")
	@ApiField("list_list_sm_mock_model")
	private List<ListListSmMockModel> listSmModelList;

	public void setListSmModelList(List<ListListSmMockModel> listSmModelList) {
		this.listSmModelList = listSmModelList;
	}
	public List<ListListSmMockModel> getListSmModelList( ) {
		return this.listSmModelList;
	}

}
