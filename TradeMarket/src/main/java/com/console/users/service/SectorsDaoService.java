package com.console.users.service;

import java.util.List;

import com.console.users.dao.SectorsDao;


public class SectorsDaoService {
	
private SectorsDao sectorsDao;
	
	public List  getAllSectors() {
		return sectorsDao.getAllSectors();

	}

	public SectorsDao getSectorsDao() {
		return sectorsDao;
	}

	public void setSectorsDao(SectorsDao sectorsDao) {
		this.sectorsDao = sectorsDao;
	}

	
}