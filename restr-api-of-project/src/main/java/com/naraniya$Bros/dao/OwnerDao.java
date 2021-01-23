package com.naraniya$Bros.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naraniya$Bros.model.Member;
import com.naraniya$Bros.model.Owner;

@Repository
public class OwnerDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Owner saveOrUpdateOwner(Owner owner) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(owner);
		transaction.commit();
		session.close();
		return owner;
	}
	
	public Owner deleteMember(int ownerId) {
		return null;
	}
	
	public List<Object[]> showAllOwner() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Member.class);
		/*Projection projection1 = Projections.property("mobileNo");
		Projection projection2 = Projections.property("name");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection1);
		projectionList.add(projection2);
		criteria.setProjection(projectionList);*/
		List<Object[]> info = criteria.list();
		session.close();
		return info;
	}
	
	public Owner searchOwner(int ownerId) {
		Session session = sessionFactory.openSession();
		Owner member = session.get(Owner.class, ownerId);
		session.close();
		return member;
	}
}
