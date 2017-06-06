package com.moa.viliage.result;

import java.io.Serializable;

import com.moa.viliage.common.Utils;

public class ResultInfo<T> implements Serializable {
	
	private static final long serialVersionUID = 6575623058490885827L;

	/** @see ResultCodes */
	public int code;
	
	public String desc = "";
	
	public T result;
	
	public ResultInfo(int code) {
		this.code = code;
	}
	
	public ResultInfo(int code, String desc) {
		this(code);
		this.desc = desc;
	}
	
//	public ResultInfo(int code, T obj) {
//		this(code);
//		this.result = obj;
//	}
	
	public ResultInfo(int code, String desc, T obj) {
		this(code, desc);
		this.result = obj;
	}
	
	public String toJson() {
		return Utils.toJson(this);
	}
	
	public String toJsonIgnorPrivateAttr() {
		return Utils.toJsonIgnorPrivateAttr(this);
	}
	
}
