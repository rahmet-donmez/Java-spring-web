package com.rahmetdonmez.service.ımpl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahmetdonmez.model.Student;
import com.rahmetdonmez.model.Team;
import com.rahmetdonmez.repository.TeamRepository;
import com.rahmetdonmez.service.TeamService;


@Service
@Transactional
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamRepository team_repo;

	@Override
	@Transactional
	public List<Team> findTeams() {
		// TODO Auto-generated method stub
		return team_repo.findAll();
	}

	@Override
	@Transactional
	public Team findTeam(int id) {
		Optional<Team> team=team_repo.findById(id);
		
		
		// TODO Auto-generated method stub
		return team.get();
	}

	@Override
	@Transactional
	public void createTeam(Team team) {
		team_repo.save(team);
		
	}

	@Override
	@Transactional
	public void updateTeam(Team team) {
		team_repo.save(team);
		
	}

	@Override
	@Transactional
	public void deleteTeam(Team team) {
		team_repo.delete(team);
		
	}

	/*
	 * @Override
	 * 
	 * @Transactional public Set<Student> findStudents(int id) { Team
	 * team=team_repo.findById(Integer.valueOf(id)).get(); Set<Student>
	 * students=team.getStudents(); return students; }
	 */

}
