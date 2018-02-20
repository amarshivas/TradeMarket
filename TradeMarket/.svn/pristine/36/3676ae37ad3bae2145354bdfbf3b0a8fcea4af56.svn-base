package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.console.users.model.MostRead;

public class MostReadDaoImpl implements MostReadDao {

	public static final String QUERY_TO_GET_ALL_MOST_READ_NEWS = "from MostRead"; 
	
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List  getAllMostRead() {
		
		
		List<MostRead> mostRead = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_MOST_READ_NEWS);
			mostRead = query.list();
			System.out.println("mostRead size ---------->"+mostRead.size());


		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return mostRead;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}