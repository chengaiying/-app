package com.moa.viliage.model;

public class News {
	// id
	private String id;
	// 新闻标题
	private String title;
	// 新闻类型
	private String type;
	// 新闻链接
	private String news_url;
	// 新闻来源
	private String newsource;

	public String getNewsource() {
		return newsource;
	}

	public void setNewsource(String newsource) {
		this.newsource = newsource;
	}

	private String time;

	// 新闻内容
	public String news_content;
	// 添加新闻方式
	public String addtype;

	public String getNews_content() {
		return news_content;
	}

	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}

	public String getAddtype() {
		return addtype;
	}

	public void setAddtype(String addtype) {
		this.addtype = addtype;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNews_url() {
		return news_url;
	}

	public void setNews_url(String news_url) {
		this.news_url = news_url;
	}

}
