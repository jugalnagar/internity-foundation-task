package com.ssi;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sun.xml.bind.XmlAccessorFactory;

@Configuration
public class MyConfiguration {
	
	@Bean
	public SessionFactory sessionFactory() {
		return Utility.getSessionFactory();
	}
	
	@Bean
	public CustomerDAOImpl customerDAO() {
		CustomerDAOImpl customerDao = new CustomerDAOImpl();
		return customerDao;
	}

}
