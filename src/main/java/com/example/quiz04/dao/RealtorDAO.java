package com.example.quiz04.dao;

import org.springframework.stereotype.Repository;

import com.example.quiz04.model.Realtor;

@Repository
public interface RealtorDAO {
	
	public void addRealtor(Realtor realtor);
	
	public Realtor infoRealtorId(int id);

}
