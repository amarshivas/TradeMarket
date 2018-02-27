package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.Commodities;
import com.console.users.model.Funds;
import com.console.users.model.Stocks;


public class ThreeTabsDataDaoImpl implements ThreeTabsDataDao{
	public static final String QUERY_TO_GET_ALL_STOCKS_DATA="from Funds";
	public static final String QUERY_TO_GET_ALL_FUNDS_DATA="from Stocks";
	public static final String QUERY_TO_GET_ALL_COMMODITIES_DATA="from Commodities";
	
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List getStocksData(){
		List<Stocks> listStocks = null;
		try {
			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_STOCKS_DATA);
			listStocks = query.list();
			System.out.println("listStocks size ---------->" + listStocks.size());
		}catch (Exception ex) {
			ex.printStackTrace();

		}
		return listStocks;
		
	}
	public List getFundsData(){
		List<Funds> listFunds = null;
         try {
        	 Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_FUNDS_DATA);
        	 listFunds = query.list();
 			System.out.println("listFunds size ---------->" + listFunds.size());
		}catch (Exception ex) {
			ex.printStackTrace();

		}
		return listFunds;
         
	}
	public List getCommoditiesData(){
		List<Commodities> listCommodities = null;
      try {
    	  Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_COMMODITIES_DATA);
    	  listCommodities = query.list();
			System.out.println("listCommodities size ---------->" + listCommodities.size());
		}catch (Exception ex) {
			ex.printStackTrace();

		}
		return listCommodities;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
