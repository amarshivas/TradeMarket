package com.console.users.service;

import java.util.List;

import com.console.users.dao.MarqueeDao;

public class MarqueeDaoService {
	private MarqueeDao marqueeDao;
	
	public List getMarquee(){
		return marqueeDao.getMarquee();
	}

	public MarqueeDao getMarqueeDao() {
		return marqueeDao;
	}

	public void setMarqueeDao(MarqueeDao marqueeDao) {
		this.marqueeDao = marqueeDao;
	}
	
	
}
