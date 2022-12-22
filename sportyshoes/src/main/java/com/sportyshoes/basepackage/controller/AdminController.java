package com.sportyshoes.basepackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sportyshoes.basepackage.model.Admin;
import com.sportyshoes.basepackage.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/loginaction", method = RequestMethod.POST)
	public String loginAction(ModelMap map, @RequestParam(value="adminname") String adminName, @RequestParam(value="password") String password) {
		
		Admin admin = adminService.authenticate(adminName, password);
		if(admin == null) {
			map.addAttribute("error", "admin name or password is wrong");
			return null;
		}
		return "entry";
		
	}
}
