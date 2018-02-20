package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.StockTicker;


public class StockTickerDaoImpl implements StockTickerDao{
	public static final String QUERY_TO_GET_ALL_STOCKTICKER_DATA = "from StockTicker";

	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List getStockTickerData() {

		List<StockTicker> listStockTickerData = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_STOCKTICKER_DATA);
			listStockTickerData = query.list();
			System.out.println("listStockTickerData size ---------->" + listStockTickerData.size());

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		System.out.println("stockticker");
		return listStockTickerData;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
