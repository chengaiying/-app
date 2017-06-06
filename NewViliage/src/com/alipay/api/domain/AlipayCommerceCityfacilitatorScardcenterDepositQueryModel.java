package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询用户的充值转账记录
 *
 * @author auto create
 * @since 1.0, 2015-12-15 11:37:56
 */
public class AlipayCommerceCityfacilitatorScardcenterDepositQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4448589917169269569L;

	/**
	 * 交通卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 和渠道定义的卡类型，一个城市支持一种卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * transfer：待圈存 success：圈存成功 fail：圈存失败
	 */
	@ApiField("status")
	private String status;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
