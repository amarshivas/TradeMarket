package com.console.users.service;

import java.util.List;

import com.console.users.dao.MarketProfitersDao;

public class MarketProfitersDaoService {
private MarketProfitersDao marketProfitersDao;
	
	public List  getMarketProfiters() {
		return marketProfitersDao.getMarketProfiters();

	}

	public MarketProfitersDao getMarketProfitersDao() {
		return marketProfitersDao;
	}

	public void setMarketProfitersDao(MarketProfitersDao marketProfitersDao) {
		this.marketProfitersDao = marketProfitersDao;
	}
	
}
