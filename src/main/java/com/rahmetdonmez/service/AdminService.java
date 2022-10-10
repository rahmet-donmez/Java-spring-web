package com.rahmetdonmez.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rahmetdonmez.model.Admin;


public interface AdminService  {
	List<Admin> findAdmins();
	Admin findAdmin(int id);
	void createAdmin(Admin admin);
	void updateAdmin(Admin admin);
	void deleteAdmin(Admin admin);
}


