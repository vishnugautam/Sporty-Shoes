package com.sportyshoes.basepackage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.basepackage.model.ShoeData;

public interface ShoeRepository extends JpaRepository<ShoeData, Long>{
//	public ShoeData findByItemName(String shoename);
	
}
