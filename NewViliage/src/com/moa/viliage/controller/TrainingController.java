package com.moa.viliage.controller;


import java.util.List;

import org.slf4j.LoggerFactory;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.moa.viliage.form.TrainingDef;
import com.moa.viliage.interceptor.TokenInterceptor;
import com.moa.viliage.model.TrainCourseModel;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.result.obj.EmptyResultObj;
import com.moa.viliage.service.TrainingService;

public class TrainingController extends Controller {
	private static final String TAG = "TrainingController";
	/*
	 * 查询我要培训历史信息
	 */
	public void queryTrainingInfo() {
		ResultInfo<List<TrainingDef>> ret = new ResultInfo<List<TrainingDef>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = TrainingService.queryTrainingInfoList(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("TrainingController error " + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/*
	 * 修改我要培训历史录入信息
	 */
	@Before(TokenInterceptor.class)
	public void updateTrainingById() {
		ResultInfo<EmptyResultObj> ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = TrainingService.updateTrainingById(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("TrainingController error " + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/*
	 * 新增我要培训记录
	 */
	@Before(TokenInterceptor.class)
	public void saveTrainingInfo() {
		ResultInfo<EmptyResultObj> ret = new ResultInfo<EmptyResultObj>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = TrainingService.saveTrainingInfo(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("TrainingController error " + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/*
	 * 查询我要培训历史信息
	 */
	@Before(TokenInterceptor.class)
	public void queryTrainCourse() {
		ResultInfo<List<TrainCourseModel>> ret = new ResultInfo<List<TrainCourseModel>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = TrainingService.queryTrainCourseList(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("TrainingController error " + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/*
	 * 查询我要培训历史信息
	 */
	@Before(TokenInterceptor.class)
	public void deleteTraining() {
		ResultInfo<String> ret = new ResultInfo<String>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = TrainingService.deleteTraining(this);
		} catch (Exception e) {
			LoggerFactory.getLogger(TAG).error("TrainingController error " + e.getMessage());
		}
		renderText(ret.toJson());
	}
}
