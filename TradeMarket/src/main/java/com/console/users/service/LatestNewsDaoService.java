package com.console.users.service;


import java.util.List;

import com.console.users.dao.LatestNewsDao;

public class LatestNewsDaoService  {
	
	
	private LatestNewsDao latestNewsDao;
	
	public List  getAllLatestNews() {
		return latestNewsDao.getAllLatestNews();

	}

	public LatestNewsDao getLatestNewsDao() {
		return latestNewsDao;
	}

	public void setLatestNewsDao(LatestNewsDao latestNewsDao) {
		this.latestNewsDao = latestNewsDao;
	}
	
	
	
	
	
}
