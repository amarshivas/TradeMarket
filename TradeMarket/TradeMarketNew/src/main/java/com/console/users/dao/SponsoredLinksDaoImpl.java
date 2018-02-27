package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.NewsFlash;
import com.console.users.model.SponsoredLinks;

public class SponsoredLinksDaoImpl implements SponsoredLinksDao{
	public static final String QUERY_TO_GET_ALL_SPONSOREDLINKS_DATA = "from SponsoredLinks";

	private SessionFactory sessionFactory;
	
	public List getSponsoredLinks() {

		List<SponsoredLinks> listSponsoredLinks = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_SPONSOREDLINKS_DATA);
			listSponsoredLinks = query.list();
			System.out.println("listSponsoredLinks size ---------->" + listSponsoredLinks.size());

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return listSponsoredLinks;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
