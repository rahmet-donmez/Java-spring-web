package com.rahmetdonmez.service.ımpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahmetdonmez.model.Captain;
import com.rahmetdonmez.repository.CaptainRepository;
import com.rahmetdonmez.service.CaptainService;

@Service
@Transactional
public class CaptainServiceImpl implements CaptainService {
	
	@Autowired
	private CaptainRepository captain_repo;

	@Override
	@Transactional
	public List<Captain> findCaptains() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Captain findCaptain(int id) {
		Optional<Captain> captain1=captain_repo.findById(id);
		Captain captain2=captain1.get();
		return captain2;
	}

	@Override
	@Transactional
	public void createCaptain(Captain captain) {
		captain_repo.save(captain);

	}

	@Override
	@Transactional
	public void updateCaptain(Captain captain) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void deleteCaptain(int id) {
		captain_repo.deleteById(id);
	}

}
