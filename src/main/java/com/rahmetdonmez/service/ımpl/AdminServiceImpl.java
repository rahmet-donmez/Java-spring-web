package com.rahmetdonmez.service.ımpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahmetdonmez.model.Admin;
import com.rahmetdonmez.repository.AdminRepository;
import com.rahmetdonmez.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository admin_repo;

	@Override
	@Transactional
	public List<Admin> findAdmins() {
		// TODO Auto-generated method stub
		return admin_repo.findAll();
	}

	@Override
	@Transactional
	public Admin findAdmin(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void createAdmin(Admin admin) {
		admin_repo.save(admin);

	}

	@Override
	@Transactional
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void deleteAdmin(Admin admin) {
		admin_repo.delete(admin);

	}

}
