package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.GainersLosers;
import com.console.users.model.StockTicker;

public class StockTickerDaoImpl implements StockTickerDao{
	public static final String QUERY_TO_GET_ALL_STOCKTIKERS_DATA = "from StockTicker";

	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List getStockTickerData() {

		List<StockTicker> listStockTicker = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_STOCKTIKERS_DATA);
			listStockTicker = query.list();
			System.out.println("listStockTicker size ---------->" + listStockTicker.size());

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return listStockTicker;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
