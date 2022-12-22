package com.sportyshoes.basepackage.repository;

import org.springframework.stereotype.Repository;

import com.sportyshoes.basepackage.model.Admin;

@Repository
public interface AdminRepository {
	
	public Admin authenticate(String adminName, String password);

	
}
