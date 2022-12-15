package com.sportyshoes.basepackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/dataPage.html")
public class ShoeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView dataEntry() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("dataPage");
		
		modelAndView.addObject("message", "Spring MVC! Using spring boot");
		
		return modelAndView;
	}

}
