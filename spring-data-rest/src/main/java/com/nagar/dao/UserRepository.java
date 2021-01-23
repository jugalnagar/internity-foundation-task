package com.nagar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.nagar.model.User;

@RepositoryRestResource(collectionResourceRel = "user",path = "user")
public interface UserRepository extends JpaRepository<User, Integer> {

}
