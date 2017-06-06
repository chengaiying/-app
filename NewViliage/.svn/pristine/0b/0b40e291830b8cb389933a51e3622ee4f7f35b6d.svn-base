package com.moa.viliage.loan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.LoggerFactory;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

/**
 * 金融产品加载器
 * 系统启动时，将所有产品加载到内存
 * @author zf21100
 *
 */
public class FiProdLoader {
	private static FiProdLoader instance = new FiProdLoader();
	
	private HashMap<String, FiProd> fiProdCache = new HashMap<String, FiProd>();
	
	private ArrayList<FiProd> fiProdList = new ArrayList<FiProd>();
	
	private FiProdLoader() {}
	
	public static FiProdLoader getInstance() {
		return instance;
	}
	
	public void loadFiProds() {
		fiProdCache.clear();
		fiProdList.clear();
		
		
		List<Record> fiProdRecords = Db.find("select prod.* from  fi_prod prod left join bank bank on bank.id=prod.bank_id where prod.status>-1 order by bank.seq, prod.id");
		
		if (fiProdRecords != null) {
			for (Record record : fiProdRecords) {
				FiProd fiProd = FiProd.createProd(record);
				if (fiProd != null) {
					fiProdList.add(fiProd);
					fiProdCache.put(fiProd.id, fiProd);
					
					LoggerFactory.getLogger("FiProdLoader").info("load fiProd success:" + fiProd);
				}
			}
		}
	}
	
	public boolean contains(String prodId) {
		return fiProdCache.containsKey(prodId);
	}
	
	public List<FiProd> getFiProdList() {
		return fiProdList;
	}
	
	public FiProd findProd(String prodId) {
		return fiProdCache.get(prodId);
	}
}
