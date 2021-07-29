package com.example.quiz05.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.quiz05.model.NewReview;

@Repository
public interface NewReviewDAO {
	
	public List<NewReview> selectreview(@Param("storeId") int storeId);
	
}
