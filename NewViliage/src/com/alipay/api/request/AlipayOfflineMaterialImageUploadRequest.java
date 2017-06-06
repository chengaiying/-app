package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOfflineMaterialImageUploadResponse;

/**
 * ALIPAY API: alipay.offline.material.image.upload request
 * 
 * @author auto create
 * @since 1.0, 2015-12-17 15:20:08
 */
public class AlipayOfflineMaterialImageUploadRequest implements AlipayUploadRequest<AlipayOfflineMaterialImageUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 图片二进制内容
	 */
	private FileItem imageContent;

	/** 
	* 图片名称
	 */
	private String imageName;

	/** 
	* 用于显示指定图片所属的partnerId，只适用于特殊调用者，普通用户请勿使用此参数
	 */
	private String imagePid;

	/** 
	* 图片格式
	 */
	private String imageType;

	public void setImageContent(FileItem imageContent) {
		this.imageContent = imageContent;
	}
	public FileItem getImageContent() {
		return this.imageContent;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageName() {
		return this.imageName;
	}

	public void setImagePid(String imagePid) {
		this.imagePid = imagePid;
	}
	public String getImagePid() {
		return this.imagePid;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getImageType() {
		return this.imageType;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.offline.material.image.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("image_name", this.imageName);
		txtParams.put("image_pid", this.imagePid);
		txtParams.put("image_type", this.imageType);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image_content", this.imageContent);
		return params;
	}

	public Class<AlipayOfflineMaterialImageUploadResponse> getResponseClass() {
		return AlipayOfflineMaterialImageUploadResponse.class;
	}
}
