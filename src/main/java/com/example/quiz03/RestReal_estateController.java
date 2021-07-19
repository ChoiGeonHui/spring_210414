package com.example.quiz03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz03.bo.Real_estateBO;
import com.example.quiz03.model.Real_estate;

@RestController
@RequestMapping("/lesson03")
public class RestReal_estateController {
	
	
	@Autowired
	Real_estateBO real_estateBO;
	
	
	@RequestMapping("/quiz01/1")
	public Real_estate quiz01(
			@RequestParam(value = "id") int id
			) {
		return real_estateBO.getRealid(id);
	}

	
	@RequestMapping("/quiz01/2")
	public List<Real_estate> quiz02(
			@RequestParam(value = "rentPrice") int rentPrice
			) {
		List<Real_estate> list = real_estateBO.getReal2(rentPrice);
		return  list;
	}
	
	
	@RequestMapping("/quiz01/3")
	public List<Real_estate> quiz03(
			@RequestParam(value = "area") int area,
			@RequestParam(value = "price") int price
			) {
		return  real_estateBO.getReal3(area,price);
	}

	
	@RequestMapping("/quiz02/1")
	public String quiz04() {
			Real_estate real_estate = new Real_estate();
			real_estate.setRealtorId(3);
			real_estate.setAddress("푸르지용 리버 303동 1104호");
			real_estate.setArea(89);
			real_estate.setType("매매");
			real_estate.setPrice(100000);
			
			int row = real_estateBO.insertestate(real_estate);
			return "입력 성공 : "+ row;
	}
	
	
	
	@RequestMapping("/quiz02/2")
	public String quiz05(
			@RequestParam("realtor_id") int realtor_id
			) {	
			int row = real_estateBO.insertestateField(
					realtor_id,
					"썅떼빌리버 오피스텔 814호",
					45,"월세",100000,120);
			return "입력 성공 : "+ row;
	}
	
}


