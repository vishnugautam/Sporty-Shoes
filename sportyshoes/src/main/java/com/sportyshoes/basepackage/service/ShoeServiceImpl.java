package com.sportyshoes.basepackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.basepackage.model.ShoeData;
import com.sportyshoes.basepackage.repository.ShoeRepository;

@Service(value = "todoService")
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
	public ShoeData insertData(ShoeData shoeData) {
		return shoeRepository.save(shoeData);
	}

	@Override
	public ShoeData deleteById(long theId) {
		shoeRepository.deleteById(theId);
		return null;
	}

	@Override
	public ShoeData findById(long theId) {
		return shoeRepository.findById(theId).get();
	}

//	@Override
//	public ShoeData findByItemName(String shoename) {
//		return shoeRepository.findByItemName(shoename);
//	}

}
