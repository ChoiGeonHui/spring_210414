package com.example.quiz04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.quiz04.bo.SellerBO;

@Controller
@RequestMapping("/lesson04/quiz01")
public class SellerController {
	
	@Autowired
	SellerBO sellerBO;
	
	@RequestMapping("/1")
	public String sellerView() {
		return"lesson04/addSeller";
	}
	
	@PostMapping("/add_seller")
	public String addSellerView (
			@RequestParam("name") String name,
			@RequestParam(value = "url",required = false) String url,
			@RequestParam("temper") double temper
			){
		sellerBO.insertSeller(name, url, temper);
		return "lesson04/afterAddSeller";
	}

}
