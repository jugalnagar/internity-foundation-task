package com.naraniya$Bros.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cleaner {
	@Id
	@GeneratedValue
	private int cleanerId;
	@OneToOne
	private Member member;
	@OneToOne
	private Party party;
	public int getCleanerId() {
		return cleanerId;
	}
	public void setCleanerId(int cleanerId) {
		this.cleanerId = cleanerId;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
	}
	@Override
	public String toString() {
		return "Cleaner [cleanerId=" + cleanerId + ", member=" + member + ", party=" + party + "]";
	}
	
	
	
}
