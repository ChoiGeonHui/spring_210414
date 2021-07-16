package com.example.quiz03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz03.bo.Real_estateBO;
import com.example.quiz03.model.Real_estate;

@RestController
public class RestReal_estateController {
	
	
	@Autowired
	Real_estateBO real_estateBO;
	
	
	@RequestMapping("/lesson03/quiz01/1")
	public Real_estate quiz01(
			@RequestParam(value = "id") int id
			) {
		return real_estateBO.getRealid(id);
	}

	
	@RequestMapping("/lesson03/quiz01/2")
	public List<Real_estate> quiz02(
			@RequestParam(value = "rentPrice") int rentPrice
			) {
		List<Real_estate> list = real_estateBO.getReal2(rentPrice);
		return  list;
	}
	
	
	@RequestMapping("/lesson03/quiz01/3")
	public List<Real_estate> quiz03(
			@RequestParam(value = "area") int area,
			@RequestParam(value = "price") int price
			) {
		return  real_estateBO.getReal3(area,price);
	}
	
}
