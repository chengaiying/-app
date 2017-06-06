package com.moa.viliage.loan;

import java.io.Serializable;

import org.slf4j.LoggerFactory;

import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.db.Tables.TFiProd;

/**
 * 金融产品定义
 * @author alps
 *
 */
public class FiProd implements Serializable {

	private static final long serialVersionUID = 3947822207435962979L;
	
	public String id = "";
	
	public int bankId;
	
	public String prodName = "";
	
	public String prodIcon = "";
	
	public String prodDesc = "";
	
	private String prodContent = "";
	
	public String rate = "";
	
	public int maxAmount;
	
	public int maxPeriod;
	
	public String linkUrl = "";
	
	private String contact = "";
	
	public static FiProd createProd(Record prodRecord) {
		FiProd prodInfo = new FiProd();
		prodInfo.id = prodRecord.getStr(TFiProd.COL_ID);
		prodInfo.bankId = prodRecord.getInt(TFiProd.COL_BANK_ID);
		prodInfo.prodName = prodRecord.getStr(TFiProd.COL_PROD_NAME);
		prodInfo.prodIcon = prodRecord.getStr(TFiProd.COL_PROD_ICON);
		prodInfo.prodDesc = prodRecord.getStr(TFiProd.COL_PROD_DESC);
		prodInfo.prodContent = prodRecord.getStr(TFiProd.COL_PROD_CONTENT);
		prodInfo.rate = prodRecord.getStr(TFiProd.COL_RATE);
		
		try {
			prodInfo.maxAmount = prodRecord.getInt(TFiProd.COL_MAX_AMOUNT);
			prodInfo.maxPeriod = prodRecord.getInt(TFiProd.COL_MAX_PERIOD);
		} catch (Exception e) {
			LoggerFactory.getLogger("FiProd").error("load fiprod:" + prodInfo.id + " error " + e.getMessage());
			return null;
		}
		prodInfo.linkUrl = prodRecord.getStr(TFiProd.COL_LINK_URL);
		prodInfo.contact = prodRecord.getStr(TFiProd.COL_CONTACT);
		return prodInfo;
	}
	
	public String getProdContent() {
		return prodContent;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "[" + id + ", " + prodName + "]";
	}

}
