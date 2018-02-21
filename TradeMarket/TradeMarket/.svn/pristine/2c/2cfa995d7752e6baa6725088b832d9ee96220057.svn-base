package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.console.users.model.TopNews;

public class TopNewsDaoImpl implements TopNewsDao {

	public static final String QUERY_TO_GET_ALL_TOP_NEWS = "from TopNews"; 
	
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List  getAllTopNews() {
		
		
		List<TopNews> topNews = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_TOP_NEWS);
			topNews = query.list();
			System.out.println("topNews size ---------->"+topNews.size());


		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return topNews;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}