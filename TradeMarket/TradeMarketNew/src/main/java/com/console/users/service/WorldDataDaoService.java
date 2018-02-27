package com.console.users.service;

import java.util.List;

import com.console.users.dao.WorldDataDao;

public class WorldDataDaoService {
private WorldDataDao worldDataDao;

public List getWorldData(){
	return worldDataDao.getWorldData();
}

public WorldDataDao getWorldDataDao() {
	return worldDataDao;
}

public void setWorldDataDao(WorldDataDao worldDataDao) {
	this.worldDataDao = worldDataDao;
}



}
