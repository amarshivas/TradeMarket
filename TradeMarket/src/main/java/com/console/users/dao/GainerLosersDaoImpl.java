package com.console.users.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import com.console.users.model.GainersLosers;

public class GainerLosersDaoImpl implements GainerLosersDao {

	public static final String QUERY_TO_GET_ALL_GAINERS_LOSERS = "from GainersLosers";

	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List getAllgainerLosers() {

		List<GainersLosers> listGainerLosers = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_GAINERS_LOSERS);
			listGainerLosers = query.list();
			System.out.println("listLatestNews size ---------->" + listGainerLosers.size());

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return listGainerLosers;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
