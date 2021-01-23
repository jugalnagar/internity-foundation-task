package com.nagar.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

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
	
	
}
