package com.rahmetdonmez.service;

import java.util.List;
import java.util.Set;

import com.rahmetdonmez.model.Captain;
import com.rahmetdonmez.model.Student;
import com.rahmetdonmez.model.Team;

public interface TeamService {
	//Set<Student> findStudents(int id);
	List<Team> findTeams();
	Team findTeam(int id);
	void createTeam(Team team);
	void updateTeam(Team team);
	void deleteTeam(Team team);

}
