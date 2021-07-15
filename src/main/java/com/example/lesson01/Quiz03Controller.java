package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Quiz03Controller {
	
	@RequestMapping("lesson01/quiz/3")
	public String quiz3() {
		return "/lesson01/quiz03_1";
	}

}
