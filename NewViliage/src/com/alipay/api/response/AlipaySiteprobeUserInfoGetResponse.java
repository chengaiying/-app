package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.siteprobe.user.info.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-03-02 15:29:23
 */
public class AlipaySiteprobeUserInfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6416585522474674745L;

	/** 
	 * 商家的广告标识。如果商家需要向客户端返回广告URL，需要将该标识一同返回给客户端。
	 */
	@ApiField("adv_key")
	private String advKey;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 支付宝用户绑定身份证号码（需要在ABOSS平台签约的合作商可以选择获得）
	 */
	@ApiField("id_card")
	private String idCard;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 设备提供商应用中支付宝用户的Id
	 */
	@ApiField("open_id_1")
	private String openId1;

	/** 
	 * 店铺绑定服务窗应用中支付宝用户的Id（需在请求参数中包含shop_id方可得到）
	 */
	@ApiField("open_id_2")
	private String openId2;

	/** 
	 * 支付宝用户绑定手机号码（需要在ABOSS平台签约的合作商可以选择获得）
	 */
	@ApiField("phone")
	private String phone;

	public void setAdvKey(String advKey) {
		this.advKey = advKey;
	}
	public String getAdvKey( ) {
		return this.advKey;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getIdCard( ) {
		return this.idCard;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setOpenId1(String openId1) {
		this.openId1 = openId1;
	}
	public String getOpenId1( ) {
		return this.openId1;
	}

	public void setOpenId2(String openId2) {
		this.openId2 = openId2;
	}
	public String getOpenId2( ) {
		return this.openId2;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

}
