package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.stock.portfolio.all.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-01-04 10:04:12
 */
public class AlipayStockPortfolioAllGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3493167992282334564L;

	/** 
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 返回码的描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 股票代码列表
	 */
	@ApiListField("symbol_list")
	@ApiField("string")
	private List<String> symbolList;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setSymbolList(List<String> symbolList) {
		this.symbolList = symbolList;
	}
	public List<String> getSymbolList( ) {
		return this.symbolList;
	}

}
