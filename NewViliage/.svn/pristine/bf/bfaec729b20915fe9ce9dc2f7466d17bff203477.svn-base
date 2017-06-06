package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品描述模型(数据)
 *
 * @author auto create
 * @since 1.0, 2015-11-16 18:59:43
 */
public class AlipayDataItemDescription extends AlipayObject {

	private static final long serialVersionUID = 3194538456173672198L;

	/**
	 * 标题下的描述列表
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 明细图片列表
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 描述标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 描述url(https开头)
	 */
	@ApiField("url")
	private String url;

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
