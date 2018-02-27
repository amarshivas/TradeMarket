package com.console.users.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.WorldData;

public class WorldDaoImpl {
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
	public static void main(String args[]){
		WorldDaoImpl dao = new WorldDaoImpl();
		List<WorldData> list = new ArrayList<WorldData>();
		    list= dao.getWorldData();
		    for(Iterator itr = list.iterator();itr.hasNext();){ 
		    	WorldData w =(WorldData)itr.next();
		    	System.out.println(w.getContentId());
		    	System.out.println(w.getContentName());
		    	System.out.println(w.getIndexName());
		    	System.out.println(w.getPrice());
		    	System.out.println(w.getValue());
		    }
		
		
	}
	
	
}

