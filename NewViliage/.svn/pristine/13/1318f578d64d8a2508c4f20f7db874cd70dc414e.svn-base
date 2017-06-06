package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于查询用户数据
 *
 * @author auto create
 * @since 1.0, 2015-09-08 14:17:14
 */
public class Data extends AlipayObject {

	private static final long serialVersionUID = 1734893511547381477L;

	/**
	 * 用户id列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
