package com.naraniya$Bros.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naraniya$Bros.model.Member;

@Repository
public class MemberDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Member saveOrUpdateMember(Member member) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(member);
		transaction.commit();
		session.close();
		return member;
	}
	
	public Member deleteMember(long mobileNo) {
		return null;
	}
	
	public List<Object[]> showAllMember() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Member.class);
		Projection projection1 = Projections.property("mobileNo");
		Projection projection2 = Projections.property("name");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection1);
		projectionList.add(projection2);
		criteria.setProjection(projectionList);
		List<Object[]> info = criteria.list();
		session.close();
		return info;
	}
	
	public Member searchMember(long mobileNo) {
		Session session = sessionFactory.openSession();
		Member member = session.get(Member.class, mobileNo);
		session.close();
		return member;
	}

}
