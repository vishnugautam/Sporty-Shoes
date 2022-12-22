package com.sportyshoes.basepackage.service;

import org.springframework.stereotype.Service;

import com.sportyshoes.basepackage.model.Admin;

@Service
public interface AdminService {
	public Admin authenticate(String adminName, String password);
}
