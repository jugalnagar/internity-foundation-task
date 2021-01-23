package com.naraniya$Bros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naraniya$Bros.model.Member;
import com.naraniya$Bros.service.MemberService;

@RestController
@RequestMapping("member")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	
	@GetMapping(value="json", produces = "application/json")
	public List<Member> showAllMember() {
		List<Member> members = memberService.showAllMember();
		return members; 
	}
	
	@GetMapping(value="{mobileNo}", produces="application/json")
	public Member searchMember(@PathVariable("mobileNo") long mobileNo) {
		return memberService.searchMemberByMobileNo(mobileNo);
	}
	
	@PostMapping(produces = "application/json",consumes="application/json")
	public Member saveOrUpdateMember(@RequestBody Member member) {
		return memberService.saveOrUpdateMember(member);
	}
	
	/*@RequestMapping("deleteMember")
	public ModelAndView deleteMember(@RequestParam("mobileNo") long mobileNo) {
		Member member = memberService.deleteMember(mobileNo);
		ModelAndView modelAndView = new ModelAndView("deleteConfirmation");
		modelAndView.addObject(member);
		return modelAndView;
	}
	
	@RequestMapping("searchMember")
	public ModelAndView searchMember(@RequestParam("mobileNo") long mobileNo,@RequestParam("password") String password) {
		Member member = memberService.searchMember(mobileNo, password);
		ModelAndView modelAndView = new ModelAndView();
		if(member==null) {
			modelAndView.setViewName("login");
		}
		else {
			modelAndView.setViewName("member");
		}
		modelAndView.addObject(member);
		return modelAndView;
	}
	
	*/

	
}
