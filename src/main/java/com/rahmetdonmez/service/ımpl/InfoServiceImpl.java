 package com.rahmetdonmez.service.ımpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahmetdonmez.model.Info;
import com.rahmetdonmez.repository.BilgiRepository;
import com.rahmetdonmez.service.BilgiService;

@Service
@Transactional
public class InfoServiceImpl implements BilgiService {

	@Autowired
	private BilgiRepository inforepo;
	
	@Override
	@Transactional
	public List<Info> findInfo() {
		
		return inforepo.findAll();
	}

	@Override
	@Transactional
	public void createBilgi(Info bilgi) {
		inforepo.save(bilgi);
		
	}

	@Override
	@Transactional
	public void deleteBilgi() {
		
	}

}
