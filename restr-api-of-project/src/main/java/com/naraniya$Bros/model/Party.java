package com.naraniya$Bros.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int partyId;
	private String tittle;
	private String place;
	private String type;
	@ManyToMany
	private List<Member> members;
	@OneToOne
	private Owner owner;
	@OneToOne
	private Cleaner cleaner;
	public int getPartyId() {
		return partyId;
	}
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void setMembers(List<Member> members) {
		this.members = members;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public Cleaner getCleaner() {
		return cleaner;
	}
	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}
	@Override
	public String toString() {
		return "Party [partyId=" + partyId + ", tittle=" + tittle + ", place=" + place + ", type=" + type + ", members="
				+ members + ", owner=" + owner + ", cleaner=" + cleaner + "]";
	}
	
}
