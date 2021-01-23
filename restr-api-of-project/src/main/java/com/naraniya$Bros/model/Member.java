package com.naraniya$Bros.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "participant")
public class Member {
	@Id
	//@Range(min=1000000000,max=9999999999,message="Enter 10 digit mobile No.")
	//@Pattern(regexp="[0-9]*")
	private long mobileNo;
	//@NotNull(message="Enter Name")
	private String name;
	private String password;
	@ManyToMany(mappedBy="members")
	private List<Party> parties;
	@OneToMany
	private List<Cleaner> cleaners;
	@OneToMany
	private List<Owner> owners;
	
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Party> getParties() {
		return parties;
	}
	public void setParties(List<Party> parties) {
		this.parties = parties;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Cleaner> getCleaners() {
		return cleaners;
	}
	public void setCleaners(List<Cleaner> cleaners) {
		this.cleaners = cleaners;
	}
	public List<Owner> getOwners() {
		return owners;
	}
	public void setOwners(List<Owner> owners) {
		this.owners = owners;
	}
	@Override
	public String toString() {
		return "Member [mobileNo=" + mobileNo + ", name=" + name + ", parties=" + parties + ", password=" + password
				+ ", cleaners=" + cleaners + ", owners=" + owners + "]";
	}
	
	
	
	
}
