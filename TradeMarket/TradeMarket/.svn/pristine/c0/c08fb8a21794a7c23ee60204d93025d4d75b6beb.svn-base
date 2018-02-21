package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.NewsFlash;

public class NewsFlashDaoImpl implements NewsFlashDao{
	public static final String QUERY_TO_GET_ALL_NEWSFLASH_DATA = "from NewsFlash";

	private SessionFactory sessionFactory;
	
	public List getNewsFlash() {

		List<NewsFlash> listNewsFlash = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_NEWSFLASH_DATA);
			listNewsFlash = query.list();
			System.out.println("listNewsFlash size ---------->" + listNewsFlash.size());

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return listNewsFlash;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	
}
