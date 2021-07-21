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
	
	
	public int insertestate(Real_estate real_estate) {
		return real_estateDAO.insertestate(real_estate);
	}
	
	public int insertestateField(
		int realtor_id,String address,int area,String type,int price,int rentPrice
			) {
		return real_estateDAO.insertestateField(
				realtor_id,address,area,type,price,rentPrice);
	};
	
	
	public int updateRealEstate(int id,int price,String type) {
		return real_estateDAO.updateRealEstate(id, price, type);
	}
	
	public int deleteRealEstate(int id) {
		return real_estateDAO.deleteRealEstate(id);
	}
	
	
	
}
