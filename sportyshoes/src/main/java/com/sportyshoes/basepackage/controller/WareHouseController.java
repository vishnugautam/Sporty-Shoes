package com.sportyshoes.basepackage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sportyshoes.basepackage.model.ShoeData;
import com.sportyshoes.basepackage.resource.RestfulResource;
import com.sportyshoes.basepackage.service.ShoeService;

@Controller
//@RequestMapping(path = "/entry.html")
public class WareHouseController {
	
	@Autowired
	private RestfulResource resource;
	
	@RequestMapping(path="/entry.html", method=RequestMethod.GET)
	public ModelAndView returnBack() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("shoelist", "Back again");
		return modelAndView;
	}
	
	@RequestMapping(path = "/entry.html", method = RequestMethod.POST)
	public ModelAndView dataEntry() {
		
		ModelAndView modelAndView = new ModelAndView();
//		List<ShoeData> shoelist = resource.getAllShoes();
//		modelAndView.setViewName("entry");
		modelAndView.addObject("shoelist", "hello there");
		return modelAndView;
	}
	
	@RequestMapping(value="/getallitem", method=RequestMethod.GET)
	// Model is used for adding attributes to the model
	// it is used to transfer data between the view and controller of Spring MVC application
	// it acts as a data container that contains the data of the application
	// the stored data can be of any form such as String, Object, data from Database etc. 
	public String getAllItem(Model model) {
		List<ShoeData> totalShoes = resource.getAllShoes();
		model.addAttribute("totalShoes", totalShoes);
//		List<ShoeData> totalShoes = new ArrayList<ShoeData>();
//		ShoeData data = (ShoeData) resource.getAllShoes();
//		totalShoes.add(data);
//		System.out.println(totalShoes);
		return "warehouse";
	}
	
	@RequestMapping(value="/additem", method=RequestMethod.POST)
	public String insertItem(Model model, @RequestParam(value = "shoe_name") String shoename, ShoeData data) {
//		ShoeData data = new ShoeData();
//		ShoeData data = (ShoeData) model.getAttribute("additem");
//		String shoeName = data.getShoeName();
//		System.out.println(shoename);
//		System.out.println(data);
//		ResponseEntity<ShoeData> insertAShoe = resource.createShoe(shoename, data);
//		ShoeData responseBody = insertAShoe.getBody();
//		System.out.println(responseBody);
//		ModelAndView mav = new ModelAndView();
//		data = resource.createShoe(shoename, data);
//		mav.setViewName("warehouse");
//		mav.addObject("totalshoes", data);
		data = resource.createShoe(shoename, data);
		// the data is a class, so we have to convert it into List for the JSTL to iterate
		List<ShoeData> convertedData = new ArrayList<ShoeData>();
		convertedData.add(data);
		System.out.println(data.getClass());
		model.addAttribute("totalShoes", convertedData);
		return "warehouse";
	}
	
	@RequestMapping(value = "deletebyid", method=RequestMethod.POST)
	public String deleteById( int id) {
		String shoename = "shoe";
		ResponseEntity data = resource.delete(shoename, id);
		return "redirect:entry";
	}

}
