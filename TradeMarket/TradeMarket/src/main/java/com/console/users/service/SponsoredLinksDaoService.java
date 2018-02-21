package com.console.users.service;

import java.util.List;

import com.console.users.dao.SponsoredLinksDao;

public class SponsoredLinksDaoService {
private SponsoredLinksDao sponsoredLinksDao;
	
	public List  getsponsoredLinks() {
		return sponsoredLinksDao.getSponsoredLinks();

	}

	public SponsoredLinksDao getSponsoredLinksDao() {
		return sponsoredLinksDao;
	}

	public void setSponsoredLinksDao(SponsoredLinksDao sponsoredLinksDao) {
		this.sponsoredLinksDao = sponsoredLinksDao;
	}

}
