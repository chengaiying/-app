package com.moa.viliage.token;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

import com.moa.viliage.common.Utils;

public class AlipayUserInfo implements Serializable {

	private static final long serialVersionUID = -3913115766180630852L;


	public transient String accessToken = "";

	/** 
	 * 支付宝用户的id
	 */
	public String alipayUserId = "";
	
	/** 是否通过实名认证0:未通过     1:通过 */
	public transient String isCertified = "0";
	
	/**id**/
	public String id="";
	/**被代理人**/
	public String principalId;
	/**是否是合作社**/
	public String isHzs;
	
	/** 身份证号码 */
	public String idNum = "";
	
	/** 真实姓名 */
	public String realName = "";

	public String province = "";
	
	public String city = "";
	
	/** 
	 * 保存用户上传文件的临时路径
	 *  如果信息直报时提交的图片
	 **/
	private ConcurrentHashMap<String, String> tmpFileCache = new ConcurrentHashMap<String, String>();


	public AlipayUserInfo(String token, String userId) {
		this.accessToken = token;
		this.alipayUserId = userId;
	}
	

	@Override
	public boolean equals(Object obj) {
		AlipayUserInfo aToken = (AlipayUserInfo) obj;
		return aToken.accessToken.equals(accessToken) && aToken.alipayUserId.equals(alipayUserId);
	}


	public void deleteAllImgs() {
		Enumeration<String> enume = tmpFileCache.elements();
		while (enume.hasMoreElements()) {
			String file = enume.nextElement();
			Utils.deleteFileByName(file);
		}
	}
	
	

	public void addTmpFile(String key, String file) {
		String oriName = tmpFileCache.get(key);
		if (! Utils.isEmpty(oriName)) {
			Utils.deleteFileByName(oriName);
		}
		
		tmpFileCache.put(key, file);
	}
	
	public String findTmpFileName(String key) {
		return tmpFileCache.get(key);
	}
	
	public void removeTmpFile(String key) {
		tmpFileCache.remove(key);
	}
	
	@Override
	public String toString() {
		return "token:" + accessToken + ", " + Utils.toJson(this) ;
	}
}
