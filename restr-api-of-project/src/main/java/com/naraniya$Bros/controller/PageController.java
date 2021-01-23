package com.naraniya$Bros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.naraniya$Bros.model.Member;
import com.naraniya$Bros.service.MemberService;

@Controller
public class PageController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("addmember")
	public ModelAndView addMemeberPage() {
		ModelAndView modelAndView = new ModelAndView();
		Member member = new Member();
		modelAndView.addObject(member);
		modelAndView.setViewName("addMember");
		return modelAndView;
	}
	
	@RequestMapping("login")
	public String logInPage() {
		return "login";
	}
	
	@RequestMapping("search")
	public String searchPage() {
		return "searchMember";
	}

	@RequestMapping("addparty")
	public ModelAndView addPartyPage() {
		ModelAndView modelAndView= new ModelAndView("addParty");
		modelAndView.addObject("members", memberService.showAllMember());
		return modelAndView;
	}
}
