package com.example.quiz04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz04.dao.SellerDAO;
import com.example.quiz04.model.Seller;

@Service
public class SellerBO {
	
	@Autowired
	SellerDAO sellerDAO;

	public void insertSeller(
			String name,String url,double temper
			) {
		sellerDAO.insertSeller(name, url, temper);
	}
	
	public Seller infoSeller() {
		return sellerDAO.infoSeller();
	}
	
	public Seller infoSellerId(Integer id) {
		return sellerDAO.infoSellerId(id);
	}
}
