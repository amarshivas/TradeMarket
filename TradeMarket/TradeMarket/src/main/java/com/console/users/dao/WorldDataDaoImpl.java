package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.WorldData;

public class WorldDataDaoImpl implements WorldDataDao {
	
	public static final String QUERY_TO_GET_ALL_WORLD_DATA ="from WorldData";
	
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List getWorldData(){
		List<WorldData> listWorldData=null;
		try{
			Query query=getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_WORLD_DATA);
			
			listWorldData=query.list();
			System.out.println("listWorldData size ---------->" + listWorldData.size());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return listWorldData;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
