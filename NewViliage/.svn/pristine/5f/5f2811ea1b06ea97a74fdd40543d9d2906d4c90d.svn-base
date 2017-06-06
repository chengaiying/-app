package com.moa.viliage.common;

import java.io.File;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.WebConfig;
import com.moa.viliage.db.Tables.TRegion;
import com.moa.viliage.model.AlipayUserModel;

public class Utils {

	public static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static final SimpleDateFormat SDF2 = new SimpleDateFormat("yyyy-MM-dd");
	
	public static Gson gson = new GsonBuilder().disableHtmlEscaping().create();
	
	public static Gson gsonIgnorPrivateAttr = new GsonBuilder().excludeFieldsWithModifiers(Modifier.PRIVATE).create();
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(createUUID());
		}
	}

	public static String toJson(Object obj) {
		return gson.toJson(obj);
	}

	public static String toJsonIgnorPrivateAttr(Object obj) {
		return gsonIgnorPrivateAttr.toJson(obj);
	}
	
	public static <T> T fromJson(String json, Class<T> clazz) {
		return gson.fromJson(json, clazz);
	}

	/**
	 * @param json
	 * @param typeOfT
	 * @return
	 * @throws JsonSyntaxException
	 * 
	 * List<Person> list = new ArrayList<Person>();
	 * Gson gson = new Gson();
	 * list = gson.fromJson(jsonString, new TypeToken<List<Person>>(){}.getType());
	 */
	public static <T> T fromJson(String json, Type typeOfT) throws JsonSyntaxException {
		return gson.fromJson(json, typeOfT);
	}

	public static boolean isEmpty(String str) {
		if (str == null) {
			return true;
		}
		return (str.length() == 0);
	}


	/**
	 * 生成随机数字
	 * @param len   长度
	 * @return
	 */
	public static String genRandomNumStr(int len) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			Random r = new Random();
			sb.append(r.nextInt(10));
		}

		return sb.toString();
	}

	/**
	 * 生成32位随机码，作为mysql 表主键
	 * @return
	 */
	public static final String createUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}


	public static void deleteFileByName(String ...files) {
		for (String fileName : files) {
			if (isEmpty(fileName)) {
				continue;
			}
			try {
				File file = new File(fileName);
				if (file.exists() && file.isFile()) {
					file.delete();
				}
			} catch (Exception e) {
				LoggerFactory.getLogger("Utils").error("delete file error " + fileName);
			}
			
		}
	}

	public static void deleteFile(File ... files) {
		for (File file : files) {
			if (file != null && file.isFile()) {
				file.delete();
			}
		}
	}
	
	public static void deleteAllFilesByName(Collection<String> fileNames) {
		String[] array = new String[fileNames.size()];
		fileNames.toArray(array);
		deleteFileByName(array);
	}

	/**
	 * 判断指定文本是否为数字
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str){ 
		if (isEmpty(str)) {
			return false;
		}
		Pattern pattern = Pattern.compile("[0-9]{1, 15}"); 
		Matcher isNum = pattern.matcher(str);
		if( !isNum.matches() ){
			return false; 
		}
		
		return true; 
	}
	
	public static String getCurrentTimeStr() {
        return SDF.format(new Date());
    }
	
	public static Date getDateTimeByStr(String dateStr) {
		try {
			return SDF.parse(dateStr);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static Date getDateByStr(String dateStr) {
		try {
			return SDF2.parse(dateStr);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static long getMillisByStr(String dateStr) {
		if (isEmpty(dateStr)) {
			return 0;
		}
		
		try {
			return SDF.parse(dateStr).getTime();
		} catch (ParseException e) {
			return 0;
		}
	}
	
	
    private static Pattern cellphonePattern = Pattern.compile("[1][3,5,7,8][0-9]{9}");
    
    /**
     * 判断是否为手机号
     * @param cellphone
     * @return
     */
    public static boolean checkCellphoneFormat(String cellphone) {
        if (isEmpty(cellphone)) {
            return false;
        }
        return cellphonePattern.matcher(cellphone).matches();
    }
    
	public static void showSqlInfo(String sql, List<Object> sqlParams) {
		if (WebConfig.isDebug) {
			String str = ", params: ";
			for (Object para : sqlParams) {
				str += para + ", ";
			}
			System.out.println(sql.toString() + str);
		}
	}
	  /**
     * 获取省-市-县
     * 2016-12-29 linluole
     */
    public static  void getAddress(String regionId,AlipayUserModel alipayUser){
    	
    	Record regionRecord = Db.findFirst("select * from region where region_id =?",
    			regionId);
		
		// 判断regionName是省-市-县（区）
		if (!regionRecord.get(TRegion.COL_PARENT_ID).toString().trim().equals("0")) {
			// 获取市
			Record cityRecord = Db.findFirst(
					"select * from region where region_code =?",
					regionRecord.get(TRegion.COL_PARENT_ID));

			
			if (!cityRecord.get(TRegion.COL_PARENT_ID).toString().trim().equals("0")) {
             //获取区或者县
				Record countyRecord = Db.findFirst(
						"select * from region where region_code =?",
						cityRecord.get(TRegion.COL_PARENT_ID));
				alipayUser.setProvince(countyRecord.get(TRegion.COL_REGION_NAME).toString());
				alipayUser.setCity(cityRecord.get(TRegion.COL_REGION_NAME).toString());
				alipayUser.setDistrict(regionRecord.get(TRegion.COL_REGION_NAME).toString());
			}else{
				alipayUser.setCity(regionRecord.get(TRegion.COL_REGION_NAME).toString());	
				alipayUser.setProvince(cityRecord.get(TRegion.COL_REGION_NAME).toString());
			}
		}else{
			alipayUser.setProvince(regionRecord.get(TRegion.COL_REGION_NAME).toString());
		}	
    	
    }


}
