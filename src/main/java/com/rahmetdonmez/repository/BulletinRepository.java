package com.rahmetdonmez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahmetdonmez.model.Bulletin;
import com.rahmetdonmez.model.Team;

@Repository("bulletin_repo")
public interface BulletinRepository extends JpaRepository<Bulletin,Integer>{

}
