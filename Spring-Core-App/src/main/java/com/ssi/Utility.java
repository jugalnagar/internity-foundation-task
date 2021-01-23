package com.ssi;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

public class Utility {
	
	
	public static SessionFactory getSessionFactory() {
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		return sessionFactory;
	}
	
}
