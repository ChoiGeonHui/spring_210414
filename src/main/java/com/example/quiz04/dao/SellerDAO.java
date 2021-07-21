package com.example.quiz04.dao;

import org.apache.ibatis.annotations.Param;

public interface SellerDAO {
	
	public void insertSeller(
			@Param("name") String name,
			@Param("url") String url,
			@Param("temper") double temper);

}
