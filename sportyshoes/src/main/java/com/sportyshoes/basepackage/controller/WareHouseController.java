package com.sportyshoes.basepackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sportyshoes.basepackage.model.ShoeData;
import com.sportyshoes.basepackage.resource.RestfulResource;
import com.sportyshoes.basepackage.service.ShoeService;

@Controller
//@RequestMapping(path = "/entry.html")
public class WareHouseController {
	
	@Autowired
	private RestfulResource resource;
	
	
	@RequestMapping(path = "/entry.html", method = RequestMethod.POST)
	public ModelAndView dataEntry() {
		
		ModelAndView modelAndView = new ModelAndView();
		
//		List<ShoeData> shoelist = resource.getAllShoes();
//		
//		modelAndView.setViewName("entry");
		
		modelAndView.addObject("shoelist", "hello there");
		
	
		return modelAndView;
	}
	
	@RequestMapping(value="/getallitem", method=RequestMethod.GET)
	public String getAllItem() {
		List<ShoeData> allShoes = resource.getAllShoes();
		System.out.println(allShoes);
		return "warehouse";
	}


}
