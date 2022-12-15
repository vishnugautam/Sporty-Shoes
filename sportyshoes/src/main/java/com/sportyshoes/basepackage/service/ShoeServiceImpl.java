package com.sportyshoes.basepackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sportyshoes.basepackage.model.ShoeData;
import com.sportyshoes.basepackage.repository.ShoeRepository;

public class ShoeServiceImpl implements ShoeService {
	
	public ShoeServiceImpl() {
		super();
	}
	
	private ShoeRepository shoeRepository;
	
	@Autowired
	public void setShoeRepository(ShoeRepository shoeRepository) {
		System.out.println("spring ioc container invoked setter method to assemble 'todoRepository' bean");
		this.shoeRepository = shoeRepository;
	}

	@Override
	public List<ShoeData> findAll() {
		return shoeRepository.findAll();
	}

	@Override
	public ShoeData findByShoeName(String shoename) {
		return shoeRepository.findByShoeName(shoename);
	}

	@Override
	public List<ShoeData> insertData() {
		return shoeRepository.insertData();
	}

	@Override
	public ShoeData deleteById(int theId) {
		return shoeRepository.deleteById(theId);
	}

	@Override
	public ShoeData findById(int theId) {
		return shoeRepository.findById(theId);
	}

}
