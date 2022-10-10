package com.rahmetdonmez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahmetdonmez.model.Team;

@Repository("team_repo")
public interface TeamRepository extends JpaRepository<Team,Integer>{

}
