package com.naraniya$Bros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naraniya$Bros.model.Member;
import com.naraniya$Bros.model.Owner;
import com.naraniya$Bros.service.OwnerService;

@RestController
@RequestMapping("owner")
public class OwnerController {
	@Autowired
	private OwnerService memberService;
	
	
	/*@GetMapping(value="json", produces = "application/json")
	public List<Member> showAllMember() {
		List<Member> members = memberService.showAllMember();
		return members; 
	}*/
	
	@GetMapping(value="{mobileNo}", produces="application/json")
	public Owner searchMember(@PathVariable("mobileNo") int mobileNo) {
		return memberService.searchMemberByOwnerId(mobileNo);
	}
	
	@PostMapping(produces = "application/json",consumes="application/json")
	public Owner saveOrUpdateMember(@RequestBody Owner member) {
		return memberService.saveOrUpdateOwner(member);
	}

}
