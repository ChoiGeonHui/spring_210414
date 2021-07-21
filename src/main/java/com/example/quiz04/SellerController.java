package com.example.quiz04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.quiz04.bo.SellerBO;
import com.example.quiz04.model.Seller;

@Controller
@RequestMapping("/lesson04/quiz04")
public class SellerController {
	
	@Autowired
	SellerBO sellerBO;
	
	@RequestMapping(path = "/1",method = RequestMethod.GET)
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
	
	
	@GetMapping("/seller_info")
	public String sellerInfo(Model model,
			@RequestParam(value = "id",required = false) Integer id) {
		Seller seller;
		if(id==null){
		seller = sellerBO.infoSeller();
		}
		else {	
			seller = sellerBO.infoSellerId(id);
		}
		
		model.addAttribute("result", seller);
		model.addAttribute("subject", "판매자정보");
		return "/lesson04/infoSeller";
	}

}
