package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstoreUser;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.siteprobe.instore.user response.
 * 
 * @author auto create
 * @since 1.0, 2014-03-20 16:45:41
 */
public class AlipaySiteprobeInstoreUserResponse extends AlipayResponse {

	private static final long serialVersionUID = 3836945878328885112L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 到店用户数据
	 */
	@ApiListField("users")
	@ApiField("instore_user")
	private List<InstoreUser> users;

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

	public void setUsers(List<InstoreUser> users) {
		this.users = users;
	}
	public List<InstoreUser> getUsers( ) {
		return this.users;
	}

}
