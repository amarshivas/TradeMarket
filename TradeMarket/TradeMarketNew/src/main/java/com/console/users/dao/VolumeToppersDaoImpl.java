package com.console.users.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.console.users.model.GainersLosers;

public class VolumeToppersDaoImpl implements VolumeToppersDao {

	public static final String QUERY_TO_GET_ALL_VOLUME_TOPPERS = "from VolumeToppers";

	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List getAllVolumeToppers() {

		List<GainersLosers> listVolumeTopper= null;
		try {

			Query query = getSessionFactory().getCurrentSession().createQuery(QUERY_TO_GET_ALL_VOLUME_TOPPERS);
			listVolumeTopper = query.list();
			System.out.println("listVolumeTopper size ---------->" + listVolumeTopper.size());

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return listVolumeTopper;

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
