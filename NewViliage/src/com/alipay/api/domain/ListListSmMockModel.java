package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 简单模型嵌套list
 *
 * @author auto create
 * @since 1.0, 2015-05-06 15:42:17
 */
public class ListListSmMockModel extends AlipayObject {

	private static final long serialVersionUID = 7832611754417318711L;

	/**
	 * 简单模型列表
	 */
	@ApiListField("list_simple_model_list")
	@ApiField("simple_mock_model")
	private List<SimpleMockModel> listSimpleModelList;

	public List<SimpleMockModel> getListSimpleModelList() {
		return this.listSimpleModelList;
	}
	public void setListSimpleModelList(List<SimpleMockModel> listSimpleModelList) {
		this.listSimpleModelList = listSimpleModelList;
	}

}
