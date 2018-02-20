package com.console.users.service;

import java.util.List;

import com.console.users.dao.ThreeTabsDataDao;

public class ThreeTabsDataDaoService {
private ThreeTabsDataDao threeTabsDataDao;
  
  public List  getStocksData() {
	  return threeTabsDataDao.getStocksData();
	  }
  public List  getFundsData() {
	  return threeTabsDataDao.getFundsData();
	  }
  public List  getCommoditiesData() {
	  return threeTabsDataDao.getCommoditiesData();
	  }
	

	public ThreeTabsDataDao getThreeTabsDataDao() {
		return threeTabsDataDao;
	}

	public void setThreeTabsDataDao(ThreeTabsDataDao threeTabsDataDao) {
		this.threeTabsDataDao = threeTabsDataDao;
	}

	
}
