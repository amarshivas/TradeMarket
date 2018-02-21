package com.console.users.service;

import java.util.List;

import com.console.users.dao.NewsFlashDao;

public class NewsFlashDaoService {
private NewsFlashDao newsFlashDao;
	
	public List  getNewsFlash() {
		return newsFlashDao.getNewsFlash();

	}

	public NewsFlashDao getNewsFlashDao() {
		return newsFlashDao;
	}

	public void setNewsFlashDao(NewsFlashDao newsFlashDao) {
		this.newsFlashDao = newsFlashDao;
	}

}
