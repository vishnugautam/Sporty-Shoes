package com.sportyshoes.basepackage.repository;

import java.util.List;

import com.sportyshoes.basepackage.model.ShoeData;

public interface ShoeRepository {
	
	public List<ShoeData> findAll();
	public ShoeData findByShoeName(String shoename);
	public List<ShoeData> insertData();
	public ShoeData deleteById(int theId);
	ShoeData findById(int theId);
	
}
