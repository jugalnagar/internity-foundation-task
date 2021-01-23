package com.naraniya$Bros.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naraniya$Bros.dao.OwnerDao;
import com.naraniya$Bros.model.Member;
import com.naraniya$Bros.model.Owner;

@Service
public class OwnerService {
	@Autowired
	private OwnerDao ownerDao;
	
	public Owner saveOrUpdateOwner(Owner member) {
		ownerDao.saveOrUpdateOwner(member);
		return member;
	}
	
	/*public Member deleteMember(long mobileNo) {
		return null;
	}*/
	
	/*public List<Owner> showAllOwner() {
		List<Object[]> info = ownerDao.showAllOwner();
		List<Owner> members = new ArrayList<Owner>();
		
		return members; 
	}*/
	
	public Owner searchMemberByOwnerId(int ownerId) {
		Owner member = ownerDao.searchOwner(ownerId);
		return member;
	}
	
	/*public Member searchMember(long mobileNo,String password) {
		Member member = memberDao.searchMember(mobileNo);
		if(password.compareTo(member.getPassword())!=0) {
			return null;
		}
		return member;
	}*/
}
