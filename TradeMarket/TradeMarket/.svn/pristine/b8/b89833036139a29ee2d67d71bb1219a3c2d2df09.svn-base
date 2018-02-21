package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.MarketProfiters;

public class MarketProfitersDaoImpl implements MarketProfitersDao{
	
	public static final String QUERY_TO_GET_ALL_MARKET_PROFITERS_DATA = "from MarketProfiters";

	private SessionFactory sessionFactory;
	
	public List getMarketProfiters() {

		List<MarketProfiters> listMarketProfiters = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_MARKET_PROFITERS_DATA);
			listMarketProfiters = query.list();
			System.out.println("listMarketProfiters size ---------->" + listMarketProfiters.size());

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return listMarketProfiters;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	
}
