package com.moa.viliage.form;


public class WordDef {
	/** 字段类型: 文本*/
	public static final int DATA_TYPE_TEXT = 1;
	/** 字段类型:数字 */
	public static final int DATA_TYPE_NUM = 2;
	/** 字段类型: 选择项*/
	public static final int DATA_TYPE_OPTION = 3;
	/** 字段类型: 文件*/
	public static final int DATA_TYPE_FILE = 4;
	
	/** 字段类型: 日期 */
	public static final int DATA_TYPE_DATE = 5;
	
	/** 字段类型: 多选择项*/
	public static final int DATA_TYPE_CHECKBOX = 6;
	
	/** 字段内容 */
	public String value;
	
	/** 分隔线 */
	public String div;
	
	/** 字段分组 */
	public String group;
	
	
	/** ********以下是通用属性********** */
	/** 该字段在C端显示名称 */
	public String display = "";
	
	/** 该字段数据类型 */
	public int dataType;
	
	/** 该字段参数名:即C端提交表单时的字段名称 */
	public String paramName = "";
	
	/** 该字段参是否为必填项 1:必填  0:非必填 */
	public String required = "0";
	
	
	
	/** ********以下是文本类型属性********** */
	
	/** 字段长度上限 仅文本类型字段有该属性 */
	public String lenMaxLimit;
	
	/** 字段长度下限 仅文本类型字段有该属性 */
	public String lenMinLimit;
	
	
	
	/** ********以下是数字类型属性********** */
	/** 该字段单位 */
	public String unit;
	
	/** 字段值上限 仅数字类型字段有该属性 */
	public String maxLimit;
	
	/** 字段值下限 仅数字类型字段有该属性 */
	public String minLimit;
	
	/** 选项数组 仅选择项类型字段有该属性*/
	public String[] options;
	
	/** 小数点后保留位数*/
	public String dotNum;
	
	
	/** ********以下是文件类型属性********** */
	/** 文件大小限制  单位KB*/
	public String fileMaxLimit;
	
	public WordDef(String dis, int type, String paramName) {
		this.display = dis;
		this.dataType = type;
		this.paramName = paramName;
		
		if (type == DATA_TYPE_NUM) {
			this.maxLimit = String.valueOf(Integer.MAX_VALUE);
			this.minLimit = "0";
		} else if (type == DATA_TYPE_TEXT) {
			this.lenMaxLimit = "30";
			this.lenMinLimit = "0";
		}
	}
	
	public WordDef(String dis, int type, String paramName, boolean required) {
		this(dis, type, paramName);
		this.required = required ? "1" : "0";
	}
	
	@Override
	public boolean equals(Object obj) {
		WordDef another = (WordDef) obj;
		return paramName.equals(another.paramName);
	}
	
	public WordDef copy() throws CloneNotSupportedException {
		WordDef word = new WordDef(display, dataType, paramName);
		word.required = required;
		word.lenMaxLimit = lenMaxLimit;
		word.lenMinLimit = lenMinLimit;
		word.unit = unit;
		word.maxLimit = maxLimit;
		word.minLimit = minLimit;
		word.dotNum = dotNum;
		
		word.options = word.options;
		word.fileMaxLimit = fileMaxLimit;
		word.div = div;
		word.group = group;
		
		return word;
	}
}
