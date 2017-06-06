package com.moa.viliage.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.alipay.api.internal.util.StringUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.IAtom;
import com.jfinal.plugin.activerecord.Record;
import com.moa.viliage.common.Utils;
import com.moa.viliage.db.Tables.TRegion;
import com.moa.viliage.db.Tables.TableTrainCourse;
import com.moa.viliage.db.Tables.TableTraining;
import com.moa.viliage.form.TrainingDef;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.model.AlipayUserModel;
import com.moa.viliage.model.TrainCourseModel;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.result.obj.EmptyResultObj;
import com.moa.viliage.token.AlipayUserInfo;
import com.moa.viliage.token.AlipayUserInfoCache;

public class TrainingService {
	private static final String TAG = "TrainingService";
	/**
	 *查询我要培训信息历史信息
	 * @param controller
	 * @return
	 */
	public static ResultInfo<List<TrainingDef>> queryTrainingInfoList(
			Controller controller) {
		String tokenStr = controller.getSession()
				.getAttribute(TokenInterceptor.PARAM_TOKEN).toString();
		AlipayUserInfo userInfoObj = AlipayUserInfoCache.getInstance().findUserInfoByToken(tokenStr);
		StringBuilder sql=new StringBuilder();    
		sql.append("select * from training where user_id=?");
		String trainingId = controller.getPara(TableTraining.COL_TRAINING_ID);
		List<Record> recordList;
		if(!StringUtils.isEmpty(trainingId)){
			
			sql.append("and "+TableTraining.COL_TRAINING_ID+"=?");
			recordList = Db.find(sql.toString(),userInfoObj.id,trainingId);
		}else{
			
			recordList = Db.find(sql.toString(),userInfoObj.id);
		}
		
		// 根据用户名查询我要培训历史信息

		if (recordList == null) {

			return new ResultInfo<List<TrainingDef>>(ResultCodes.RET_FAILED,
					"查询数据为空");

		}
		List<TrainingDef> list=new ArrayList<TrainingDef>();
		for (Record record : recordList) {
			TrainingDef def=new TrainingDef();
			trainingId = record.get(TableTraining.COL_TRAINING_ID);
			String trainingTime = record.get(TableTraining.COL_TRAINING_TIME);
			String trainingName = record.get(TableTraining.COL_TRAINING_NAME);
			String trainingStatus = record.get(TableTraining.COL_TRAINING_STATUS);
			def.setTrainingId(trainingId);
			def.setTrainingName(trainingName);
			def.setTrainingStatus(trainingStatus);
			def.setTrainingTime(trainingTime);
			list.add(def);
		}
		return new ResultInfo<List<TrainingDef>>(ResultCodes.RET_SUCCESS, "ok", list);

	}
	/**
	 *修改我要培训历史信息
	 * @param controller
	 * @return
	 */
	public static ResultInfo<EmptyResultObj> updateTrainingById(
			Controller controller) {
		
		String trainingId=controller.getPara(TableTraining.COL_TRAINING_ID);
		String trainingName=controller.getPara(TableTraining.COL_TRAINING_NAME);
		String trainingTime=controller.getPara(TableTraining.COL_TRAINING_TIME);
		TrainingDef def=new TrainingDef();
		def.setTrainingId(trainingId);
		def.setTrainingName(trainingName);
		def.setTrainingTime(trainingTime);
		try{
			if(StringUtils.isEmpty(trainingId)){
				return new ResultInfo<EmptyResultObj>(ResultCodes.RET_FAILED,"id不能为空");	
				
			}
		if(checkParam(def)){
			
			return new ResultInfo<EmptyResultObj>(ResultCodes.RET_FAILED,"参数非空校验失败");
		}
		Record record=new Record();
		record.set(TableTraining.COL_TRAINING_NAME,trainingName);
		record.set(TableTraining.COL_TRAINING_TIME,trainingTime);
		record.set(TableTraining.COL_TRAINING_ID,trainingId);
		if (!Db.update(TableTraining.TABLE_NAME, TableTraining.COL_TRAINING_ID, record)){
			return new ResultInfo<EmptyResultObj>(ResultCodes.RET_FAILED,"培训信息修改失败");
		}
		
		return new ResultInfo<EmptyResultObj>(ResultCodes.RET_SUCCESS,"ok");
		
		}catch(Exception e){
			e.printStackTrace();
			return new ResultInfo<EmptyResultObj>(ResultCodes.RET_FAILED,"培训信息修改失败");
		}
		
	}





	/**
	 *新增我要培训信息
	 * @param controller
	 * @return
	 */
	public static ResultInfo<EmptyResultObj> saveTrainingInfo(
			Controller controller) {
		try{
		String tokenStr = controller.getSession()
				.getAttribute(TokenInterceptor.PARAM_TOKEN).toString();
		final AlipayUserInfo userInfoObj = AlipayUserInfoCache.getInstance()
				.findUserInfoByToken(tokenStr);
		String content = controller.getPara("content");
		
		if(!Utils.isEmpty(content)){
			
			content = new String(content.getBytes("iso8859-1"), "utf-8");
		}
		Gson gson = new Gson();
		JsonParser jsonParse = new JsonParser();
		JsonObject rootObj = jsonParse.parse(content).getAsJsonObject();
		String json = gson.toJson(rootObj.getAsJsonArray("fromData"));
		System.out.println(json);
		final ArrayList<TrainingDef>	jsonArray = gson.fromJson(gson.toJson(rootObj.getAsJsonArray("fromData")),
				new TypeToken<ArrayList<TrainingDef>>() {
				}.getType());
		boolean bool = Db.tx(new IAtom() {
			public boolean run() throws SQLException {

				boolean bool = true;
				try {
					for (TrainingDef def : jsonArray) {
						// 参数非空校验
						if (!checkParam(def)) {
							bool = false;
						}
						Record record = new Record();
						record.set(TableTraining.COL_TRAINING_USER_ID,userInfoObj.id);
						record.set(TableTraining.COL_TRAINING_ALIPAY_USER_ID,userInfoObj.alipayUserId);
						record.set(TableTraining.COL_TRAINING_ID,Utils.createUUID());
						record.set(TableTraining.COL_TRAINING_NAME,def.trainingName.toString().trim());
						record.set(TableTraining.COL_TRAINING_TIME,def.trainingTime);
						record.set(TableTraining.COL_TRAINING_STATUS,def.trainingStatus);
						// 根据id修改我要培新信息
						Db.save(TableTraining.TABLE_NAME, record);
					}
				} catch (Exception e) {

					e.printStackTrace();
					bool = false;
					Logger.getLogger(TAG).error(
							"TrainingService error" + e.getMessage());
				}
				return bool;
			}
		});

		if (bool) {
			return new ResultInfo<EmptyResultObj>(ResultCodes.RET_SUCCESS, "ok");
		} else {
			return new ResultInfo<EmptyResultObj>(ResultCodes.RET_SUCCESS,
					"新增培训信息失败");
		}
		}catch(Exception e){
			e.printStackTrace();
			return new ResultInfo<EmptyResultObj>(ResultCodes.RET_SUCCESS,
					"新增培训信息失败");
		}
	}

	
	/**
	 *查询我要培训培训课程信息
	 * @param controller
	 * @return
	 */
	public static ResultInfo<List<TrainCourseModel>> queryTrainCourseList(Controller controller) {
		String tokenStr = controller.getSession().getAttribute(TokenInterceptor.PARAM_TOKEN).toString();
		AlipayUserInfo userInfoObj = AlipayUserInfoCache.getInstance().findUserInfoByToken(tokenStr);
		String userId = userInfoObj.id;
		String province = userInfoObj.province;
		String city = userInfoObj.city;
		
		String date = "";
		List<TrainCourseModel> trainList = new ArrayList<TrainCourseModel>();
		// 查询region中的省市
		if (StringUtils.isEmpty(userId)) {
			return new ResultInfo<List<TrainCourseModel>>(ResultCodes.RET_SUCCESS,"userId获取失败");
		}
		if (StringUtils.isEmpty(province) && StringUtils.isEmpty(city)) {
			// 获取省市失败
			return new ResultInfo<List<TrainCourseModel>>(ResultCodes.RET_SUCCESS,"省-市信息不能都为空");
		}
		//查询所有课程信息
		List<Record>  courseList=Db.find("select * from train_course");
		for(Record courseInfoList:courseList){
			AlipayUserModel alipayUser=new AlipayUserModel();
			String courseRegionId=courseInfoList.get(TableTrainCourse.COL_COURSE_REGION_ID);
			//获取省-市
			Utils.getAddress(courseRegionId, alipayUser);
			//判断区域管理员权限一级或者二级或者三级（此处默认把三级当成二级）
			
             Record regionIdRecord=Db.findFirst("select * from region where region_id=?",courseRegionId);	
            	 //一级管理员
            	 //查询当前用户下所有当前省课程信息
     			if(!StringUtils.isEmpty(province)&& province.equals(alipayUser.getProvince()) ){
     				TrainCourseModel trainModel=new TrainCourseModel();
     				trainModel.setPhone(courseInfoList.getStr(TableTrainCourse.COL_COURSE_PHONE));
     				trainModel.setAddress(courseInfoList.getStr(TableTrainCourse.COL_COURSE_ADDRESS));
     				trainModel.setContent(courseInfoList.getStr(TableTrainCourse.COL_COURSE_CONTENT));
     				trainModel.setDescribe(courseInfoList.getStr(TableTrainCourse.COL_COURSE_DESCRIBE));
     				trainModel.setId(courseInfoList.getInt(TableTrainCourse.COL_COURSE_ID).toString());
     				if(courseInfoList.get(TableTrainCourse.COL_COURSE_RELEASE_DATE)!=null){
    					 date=courseInfoList.getTimestamp(TableTrainCourse.COL_COURSE_RELEASE_DATE).toString();
    				}
    				trainModel.setRelease_date(date);
     				trainModel.setTrainProject(courseInfoList.getStr(TableTrainCourse.COL_COURSE_TRAIN_PROJECT));
     				trainList.add(trainModel);
     				continue;
     				
     			}  
			
		}
		//查询当前用户下所有的市的信息
		return new ResultInfo<List<TrainCourseModel>>(ResultCodes.RET_SUCCESS, "ok",trainList);

	}

	/**
	 *查询我要培训培训课程信息
	 * @param controller
	 * @return
	 */
	public static ResultInfo<String> deleteTraining(Controller controller) {
		String training_id=controller.getPara("id");
		
		Record record=new Record();
		
		record.set(TableTraining.COL_TRAINING_ID, training_id);
		//根据id删除当前历史表中的记录
		
		if(!Db.delete(TableTraining.TABLE_NAME,TableTraining.COL_TRAINING_ID, record)){
			
			return new ResultInfo<String>(ResultCodes.RET_FAILED, "删除培训历史记录失败");	
		}
		
		return new ResultInfo<String>(ResultCodes.RET_SUCCESS, "ok");
	}
	public static boolean checkParam(TrainingDef def) {

		if (Utils.isEmpty(def.trainingName)
				|| Utils.isEmpty(def.trainingStatus)) {
			return false;
		}
		return true;
	}
	
}
