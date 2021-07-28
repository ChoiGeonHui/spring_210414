package com.example.quiz05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherController {
	
	@RequestMapping("/lesson05/quizweather")
	public String view() {
		return "lesson05/quizweather";
	}

}
