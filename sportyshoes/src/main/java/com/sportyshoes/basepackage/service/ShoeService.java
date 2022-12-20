package com.sportyshoes.basepackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.basepackage.model.ShoeData;
import com.sportyshoes.basepackage.repository.ShoeRepository;

@Service
public interface ShoeService {
	
	public List<ShoeData> findAll();
//	public ShoeData findByItemName(String shoename);
	public ShoeData insertData(ShoeData shoeData);
	public ShoeData deleteById(long theId);
	public ShoeData findById(long theId);
}
