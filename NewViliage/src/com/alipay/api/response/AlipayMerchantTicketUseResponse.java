package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Ticket;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.ticket.use response.
 * 
 * @author auto create
 * @since 1.0, 2015-03-19 16:09:39
 */
public class AlipayMerchantTicketUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4457713286453182711L;

	/** 
	 * 请求时传入的业务幂等号（外部订单号）
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 错误码，错误代码，参见"7  错误码"。
当出现重复请求，但幂等处理成功时，也会有表示幂等重复请求的错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 具体错误原因，当出现重复请求，但幂等处理成功时，也会有表示幂等重复
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 是否成功,整个业务处理成功时
返回T否则返回F。
具体的错误码和 信息科参考error_code和error_msg信息
	 */
	@ApiField("success_code")
	private String successCode;

	/** 
	 * 核销券的详细信息
	 */
	@ApiField("ticket")
	private Ticket ticket;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
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

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Ticket getTicket( ) {
		return this.ticket;
	}

}
