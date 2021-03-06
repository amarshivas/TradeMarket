package com.jcg.examples.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jcg.examples.model.LatestNews;

public class LatestNewsDaoImpl implements LatestNewsDao {

	public static final String QUERY_TO_GET_ALL_LATEST_NEWS = "from LatestNews"; 
	
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List  getAllLatestNews() {
		
		
		List<LatestNews> listLatestNews = null;
		try {
			//System.out.println("listLatestNews size ---------->"+listLatestNews.size());
			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_LATEST_NEWS);
			listLatestNews = query.list();
			System.out.println("listLatestNews size ---------->"+listLatestNews.size());


		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return listLatestNews;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}