package com.virtusa.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CityMain {
	public static void main(String[] args) {
		
	CityClassified cc = new CityClassified();
	CityDetails cd = new CityDetails();
	CityUser cu = new CityUser();
	
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	    session.save(cc);
	    session.save(cd);
	    session.save(cu);
	    session.getTransaction().commit();
	    session.close();
	}
}
