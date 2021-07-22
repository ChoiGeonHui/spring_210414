package com.example.quiz04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz04.dao.RealtorDAO;
import com.example.quiz04.model.Realtor;

@Service
public class RealtorBO {
	
	@Autowired
	RealtorDAO realtorDAO;
	
	public void addRealtor(Realtor realtor) {
		realtorDAO.addRealtor(realtor);
	}
	
	public Realtor infoRealtorId(int id) {
		return realtorDAO.infoRealtorId(id);
	}

}
