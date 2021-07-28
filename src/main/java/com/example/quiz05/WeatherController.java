package com.example.quiz05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.quiz05.bo.WeatherBO;
import com.example.quiz05.model.Weather;


@Controller
public class WeatherController {
	
	@Autowired
	WeatherBO weatherBO;
	
	@RequestMapping("/lesson05/quizweather")
	public String view(Model model) {
		
		List<Weather> weathers = weatherBO.selectWeather();
		
		
		model.addAttribute("weather", weathers);
		
		return "lesson05/quizweather";
	}

}
