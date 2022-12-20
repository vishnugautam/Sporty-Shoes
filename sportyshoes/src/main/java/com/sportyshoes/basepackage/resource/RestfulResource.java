package com.sportyshoes.basepackage.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.basepackage.model.ShoeData;
import com.sportyshoes.basepackage.service.ShoeService;

@RestController
public class RestfulResource {

	@Autowired
	private ShoeService shoeService;
	
	@GetMapping(path = "/{shoename}/shoelist")
	public List<ShoeData> getAllShoes(){
		System.out.println("shoes from Restful resource");
		return shoeService.findAll();
	}
	
	@GetMapping(path = "/shoelist/{id}")
	public ShoeData getShoeById(@PathVariable int id) {
		ShoeData shoeData = shoeService.findById(id);
		return shoeData;
	}
	
	
	
}