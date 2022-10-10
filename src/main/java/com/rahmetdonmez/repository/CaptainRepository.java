package com.rahmetdonmez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahmetdonmez.model.Captain;

@Repository("captain_repo")
public interface CaptainRepository extends JpaRepository<Captain,Integer>{

}
