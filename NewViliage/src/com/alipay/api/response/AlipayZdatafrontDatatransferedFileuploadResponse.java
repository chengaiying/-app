package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.fileupload response.
 * 
 * @author auto create
 * @since 1.0, 2015-04-22 11:31:48
 */
public class AlipayZdatafrontDatatransferedFileuploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2674944357368768586L;

	/** 
	 * 数据上传结果，true/false
	 */
	@ApiField("success")
	private String success;

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
