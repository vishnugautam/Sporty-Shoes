package com.sportyshoes.basepackage.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sportyshoes.basepackage.model.ShoeData;
import com.sportyshoes.basepackage.service.ShoeService;

import jakarta.validation.Valid;

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
	 
//	@PostMapping(path = "/{shoename}/shoelist")
//	public ResponseEntity createShoe(@PathVariable String shoename, @Valid @RequestBody ShoeData data) {
//				ShoeData saveData = shoeService.insertData(data);
//				URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//						.buildAndExpand(saveData.getId()).toUri();
//				// created would send 201 
//				return ResponseEntity.created(location).build();
//			}
	@PostMapping(path = "/{shoename}/shoelist")
	public ShoeData createShoe(@PathVariable String shoename, @Valid @RequestBody ShoeData data) {
		ShoeData saveData = shoeService.insertData(data);
		return saveData;
	}
	
	@DeleteMapping(path = "/shoelist/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		ShoeData data = shoeService.deleteById(id);
		if(data != null) {
			// noContent means it would return 204 status code 
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}
	}
	
	