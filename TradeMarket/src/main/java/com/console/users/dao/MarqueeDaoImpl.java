package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.Marquee;

public class MarqueeDaoImpl implements MarqueeDao {

	public static final String QUERY_TO_GET_ALL_MARQUEES = "from Marquee";

	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List getMarquee() {

		List<Marquee> listMarquee = null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_MARQUEES);
			listMarquee = query.list();
			System.out.println("listMarquee size ---------->" + listMarquee.size());

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return listMarquee;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
