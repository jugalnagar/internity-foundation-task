package com.nagar.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
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
	
	

}
