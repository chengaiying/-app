package com.moa.viliage.loan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.LoggerFactory;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.db.Tables.TBank;

/**
 * 金融产品加载器
 * 系统启动时，将所有产品加载到内存
 * @author zf21100
 *
 */
public class BankLoader {
	private static BankLoader instance = new BankLoader();
	
	private HashMap<Integer, Bank> bankCache = new HashMap<Integer, Bank>();
	
	private List<Bank> bankList = new ArrayList<Bank>();
	
	private BankLoader() {}
	
	public static BankLoader getInstance() {
		return instance;
	}
	
	public void loadBanks() {
		bankCache.clear();
		bankList.clear();
		List<Record> bankRecords = Db.find("select * from bank order by seq" );
		
		if (bankRecords != null) {
			for (Record record : bankRecords) {
				int id = record.getInt(TBank.COL_ID);
				String name = record.getStr(TBank.COL_BANK_NAME);
				String icon = record.getStr(TBank.COL_BANK_ICON);
				String desc = record.getStr(TBank.COL_BANK_DESC);
				int type = record.getInt(TBank.COL_BANK_TYPE);
				Bank bank = new Bank(id, name, type, icon, desc);
				if (bank != null) {
					LoggerFactory.getLogger("BankLoader").info("Load Bank Success: " + bank);
					bankCache.put(id, bank);
					bankList.add(bank);
				}
			}
		}
	}
	
	public Bank findBank(int bankId) {
		return bankCache.get(bankId);
	}
	
	public boolean contains(int bankId) {
		return bankCache.containsKey(bankId);
	}
	
	public List<Bank> getBankList() {
		return bankList;
	}
	
}
