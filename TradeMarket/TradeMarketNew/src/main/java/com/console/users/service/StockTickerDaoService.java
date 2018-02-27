package com.console.users.service;

import java.util.List;

import com.console.users.dao.StockTickerDao;

public class StockTickerDaoService {
	private StockTickerDao stockTickerDao;
	
	public List getStockTickerData(){
		return stockTickerDao.getStockTickerData();
	}

	public StockTickerDao getStockTickerDao() {
		return stockTickerDao;
	}

	public void setStockTickerDao(StockTickerDao stockTickerDao) {
		this.stockTickerDao = stockTickerDao;
	}
	
	
	
}
