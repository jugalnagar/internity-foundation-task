package com.nagar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class CylinderController {
	
	@Autowired
	private InternalResourceViewResolver vr;
	@Autowired
	private CylinderService service;
	
	
	@RequestMapping("input")
	public static String redirectInput() {
		return "input";
	}
	
	@RequestMapping("compute")
	public ModelAndView calculate(@ModelAttribute("cylinder") Cylinder cylinder) {
		service.calculateAreaAndVolume(cylinder);
		ModelAndView mv = new ModelAndView("result");
		return mv;
	}
}

