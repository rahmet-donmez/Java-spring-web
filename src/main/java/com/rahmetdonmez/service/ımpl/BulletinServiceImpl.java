package com.rahmetdonmez.service.ımpl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahmetdonmez.model.Bulletin;
import com.rahmetdonmez.model.Student;
import com.rahmetdonmez.model.Team;
import com.rahmetdonmez.repository.BulletinRepository;
import com.rahmetdonmez.repository.TeamRepository;
import com.rahmetdonmez.service.BulletinService;
import com.rahmetdonmez.service.TeamService;


@Service
@Transactional
public class BulletinServiceImpl implements BulletinService {
	
	@Autowired
	private BulletinRepository bulletin_repo;

	@Override
	@Transactional
	public List<Bulletin> findBulletins() {
		// TODO Auto-generated method stub
		return bulletin_repo.findAll();
	}

	@Override
	@Transactional
	public Bulletin findBulletin(int id) {
		Optional<Bulletin> bulletin=bulletin_repo.findById(id);
		
		
		// TODO Auto-generated method stub
		return bulletin.get();
	}

	@Override
	@Transactional
	public void createBulletin(Bulletin bulletin) {
		bulletin_repo.save(bulletin);
		
	}

	@Override
	@Transactional
	public void updateBulletin(Bulletin bulletin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteBulletin(Bulletin bulletin) {
		bulletin_repo.delete(bulletin);
		
	}

}
