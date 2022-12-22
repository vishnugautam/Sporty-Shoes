package com.sportyshoes.basepackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.basepackage.model.Admin;
import com.sportyshoes.basepackage.repository.AdminRepository;


@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
	
	public AdminServiceImpl() {
		super();
	}
	
	private AdminRepository adminRepository;
	
	@Autowired
	public void setAdminRepository(AdminRepository adminRepository) {
		System.out.println("spring ioc container invoked setter method to assemble 'todoRepository' bean");
		this.adminRepository = adminRepository;
	}
	
	@Override
	public Admin authenticate(String adminName, String password) {
		return adminRepository.authenticate(adminName, password);
		
	}

}
