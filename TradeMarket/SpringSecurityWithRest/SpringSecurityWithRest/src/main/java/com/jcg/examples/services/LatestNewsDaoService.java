package com.jcg.examples.services;


import java.util.List;

import com.jcg.examples.dao.LatestNewsDao;


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
