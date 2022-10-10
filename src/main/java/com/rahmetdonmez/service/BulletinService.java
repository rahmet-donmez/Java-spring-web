package com.rahmetdonmez.service;

import java.util.List;
import java.util.Set;

import com.rahmetdonmez.model.Bulletin;
import com.rahmetdonmez.model.Captain;
import com.rahmetdonmez.model.Student;
import com.rahmetdonmez.model.Team;

public interface BulletinService {
	List<Bulletin> findBulletins();
	Bulletin findBulletin(int id);
	void createBulletin(Bulletin bulletin);
	void updateBulletin(Bulletin bulletin);
	void deleteBulletin(Bulletin bulletin);

}
