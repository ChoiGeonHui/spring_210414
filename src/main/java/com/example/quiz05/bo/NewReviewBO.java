package com.example.quiz05.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.bo.StoreBO;
import com.example.quiz05.dao.NewReviewDAO;
import com.example.quiz05.model.NewReview;

@Service
public class NewReviewBO {

	@Autowired
	NewReviewDAO newReviewDAO;
	
	public List<NewReview> selectreview(int storeId){
		return newReviewDAO.selectreview(storeId);
	}
	

}
