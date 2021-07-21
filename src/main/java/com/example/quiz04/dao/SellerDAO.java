package com.example.quiz04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.quiz04.model.Seller;

@Repository
public interface SellerDAO {
	
	public void insertSeller(
			@Param("name") String name,
			@Param("url") String url,
			@Param("temper") double temper);

	
	public Seller infoSeller();
	
	public Seller infoSellerId(@Param("id")Integer id);
}
