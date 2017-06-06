package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Coupon;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.member.coupon.querydetail response.
 * 
 * @author auto create
 * @since 1.0, 2014-11-19 15:53:06
 */
public class AlipayMemberCouponQuerydetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 4118734496828295143L;

	/** 
	 * 红包信息
	 */
	@ApiField("coupon")
	private Coupon coupon;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 具体错误原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("success_code")
	private String successCode;

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	public Coupon getCoupon( ) {
		return this.coupon;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}
	public String getSuccessCode( ) {
		return this.successCode;
	}

}
