package com.rahmetdonmez.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rahmetdonmez.model.Captain;


public interface CaptainService {
	List<Captain> findCaptains();
	Captain findCaptain(int id);
	void createCaptain(Captain captain);
	void updateCaptain(Captain captain);
	void deleteCaptain(int id);

}
