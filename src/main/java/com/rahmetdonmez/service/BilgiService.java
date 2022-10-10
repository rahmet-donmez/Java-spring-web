package com.rahmetdonmez.service;

import java.util.List;

import com.rahmetdonmez.model.Info;

public interface BilgiService {
	List<Info> findInfo();
	void createBilgi(Info bilgi);
	void deleteBilgi();
	

}
