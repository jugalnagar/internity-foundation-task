package com.naraniya$Bros.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.naraniya$Bros.model.Party;

@Repository
public class PartyDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Party saveOrUpdateParty(Party party) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(party);
		transaction.commit();
		session.close();
		return party;
	}
	
	/*public Member deleteMember(long mobileNo) {
		return null;
	}*/
	
	public List<Party> showAllParty() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Party");
		List<Party> info = query.list();
		session.close();
		return info;
	}
	
	/*public Member searchMember(long mobileNo) {
		Session session = sessionFactory.openSession();
		Member member = session.get(Member.class, mobileNo);
		session.close();
		return member;
	}*/
}
