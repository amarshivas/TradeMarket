package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.console.users.model.Sectors;

public class SectorsDaoImpl implements SectorsDao{

public static final String QUERY_TO_GET_ALL_SECTORS = "from Sectors"; 
	
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List  getAllSectors() {
		
		
		List<Sectors> listSectors = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_SECTORS);
			listSectors = query.list();
			System.out.println("listSectors size ---------->"+listSectors.size());


		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return listSectors;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
