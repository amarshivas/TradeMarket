package com.jcg.examples.services;

import java.util.List;

import com.jcg.examples.dao.TopNewsDao;

public class TopNewsDaoService  {
	
	
	private TopNewsDao topNewsDao;
	
	public List  getAllTopNews() {
		return topNewsDao.getAllTopNews();

	}

	public TopNewsDao getTopNewsDao() {
		return topNewsDao;
	}

	public void setTopNewsDao(TopNewsDao topNewsDao) {
		this.topNewsDao = topNewsDao;
	}
	
	
	
	
	
}