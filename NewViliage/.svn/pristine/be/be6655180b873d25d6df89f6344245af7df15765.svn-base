package com.moa.viliage.loan;

import java.io.Serializable;

/**
 * 金融机构实体	
 * @author alps
 */
public class Bank implements Serializable {
	private static final long serialVersionUID = -8778345769570640334L;
	
	public int bankId;
	
	public String bankName = "";
	
	public String bankIcon = "";
	
	public String bankDesc = "";
	
	/**
	 * 1：银行
	 * 2：担保公司
	 */
	public int type = 1;
	
	public Bank(int id, String name, String icon, String desc) {
		bankId = id;
		bankName = name;
		bankIcon = icon;
		bankDesc = desc;
	}
	
	public Bank(int id, String name, int type, String icon, String desc) {
		this(id, name, icon, desc);
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "[" + bankId + ", " + bankName + "]";
	}
	
}
