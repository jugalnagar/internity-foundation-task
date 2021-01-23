package com.nagar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nagar.model.Member;

@RepositoryRestResource(collectionResourceRel = "member",path = "member")
public interface MemberRepository extends JpaRepository<Member, Long> {

}
