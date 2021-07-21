package com.example.quiz03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.quiz03.model.Real_estate;

@Repository
public interface Real_estateDAO {
	
	public Real_estate selectReal(@Param("id") int id);
	
	public List<Real_estate> selectReal2(@Param("rentPrice") int rentPrice);
	
	public List<Real_estate> selectReal3(@Param("area") int area,
			@Param("price")int price);

	public int insertestate(Real_estate real_estate);
	
	public int insertestateField(
			@Param("realtor_id") int id,
			@Param("address") String address,
			@Param("area") int area,
			@Param("type") String type,
			@Param("price") int price,
			@Param("rentPrice") int rentPrice);
	
	public int updateRealEstate(
			@Param("id")int id,
			@Param("price")int price,
			@Param("type")String type
			);
	
	public int deleteRealEstate(int id);
}
