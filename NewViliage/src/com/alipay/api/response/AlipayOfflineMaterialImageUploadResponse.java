package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.material.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2015-12-17 15:20:08
 */
public class AlipayOfflineMaterialImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7593433225744517416L;

	/** 
	 * 图片在商家中心的唯一标识
	 */
	@ApiField("image_id")
	private String imageId;

	/** 
	 * 图片的访问地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl( ) {
		return this.imageUrl;
	}

}
