package com.naraniya$Bros.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naraniya$Bros.dao.MemberDao;
import com.naraniya$Bros.model.Member;

@Service
public class MemberService {
	@Autowired
	private MemberDao memberDao;
	
	public Member saveOrUpdateMember(Member member) {
		memberDao.saveOrUpdateMember(member);
		return member;
	}
	
	public Member deleteMember(long mobileNo) {
		return null;
	}
	
	public List<Member> showAllMember() {
		List<Object[]> info = memberDao.showAllMember();
		List<Member> members = new ArrayList<Member>();
		for(Object[] data:info) {
			Member member = new Member();
			member.setMobileNo((Long) data[0]);
			member.setName((String) data[1]);
			members.add(member);
		}
		return members; 
	}
	
	public Member searchMemberByMobileNo(long mobileNo) {
		Member member = memberDao.searchMember(mobileNo);
		return member;
	}
	
	public Member searchMember(long mobileNo,String password) {
		Member member = memberDao.searchMember(mobileNo);
		if(password.compareTo(member.getPassword())!=0) {
			return null;
		}
		return member;
	}

}
