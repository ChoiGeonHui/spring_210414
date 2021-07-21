package com.example.quiz03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz03.bo.Real_estateBO;

@RestController
@RequestMapping("/lesson03/quiz04")
public class RealEstateController3 {
	
	@Autowired
	Real_estateBO real_estateBO;
	
	@RequestMapping("/1")
	public String quiz04(
			@RequestParam("id") int id) {
		int row = real_estateBO.deleteRealEstate(id);
		return "삭제 성공 : "+row;
	}

}
