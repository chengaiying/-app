package com.moa.viliage;


import java.io.File;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.moa.viliage.controller.BizRecordController;
import com.moa.viliage.controller.FarmerController;
import com.moa.viliage.controller.FileController;
import com.moa.viliage.controller.FormController;
import com.moa.viliage.controller.InsurerController;
import com.moa.viliage.controller.LoanController;
import com.moa.viliage.controller.NewsController;
import com.moa.viliage.controller.OAuthController;
import com.moa.viliage.controller.ResourseLoaderController;
import com.moa.viliage.controller.TrainingController;
import com.moa.viliage.form.FormDefLoader;
import com.moa.viliage.loan.BankLoader;
import com.moa.viliage.loan.FiProdLoader;
import com.moa.viliage.service.BizRecordService.AgriProdTypeLoader;

public class WebConfig extends JFinalConfig {

	public static String tmpDir;
	
	public static String photoDir;
	
	public static String licenceImgDir;
	
	public static String formDir;
	
	public static String callbackUrl = "";
	
	public static boolean isDebug = false;
	
	private int conMinSize = 5;
	
	private int conInitSize = 5;
	
	private int conMaxSize = 20;
	
	public WebConfig() {
	}

	@Override
	public void configConstant(Constants me) {
		loadPropertyFile("config.properties");
		tmpDir = getProperty("tmpStorageDir");
		photoDir = getProperty("photoDir");
		licenceImgDir = getProperty("licenceImgDir");
		formDir = getProperty("formImgDir");
		isDebug = getPropertyToBoolean("devMode");
		callbackUrl = getProperty("callbackUrl");
		
		conMinSize = getPropertyToInt("con_min_size", 5);
		conInitSize = getPropertyToInt("con_init_size", 5);
		conMaxSize = getPropertyToInt("con_max_size", 20);
		
		me.setViewType(ViewType.JSP);
		me.setMaxPostSize(1024 * 1024);
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/api/farmer", FarmerController.class);
		me.add("/api/oauth", OAuthController.class);
		me.add("/api/file", FileController.class);
		me.add("/api/form", FormController.class);
		me.add("/api/loan", LoanController.class);
		me.add("/api/biz", BizRecordController.class);
		me.add("/api/loader", ResourseLoaderController.class);
		me.add("/api/training", TrainingController.class);
		me.add("/api/news", NewsController.class);
		me.add("/api/insurer", InsurerController.class);
	}

	@Override
	public void configPlugin(Plugins me) {
		DruidPlugin druidPlugin = new DruidPlugin(getProperty("jdbcUrl"), getProperty("user"), getProperty("password").trim());
		druidPlugin.set(conInitSize, conMinSize, conMaxSize);
		
		me.add(druidPlugin);
		
		ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
		me.add(arp);
	}

	@Override
	public void configInterceptor(Interceptors me) {

	}

	@Override
	public void configHandler(Handlers me) {
	}
	
	@Override
	public void afterJFinalStart() {
		//可以将初始化工作放在这里
		FormDefLoader.getInstance().loadFormDefs();
		BankLoader.getInstance().loadBanks();
		FiProdLoader.getInstance().loadFiProds();
		AgriProdTypeLoader.getInstance().loadAgriProdTypes();
		
		//清空临时目录
		File tmpPath = new File(tmpDir);
		if (tmpPath.exists() && tmpPath.isDirectory()) {
			File[] files = tmpPath.listFiles();
			for (File file : files) {
				file.delete();
			}
		}
		
		try {
			//MailUtils.SendSimpleMail("zf21100@163.com", "系统运行记录", "系统重新启动\n" + Utils.getCurrentTimeStr());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
