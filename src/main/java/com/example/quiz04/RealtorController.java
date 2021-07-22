package com.example.quiz04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.quiz04.bo.RealtorBO;
import com.example.quiz04.model.Realtor;

@Controller
@RequestMapping("/lesson04/quiz02")
public class RealtorController {
	
	@Autowired
	RealtorBO realtorBO;
	
	@RequestMapping("/1")
	public String RealtorView() {
		return"lesson04/addRealtor";
	}
	
	@PostMapping("/add_realtor")
	public String addRealtor(
			@ModelAttribute Realtor realtor
			,Model model
			) {
		realtorBO.addRealtor(realtor);
		
		model.addAttribute("result", realtor);
		model.addAttribute("title", "공인중개사 정보");
		
		realtor = realtorBO.infoRealtorId(realtor.getId());
		
		return "/lesson04/infoRealtor";
	}

}
