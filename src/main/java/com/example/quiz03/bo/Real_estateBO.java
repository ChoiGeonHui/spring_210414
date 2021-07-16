package com.example.quiz03.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz03.dao.Real_estateDAO;
import com.example.quiz03.model.Real_estate;

@Service
public class Real_estateBO {
	
	@Autowired
	Real_estateDAO real_estateDAO;
	
	public Real_estate getRealid(int id) {
		return real_estateDAO.selectReal(id);
	}
	
	public List<Real_estate> getReal2(int rentPrice){
		return real_estateDAO.selectReal2(rentPrice);
	}

	
	public List<Real_estate> getReal3(int area,int price){
		return real_estateDAO.selectReal3(area,price);
	}
}
