package com.example.quiz03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz03.bo.Real_estateBO;

@RestController
@RequestMapping("lesson03/quiz03")
public class RealEstateController2 {
	
	@Autowired
	Real_estateBO real_estateBO;
	
	@RequestMapping("/1")
	public String quiz03(
			@RequestParam("id") int id,
			@RequestParam("price") int price,
			@RequestParam("type") String type
			) {
		int row = real_estateBO.updateRealEstate(id,price,type);
		return "수정 성공 : "+row;
	}
	

}
