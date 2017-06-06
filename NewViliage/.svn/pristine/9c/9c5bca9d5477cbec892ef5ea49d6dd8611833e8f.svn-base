package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单品信息列表
 *
 * @author auto create
 * @since 1.0, 2015-11-06 19:20:17
 */
public class AlipayItemGoodsList extends AlipayObject {

	private static final long serialVersionUID = 6178896335518545238L;

	/**
	 * 单品的描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 单品id列表
	 */
	@ApiListField("goods_list")
	@ApiField("string")
	private List<String> goodsList;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<String> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<String> goodsList) {
		this.goodsList = goodsList;
	}

}
