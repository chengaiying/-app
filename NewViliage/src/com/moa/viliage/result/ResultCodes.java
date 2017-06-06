package com.moa.viliage.result;

import java.io.Serializable;

/**
 * 定义各类返回码含义
 * @author zf21100
 * TODO
 */
public class ResultCodes implements Serializable {
	
	private static final long serialVersionUID = 2548282856110779861L;

	/** 所有请求，只要被服务器正确处理，且达到预期目的，返回0 */
	public static final int RET_SUCCESS = 0;
	
	/** 数据不存在 */
	public static final int RET_DATA_NOT_EXIST = 1;
	
	/** 数据已存在 */
	public static final int RET_DATA_HAS_EXIST = 2;
	
	/** 参数错误  100-200 定义各种参数错误类型 */
	public static final int RET_PARAM_ERROR = 100;
	
	
	//public static final int RET_PARAM_ID_NUM_EMPTY = 101;
	
	/** 所有请求，被服务器正确处理，且明确未达到预期目的，返回该值 */
	public static final int RET_FAILED = -1;
	
	/** token失效，返回该值 */
	public static final int RET_TOKEN_INVALIDATE = -2;
	
	/** 超出时间限制 */
	public static final int RET_EXCEED_TIME_LIMIT = -3;
	
	public static final int RET_FILE_TOO_LARGE = -4;
	
	/** 农场主未认证 */
	public static final int RET_NEED_AUTH = -5;
	
	/** 无权限 */
	public static final int RET_NO_PERMISSION = -6;
	
	/** 未知错误类型 */
	public static final int RET_UNKNOWN_ERROR = -9;
}
