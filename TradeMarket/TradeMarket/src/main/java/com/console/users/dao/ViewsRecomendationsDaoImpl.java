package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.ViewsRecomendation;

public class ViewsRecomendationsDaoImpl implements viewsRecomendationsDao{
	
	private static final String QUERY_TO_GET_ALL_VIEWSRECOMENDATION_DATA="from ViewsRecomendation";
	
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List getViewsRecomendations(){
		List<ViewsRecomendation> listviewsRecomendations=null;
		try{
			Query query=getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_VIEWSRECOMENDATION_DATA);
			listviewsRecomendations=query.list();
			System.out.println("listviewsRecomendations size ---------->" + listviewsRecomendations.size());
		}catch(Exception e){
			e.printStackTrace();
		}
		return listviewsRecomendations;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
