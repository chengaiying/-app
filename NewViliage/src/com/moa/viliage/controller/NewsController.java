package com.moa.viliage.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import com.jfinal.core.Controller;
import com.moa.viliage.model.FarmerDynamic;
import com.moa.viliage.model.News;
import com.moa.viliage.result.ResultCodes;
import com.moa.viliage.result.ResultInfo;
import com.moa.viliage.service.NewsService;

public class NewsController extends Controller{
	private static final String TAG = "NewsController";
	/**政策前沿新闻列表  */	
	public void ZCQYList() {
		ResultInfo<List<News>> ret = new ResultInfo<List<News>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = NewsService.ZCQYList(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("ZCQYList error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/**补贴动态新闻列表  */
	public void BTDTList() {
		ResultInfo<List<News>> ret = new ResultInfo<List<News>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = NewsService.BTDTList(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("BTDTList error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/**市场行情新闻列表  */
	public void SCHQList() {
		ResultInfo<List<News>> ret = new ResultInfo<List<News>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = NewsService.SCHQList(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("SCHQList error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/**新闻列表  */
	public void newsList() {
		
		ResultInfo<List<News>> ret = new ResultInfo<List<News>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = NewsService.newsList(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("newsList error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
	/**农户动态  */
	public void NHDTList(){
		ResultInfo<List<FarmerDynamic>> ret = new ResultInfo<List<FarmerDynamic>>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = NewsService.NHDTList(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("newsList error:" + e.getMessage());
		}
		renderText(ret.toJson());
		
	}
	/**新闻详情  */
	public void newsDetails() {
		
		ResultInfo<News> ret = new ResultInfo<News>(ResultCodes.RET_UNKNOWN_ERROR);
		try {
			ret = NewsService.newsDetails(this);
		} catch (Exception e) { 
			LoggerFactory.getLogger(TAG).error("newsList error:" + e.getMessage());
		}
		renderText(ret.toJson());
	}
}
