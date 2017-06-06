package com.moa.viliage.form;

import java.util.ArrayList;

import com.moa.viliage.common.Utils;


public class TestForm {

	private static final String FAMILY_FORM_DESC = "点击进入填写并完善家庭信息，提升芝麻信用分。";

	private static final String LAND_FORM_DESC = "点击进入填写您的真实土地基本信息，如土地总面积等，为您贷款增信。";

	private static final String PLANT_FORM_DESC = "种植农户点击进入填写相关信息，如种植品种等，针对性的进行农业部信息推送。";

	private static final String BREED_FORM_DESC = "养植农户点击进入填写相关信息，如种植品种等，针对性的进行农业部信息推送。";

	private static final String FARM_TOOL_FORM_DESC = "点击进入填写农机具资产信息，为您贷款增信。";

	private static final String EMPLOYEE_FORM_DESC = "点击进入填写固定雇员和临时雇员信息，针对性为您推送合适的保险产品。";

	private static final String INSURANCE_FORM_DESC = "点击进入填写近两年投保情况和受灾情况，为后期农业补贴的发放提供真实信息";

	private static final String LOAN_FORM_DESC = "点击进入填写近年来的贷款数据、获贷情况，良好的贷款记录有助于增信。";

	private static final String SUB_FUNDS_FORM_DESC = "点击进入填写今年最新的补贴款信息，便于农业部了解真实的补贴款发放情况。";
	
	private static final String HZS_BASE_FORM_DESC = "点击进入填写农民专业合作社信息，提升芝麻信用分。";
	
	private static final String ZCFZ_FORM_DESC = "点击进入填写资产负债及收益情况，提升芝麻信用分。";
	
	private static final String WGHNCP_FORM_DESC = "点击进入填写无公害农产品证书信息，提升芝麻信用分。";
	
	private static final String YJNCPZS_FORM_DESC = "点击进入填写有机农产品证书信息，提升芝麻信用分。";
	
	private static final String GREEN_FOOD_FORM_DESC = "点击进入填写绿色食品证书信息，提升芝麻信用分。";
	
	private static final String CPDLBZ_FORM_DESC = "点击进入填写农产品地理标志信息，提升芝麻信用分。";
	
	private static final String BRAND_FORM_DESC = "点击进入填写商标证书信息，提升芝麻信用分。";
	
	public static final String EMPTY = "";

	public static void main(String[] args) {
//		createFamilyInfoForm();
//		createLandInfoForm();
//		createPlantProdInfoForm();
//		createBreedProdInfoForm();
//		createSCJYXXForm();
//		createFarmToolInfoForm();
//		createEmployeeInfoForm();
//		createInsuranceInfoForm();
		createLoanInfoForm();
//		createSubFundsInfoForm();
//		createHZSBaseInfoForm();
//		createAssetLiabilityRatio();
		
		createWGHCPForm();
		createYJCPForm();
		createGreenFoodForm();
		createCPDLBZForm();
		createBrandForm();
	}

	/** 1.家庭基本信息表单结构 */
	private static void createFamilyInfoForm() {
		WordDef word0= new WordDef("家庭农场名称", WordDef.DATA_TYPE_TEXT, "farm_name", true);
		WordDef word1 = new WordDef("劳动力人数", WordDef.DATA_TYPE_NUM, "worker_num", true);
		WordDef word2 = new WordDef("家庭年收入", WordDef.DATA_TYPE_OPTION, "sales");
		word2.options = new String[]{"5万元以下", "5万-20万", "20-100万", "100万-500万", "500万-1000万", "1000万以上"};

		WordDef word3 = new WordDef("学历", WordDef.DATA_TYPE_OPTION, "study", true);
		word3.options = new String[]{"初中及以下", "高中/中专", "大专/本科", "研究生及以上"};

		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word0);
		list.add(word1);
		list.add(word2);
		list.add(word3);
		
		FormDef formDef =  new FormDef(1, "家庭基本信息", "form/icon/1.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/family.jpg", FAMILY_FORM_DESC);
		System.out.println(Utils.toJson(formDef));
		save(formDef);
	}

	/** 2.创建土地信息表单结构 */
	private static void createLandInfoForm() {
		WordDef word1 = new WordDef("经营土地总面积", WordDef.DATA_TYPE_NUM, "area", true);
		word1.dotNum = "2";
		word1.unit = "亩";
		
		WordDef word2 = new WordDef("&nbsp&nbsp--自有面积", WordDef.DATA_TYPE_NUM, "self_area", true);
		word2.dotNum = "2";
		word2.unit = "亩";
		
		WordDef word3 = new WordDef("&nbsp&nbsp--流转面积", WordDef.DATA_TYPE_NUM, "trans_area", true);
		word3.dotNum = "2";
		word3.unit = "亩";
		word3.div = "1";
		
		WordDef word4 = new WordDef("土地流转平均租金", WordDef.DATA_TYPE_NUM, "trans_amount_per_unit", true);
		word4.dotNum = "2";
		word4.unit = "元/亩";
		
		WordDef fileWord1 = new WordDef("土地流转合同", WordDef.DATA_TYPE_FILE, "agreement_img1" , true);
		
		WordDef fileWord2 = new WordDef("土地流转合同", WordDef.DATA_TYPE_FILE, "agreement_img2" , false);
		fileWord2.group = "1";
		
		WordDef fileWord3 = new WordDef("土地流转合同", WordDef.DATA_TYPE_FILE, "agreement_img3" , false);
		fileWord3.group = "2";
		
		WordDef fileWord4 = new WordDef("土地流转合同", WordDef.DATA_TYPE_FILE, "agreement_img4" , false);
		fileWord4.group = "3";

		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		list.add(word3);
		list.add(word4);
		list.add(fileWord1);
		list.add(fileWord2);
		list.add(fileWord3);
		list.add(fileWord4);

		FormDef formDef =  new FormDef(2, "土地信息", "form/icon/2.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/land.jpg", LAND_FORM_DESC);

		System.out.println(Utils.toJson(formDef));
		save(formDef);
	}

	/** 3.创建种植户生产经营信息表单结构 */
	private static void createPlantProdInfoForm() {
		
		String[] digits = new String[]{"1", "2"};
		
		String[] groups = new String[]{null, "1"};
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		
		for (int i = 0; i < 2; i++) {
			WordDef  word1= new WordDef("种植品种" + digits[i], WordDef.DATA_TYPE_OPTION, "plant_type" + digits[i], i==0);
			word1.options = new String[]{"水稻", "小麦", "玉米", "大豆", "油菜", "棉花", "马铃薯", "水果类", "蔬菜类", "其他"};
			word1.group = groups[i];

			WordDef word2 =  new WordDef("种植面积", WordDef.DATA_TYPE_NUM, "area" + digits[i], i==0);
			word2.unit = "亩";
			word2.dotNum = "1";
			word2.group = groups[i];
			
			WordDef word3 =  new WordDef("固定设施投入", WordDef.DATA_TYPE_NUM, "cost_for_equipment" + digits[i], i==0);
			word3.unit = "元";
			word3.dotNum = "2";
			word3.group = groups[i];
			
			WordDef word4 =  new WordDef("农资采购额", WordDef.DATA_TYPE_NUM, "cost_for_resource" + digits[i], i==0);
			word4.unit = "元";
			word4.dotNum = "2";
			word4.group = groups[i];

			WordDef word5 = new WordDef("上年度每亩产量", WordDef.DATA_TYPE_NUM, "sales" + digits[i], i==0);
			word5.unit = "公斤";
			word5.group = groups[i];

			WordDef word6 = new WordDef("上年度销售量", WordDef.DATA_TYPE_NUM, "cost" + digits[i], i==0);
			word6.unit = "公斤";
			word6.group = groups[i];
			
			WordDef word7 = new WordDef("上年度销售均价", WordDef.DATA_TYPE_NUM, "price_for_last_year" + digits[i], i==0);
			word7.unit = "元/公斤";
			word7.group = groups[i];
			
			list.add(word1);
			list.add(word2);
			list.add(word3);
			list.add(word4);
			list.add(word5);
			list.add(word6);
			list.add(word7);
		}

		FormDef formDef =  new FormDef(3, "生产经营信息（种植类）", "form/icon/3.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "1", "form/boot_img/plant.jpg", PLANT_FORM_DESC);
		formDef.flag = "0";
		System.out.println(Utils.toJson(formDef));
		save(formDef);
	}

	/** 4.创建养殖户生产经营信息表单结构 */
	private static void createBreedProdInfoForm() {
		
		String[] digits = new String[]{"1", "2"};
		
		String[] groups = new String[]{null, "1"};
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		
		for (int i = 0; i < 2; i++) {
			WordDef  word1= new WordDef("养殖品种" + digits[i], WordDef.DATA_TYPE_OPTION, "breed_type" + digits[i], i==0);
			word1.options = new String[]{"猪", "奶牛", "肉牛", "山羊", "绵羊",  "蛋鸡", "白羽肉鸡", "黄羽肉鸡",  "鸭", "鹅", "桑蚕", "蛇", "蜜蜂", "其他"};
			word1.group = groups[i];
			
			WordDef word2 = new WordDef("出栏", WordDef.DATA_TYPE_NUM, "breed_num" + digits[i], i==0);
			word2.unit = "头";
			word2.group = groups[i];
			
			WordDef word3 = new WordDef("养殖量", WordDef.DATA_TYPE_NUM, "breed_amount" + digits[i], i==0);
			word3.minLimit = "0";
			word3.group = groups[i];
			
			WordDef word4 = new WordDef("从业人员数", WordDef.DATA_TYPE_NUM, "staff_amount" + digits[i], i==0);
			word4.group = groups[i];
			
			WordDef word5 =  new WordDef("设备设施投入成本", WordDef.DATA_TYPE_NUM, "equipment_cost" + digits[i], i==0);
			word5.unit = "元";
			word5.dotNum = "2";
			word5.group = groups[i];
			
			WordDef word6 = new WordDef("销售价格(活畜)", WordDef.DATA_TYPE_NUM, "price" + digits[i], i==0);
			word6.unit = "元";
			word6.dotNum = "2";
			word6.group = groups[i];
			
			WordDef word7 = new WordDef("上年度饲料等采购额", WordDef.DATA_TYPE_NUM, "cost" + digits[i], i==0);
			word7.unit = "元";
			word7.dotNum = "2";
			word7.group = groups[i];
			
			list.add(word1);
			list.add(word2);
			list.add(word3);
			list.add(word4);
			list.add(word5);
			list.add(word6);
			list.add(word7);
		}

		FormDef formDef =  new FormDef(4, "生产经营信息（养殖类）", "form/icon/4.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "2", "form/boot_img/breed.jpg", BREED_FORM_DESC);
		formDef.flag = "0";
		System.out.println(Utils.toJson(formDef));
		save(formDef);
	}


	/**
	 * 5.创建农具信息表单结构
	 */
	private static void createFarmToolInfoForm() {
		
		String[] digits = new String[]{"1", "2", "3", "4"};
		
		String[] groups = new String[]{null, "1", "2", "3"};
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		
		for (int i = 0; i < 4; i++) {
			
			WordDef word1 = new WordDef("农机品种" + digits[i] , WordDef.DATA_TYPE_OPTION, "tool_type" + digits[i] , i == 0);
			word1.options = new String[]{"农机1", "农机2"};
			word1.group = groups[i];
			
			WordDef word2 = new WordDef("农机数量", WordDef.DATA_TYPE_NUM, "tool_num" + digits[i], i == 0);
			word2.group = groups[i];
			
			WordDef word3 = new WordDef("农机具单价", WordDef.DATA_TYPE_NUM, "tool_price" + digits[i], i == 0);
			word3.unit = "元";
			word3.dotNum = "2";
			word3.group = groups[i];
			
			WordDef word4 = new WordDef("享受农机购置补贴", WordDef.DATA_TYPE_NUM, "total_sub_amount" + digits[i], i == 0);
			word4.unit = "元";
			word4.dotNum = "2";
			word4.group = groups[i];
			
			WordDef word5 = new WordDef("农机具照片", WordDef.DATA_TYPE_FILE, "tool_img" + digits[i], i == 0);
			word5.group = groups[i];
			
			list.add(word1);
			list.add(word2);
			list.add(word3);
			list.add(word4);
			list.add(word5);
		}
		

		FormDef formDef =  new FormDef(5, "农机信息", "form/icon/5.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/tools.jpg", FARM_TOOL_FORM_DESC);
		formDef.flag = "0";
		System.out.println(Utils.toJson(formDef));
		save(formDef);
	}

	/**
	 * 6.创建雇员信息表单结构
	 */
	private static void createEmployeeInfoForm() {
		WordDef  word1 = new WordDef("常年雇工人数", WordDef.DATA_TYPE_NUM, "employee_num", true);
		
		WordDef word2 = new WordDef("常年雇工人均年工资", WordDef.DATA_TYPE_NUM, "employee_yearly_salary", true);
		word2.unit = "元/年";
		word2.dotNum = "2";
		
		WordDef  word3 = new WordDef("临时雇工人数", WordDef.DATA_TYPE_NUM, "tmp_employee_num", true);
		
		WordDef word4 = new WordDef("临时雇工人均每天工资", WordDef.DATA_TYPE_NUM, "tmp_employee_daily_salary", true);
		word4.unit = "元/天";
		
		WordDef word5 = new WordDef("一年雇工总支出", WordDef.DATA_TYPE_NUM, "total_cost", true);

		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		list.add(word3);
		list.add(word4);
		list.add(word5);

		FormDef formDef =  new FormDef(6, "雇工信息", "form/icon/6.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/employee.jpg", EMPLOYEE_FORM_DESC);
		formDef.flag = "0";
		System.out.println(Utils.toJson(formDef));
		save(formDef);
	}

	private static void save(FormDef formDef) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 7.创建保险信息表单结构
	 */
	private static void createInsuranceInfoForm() {
		String[] digits = new String[]{"1", "2", "3"};
		
		String[] groups = new String[]{null, "1", "2"};
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		
		for (int i = 0; i < 3; i++) {
			WordDef word1 = new WordDef("当年是否投保", WordDef.DATA_TYPE_OPTION, "status" + digits[i], true);
			word1.options =  new String[]{"是", "否"};
			word1.group = groups[i];
			
			//TODO  品种有待确认
			WordDef word2 = new WordDef("2016年投保作物品种", WordDef.DATA_TYPE_OPTION, "2016_plants_type" + digits[i], true);
			word2.options = new String[]{"水稻", "小麦", "玉米", "大豆", "油菜", "棉花", "马铃薯", "水果类", "蔬菜类", "其他"};
			word2.group = groups[i];

			WordDef word3 = new WordDef("2016年投保面积", WordDef.DATA_TYPE_NUM, "2016_area" + digits[i], true);
			word3.dotNum = "1";
			word3.unit = "亩";
			word3.group = groups[i];
			
			WordDef word4 = new WordDef("2016年缴纳保费", WordDef.DATA_TYPE_NUM, "2016_insurance_cost" + digits[i], true);
			word4.group = groups[i];
			word4.unit = "元";

			WordDef word5 = new WordDef("2016年受灾面积", WordDef.DATA_TYPE_NUM, "2016_disaster_area" + digits[i], true);
			word5.unit = "亩";
			word5.group = groups[i];
			
			WordDef word6 = new WordDef("2016年获赔金额", WordDef.DATA_TYPE_NUM, "2016_compensation" + digits[i], true);
			word6.dotNum = "2";
			word6.unit = "元";
			word6.group = groups[i];

			list.add(word1);
			list.add(word2);
			list.add(word3);
			list.add(word4);
			list.add(word5);
			list.add(word6);
		}

		FormDef formDef =  new FormDef(7, "保险信息", "form/icon/7.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/insurance.jpg", INSURANCE_FORM_DESC);
		formDef.flag = "0";
		System.out.println(Utils.toJson(formDef));
		save(formDef);
	}


	/**
	 * 8.创建贷款表单
	 */
	private static void createLoanInfoForm() {
		WordDef word1 = new WordDef("贷款来源", WordDef.DATA_TYPE_OPTION, "loan_from", true);
		word1.options = new String[]{"中国邮政储蓄银行", "中国农业银行", "重庆农村商业银行", "中国农业发展银行", "担保公司", "P2P", "民间借贷", "其他"};
		
		WordDef word2 = new WordDef("贷款用途", WordDef.DATA_TYPE_OPTION, "loan_for", true);
		word2.options = new String[]{"购买农具", "扩大经营", "购买农资", "土地租金", "短期垫资", "基础建设", "其他"};
		
		WordDef word3 = new WordDef("获贷金额", WordDef.DATA_TYPE_NUM, "loan_amount", true);
		word3.unit = "元";
		word3.dotNum = "2";
		
		WordDef word4 = new WordDef("贷款月利率", WordDef.DATA_TYPE_NUM, "loan_rate", true);
		word4.dotNum = "2";
		word4.unit = "厘";

		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		list.add(word3);
		list.add(word4);
//		list.add(word5);
//		list.add(word6);
		FormDef formDef =  new FormDef(8, "贷款信息", "form/icon/2.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/loan.jpg", LOAN_FORM_DESC);
		formDef.flag = "0";
		System.out.println(Utils.toJson(formDef));
		save(formDef);
	}

	/**
	 * 9.创建补贴款表单
	 */
	private static void createSubFundsInfoForm() {
		
		String[] digits = new String[]{"1", "2", "3", "4", "5", "6", "7", "8","9", "10"};
		
		String[] groups = new String[]{null, "1", "2", "3", "4", "5", "6", "7", "8","9"};
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		
		for (int i = 0; i < 10; i++) {
			WordDef word1 = new WordDef("2016年已收到哪些补贴", WordDef.DATA_TYPE_CHECKBOX, "2016_sub_funds_items" + digits[i], true);
			word1.options =  new String[]{"耕地地力补贴", "大棚/饲舍及配套设施/场库棚等补贴", "种苗/种畜/种草补贴", 
					"农机购置补贴", "贷款贴息", "土地租金补贴", "家庭农场专项补贴(含当地规模化经营补贴)", "其他补贴", "未获得补贴"};
			word1.group = groups[i];
			
			WordDef word2 = new WordDef("补贴金额", WordDef.DATA_TYPE_NUM, "sub_funds_amount" + digits[i], true);
			word2.unit = "元";
			word2.dotNum = "2";
			word2.group = groups[i];
			
			list.add(word1);
			list.add(word2);
		}
		
		FormDef formDef =  new FormDef(35, "补贴款信息", "form/icon/1.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/sub_funds.jpg", SUB_FUNDS_FORM_DESC);
		formDef.flag = "0";
		System.out.println(Utils.toJson(formDef));
		
		save(formDef);
	}

	private static void createTestForm() {
//		WordDef word1 = new WordDef("金钱,2位小数", WordDef.DATA_TYPE_NUM, "money", true);
//		word1.dotNum = "2";
//		word1.unit="美元";
//		
//		WordDef word2 = new WordDef("文本，6-20长度限制", WordDef.DATA_TYPE_TEXT, "text", true);
//		word2.lenMinLimit = "6";
//		word2.lenMaxLimit = "20";
//		
//		WordDef word3 = new WordDef("单选必填项", WordDef.DATA_TYPE_OPTION, "selection_item", true);
//		word3.options =  new String[]{"选项一", "选项二", "选项三"};
//		
//		WordDef word4 = new WordDef("你喜欢什么手机", WordDef.DATA_TYPE_CHECKBOX, "love_phone", true);
//		word4.options =  new String[]{"苹果", "小米", "三星", "华为", "魅族", "联想", "诺基亚", "摩托罗拉"};
//		
//		WordDef word5 = new WordDef("你出生的日期", WordDef.DATA_TYPE_DATE, "born_date", false);
//		
//		WordDef word6 = new WordDef("照片一", WordDef.DATA_TYPE_FILE, "img1", true);
//		
//		WordDef word7 = new WordDef("照片二", WordDef.DATA_TYPE_FILE, "img2", true);
//		
//
//		ArrayList<WordDef> list = new ArrayList<WordDef>();
//		list.add(word1);
//		list.add(word2);
//		list.add(word3);
//		list.add(word4);
//		list.add(word5);
//		list.add(word6);
//		list.add(word7);
//		FormDef formDef =  new FormDef(10, "测试表单", "form/icon/8.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/loan.png", LOAN_FORM_DESC);
//		System.out.println(formDef);
//		save(formDef);
	}
	
	
	/** 10.创建合作社基本情况表单 */
	public static void createHZSBaseInfoForm() {
		WordDef word1 = new WordDef("农民专业合作社名称", WordDef.DATA_TYPE_TEXT, "hzs_name", true);
		word1.lenMaxLimit = "40";
		
		WordDef word2 = new WordDef("注册登记时间", WordDef.DATA_TYPE_DATE, "reg_date", true);
		word2.div = "1";
		
		WordDef word3 = new WordDef("实有成员总数", WordDef.DATA_TYPE_NUM, "staff_num", true);
		
		WordDef word4 = new WordDef("&nbsp&nbsp--其中农民成员数", WordDef.DATA_TYPE_NUM, "farmer_num", true);
		word4.div = "1";
		
		WordDef word5 = new WordDef("成员出资额", WordDef.DATA_TYPE_NUM, "contribution", true);
		word5.unit = "万元";
		word5.dotNum = "2";
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		list.add(word3);
		list.add(word4);
		list.add(word5);
		FormDef formDef = new FormDef(10, "基本情况", "form/icon/1.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/family.jpg", HZS_BASE_FORM_DESC);
		formDef.flag = "2";
		
		System.out.println(Utils.toJson(formDef));
	}
	
	
	/** 11.创建资产负债及收益  表单 */
	private static void createAssetLiabilityRatio() {
		WordDef word1 = new WordDef("按成员与本社交易量（额）返还金额", WordDef.DATA_TYPE_NUM, "return_money", true);
		word1.dotNum = "2";
		word1.unit = "万元";
		
		WordDef word2 = new WordDef("是否为每名成员建立成员账户", WordDef.DATA_TYPE_OPTION, "if_create_acct_for_all_member", true);
		word2.options = new String[]{"是", "否"};
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		FormDef formDef = new FormDef(11, "资产负债及收益情况", "form/icon/1.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/family.jpg", ZCFZ_FORM_DESC);
		formDef.flag = "2";
		
		System.out.println(Utils.toJson(formDef));
	}
	
	
	/**
	 * 12.生产经营信息（水产业填写）
	 */
	private static void createSCJYXXForm() {
		
		String[] digits = new String[]{"1", "2", "3", "4", "5"};
		
		String[] groups = new String[]{null, "1", "2", "3", "4"};
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		
		for (int i = 0; i < 5; i++) {
			WordDef  word1= new WordDef("水产品种" + digits[i], WordDef.DATA_TYPE_OPTION, "breed_type" + digits[i], i==0);
			word1.options = new String[]{"青鱼", "草鱼", "鲢鱼", "鲤鱼", "甲壳类", "贝类", "藻类", "其他"};
			word1.group = groups[i];
			
			WordDef word2 = new WordDef("养殖面积", WordDef.DATA_TYPE_NUM, "area" + digits[i], i==0);
			word2.unit = "亩";
			word2.minLimit = "0";
			word2.group = groups[i];
			
			WordDef word3 =  new WordDef("上年度销售量", WordDef.DATA_TYPE_NUM, "sales" + digits[i], i==0);
			word3.unit = "元";
			word3.dotNum = "2";
			word3.group = groups[i];
			
			list.add(word1);
			list.add(word2);
			list.add(word3);
		}
		
		FormDef formDef =  new FormDef(12, "生产经营信息（水产类）", "form/icon/5.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/tools.jpg", BREED_FORM_DESC);
		formDef.flag = "0";
		System.out.println(Utils.toJson(formDef));
		save(formDef);
	}
	
	//以下是三品一标表单
	
	
	/** -1.无公害农产品证书  表单 */
	private static void createWGHCPForm() {
		WordDef word1 = new WordDef("获证编号", WordDef.DATA_TYPE_TEXT, "cer_code", true);
		WordDef word2 = new WordDef("证书拍照上传", WordDef.DATA_TYPE_FILE, "cer_img", true);
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		
		FormDef formDef = new FormDef(-1, "无公害农产品证书", "form/icon/1.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/family.png", WGHNCP_FORM_DESC);
		formDef.flag = "0";
		formDef.formType = 2;
		
		System.out.println(Utils.toJson(formDef));
	}
	

	
	/** -2. 有机农产品证书*/
	private static void createYJCPForm() {
		WordDef word1 = new WordDef("证书编号", WordDef.DATA_TYPE_TEXT, "cer_code", true);
		WordDef word2 = new WordDef("证书拍照上传", WordDef.DATA_TYPE_FILE, "cer_img", true);
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		
		FormDef formDef = new FormDef(-2, "有机农产品认证证书", "form/icon/1.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/family.jpg", YJNCPZS_FORM_DESC);
		formDef.flag = "0";
		formDef.formType = 2;
		
		System.out.println(Utils.toJson(formDef));
	}
	
	
	
	/** -3. 绿色食品证书 */
	private static void createGreenFoodForm() {
		WordDef word1 = new WordDef("证书编号", WordDef.DATA_TYPE_TEXT, "cer_code", true);
		WordDef word2 = new WordDef("证书拍照上传", WordDef.DATA_TYPE_FILE, "cer_img", true);
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		
		FormDef formDef = new FormDef(-3, "绿色食品证书", "form/icon/1.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/family.jpg", GREEN_FOOD_FORM_DESC);
		formDef.flag = "0";
		formDef.formType = 2;
		
		System.out.println(Utils.toJson(formDef));
	}
	
	
	/** -4. 农产品地理标志*/
	private static void createCPDLBZForm() {
		WordDef word1 = new WordDef("证书编号", WordDef.DATA_TYPE_TEXT, "cer_code", true);
		WordDef word2 = new WordDef("证书拍照上传", WordDef.DATA_TYPE_FILE, "cer_img", true);
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		
		FormDef formDef = new FormDef(-4, "农产品地理标志", "form/icon/1.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/family.jpg", CPDLBZ_FORM_DESC);
		formDef.flag = "0";
		formDef.formType = 2;
		
		System.out.println(Utils.toJson(formDef));
	}
	
	private static void createBrandForm() {
		WordDef word1 = new WordDef("证书编号", WordDef.DATA_TYPE_TEXT, "cer_code", true);
		WordDef word2 = new WordDef("证书拍照上传", WordDef.DATA_TYPE_FILE, "cer_img", true);
		
		ArrayList<WordDef> list = new ArrayList<WordDef>();
		list.add(word1);
		list.add(word2);
		
		FormDef formDef = new FormDef(-5, "商标证书", "form/icon/1.png", list, "2016-07-01 00:00:00", "2017-01-01 00:00:00", "0", "form/boot_img/family.jpg", BRAND_FORM_DESC);
		formDef.flag = "0";
		formDef.formType = 2;
		
		System.out.println(Utils.toJson(formDef));
	}
	
}
