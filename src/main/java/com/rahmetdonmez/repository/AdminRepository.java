package com.rahmetdonmez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahmetdonmez.model.Admin;

@Repository("admin_repo")
public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
