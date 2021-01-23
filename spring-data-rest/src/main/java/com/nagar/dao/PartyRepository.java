package com.nagar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nagar.model.Party;
@RepositoryRestResource(collectionResourceRel = "party",path = "party")
public interface PartyRepository extends JpaRepository<Party, Integer>{

}
