package com.console.users.service;

import java.util.List;

import com.console.users.dao.GainerLosersDao;
import com.console.users.dao.VolumeToppersDao;

public class VolumeToppersDaoService {
private VolumeToppersDao volumeToppersDao;
	
	public List  getAllVolumeToppers(){
		return volumeToppersDao.getAllVolumeToppers();

	}

	public VolumeToppersDao getVolumeToppersDao() {
		return volumeToppersDao;
	}

	public void setVolumeToppersDao(VolumeToppersDao volumeToppersDao) {
		this.volumeToppersDao = volumeToppersDao;
	}
	
	
}
