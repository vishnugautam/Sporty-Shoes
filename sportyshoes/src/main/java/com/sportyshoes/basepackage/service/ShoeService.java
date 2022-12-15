package com.sportyshoes.basepackage.service;

import java.util.List;

import com.sportyshoes.basepackage.model.ShoeData;

public interface ShoeService {
	
	public List<ShoeData> findAll();
	public ShoeData findByShoeName(String shoename);
	public List<ShoeData> insertData();
	public ShoeData deleteById(int theId);
	ShoeData findById(int theId);
}
