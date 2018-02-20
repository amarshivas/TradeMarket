package com.console.users.service;

import java.util.List;

import com.console.users.dao.viewsRecomendationsDao;



public class ViewsRecomendationsDaoService {

	private viewsRecomendationsDao viewsRecomendationsDao;
	
	public List getViewsRecomendations(){
		return viewsRecomendationsDao.getViewsRecomendations();
	}

	public viewsRecomendationsDao getViewsRecomendationsDao() {
		return viewsRecomendationsDao;
	}

	public void setViewsRecomendationsDao(
			viewsRecomendationsDao viewsRecomendationsDao) {
		this.viewsRecomendationsDao = viewsRecomendationsDao;
	}

	

}
