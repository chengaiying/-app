package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻分分段
 *
 * @author auto create
 * @since 1.0, 2015-07-20 13:58:11
 */
public class AlipayZmScoreZrankResult extends AlipayObject {

	private static final long serialVersionUID = 5786872248355374918L;

	/**
	 * 芝麻分分段 Z1-Z7
	 */
	@ApiField("zrank")
	private String zrank;

	public String getZrank() {
		return this.zrank;
	}
	public void setZrank(String zrank) {
		this.zrank = zrank;
	}

}
