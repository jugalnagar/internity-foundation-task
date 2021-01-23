package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
	}

	public Customer searchCustomer(int code) {
		Session session=sessionFactory.openSession();
		Customer customer=session.get(Customer.class, code);
		session.close();
		return customer;
	}

}
