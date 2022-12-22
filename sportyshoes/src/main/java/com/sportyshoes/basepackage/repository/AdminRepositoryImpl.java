package com.sportyshoes.basepackage.repository;

import org.springframework.stereotype.Repository;

import com.sportyshoes.basepackage.model.Admin;

import jakarta.servlet.http.HttpSession;

@Repository(value = "adminRepository")
public class AdminRepositoryImpl implements AdminRepository {

	public Admin authenticate(String adminName, String password) {
		
		Admin admin = new Admin();
		if(adminName != "vishnu" && password != "12345") {
			return null;
		}
		return admin;
	}

}
