package com.rahmetdonmez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahmetdonmez.model.Admin;
import com.rahmetdonmez.model.Info;

@Repository("inforepo")
public interface BilgiRepository extends JpaRepository<Info,Integer>{

}
