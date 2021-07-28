package com.example.quiz05;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	
	@RequestMapping("lesson05/addweather")
	public String addweather() {
		
		return "lesson05/addweather";
	}

	
	@PostMapping("/lesson05/insertweather")
	public void insertWeather(
			@RequestParam("date")
			@DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
			@RequestParam("weather")String weather,
			@RequestParam("microDust")String microDust,
			@RequestParam("temperatures")double temperatures,
			@RequestParam("precipitation")double precipitation,
			@RequestParam("windSpeed")double windSpeed,
			HttpServletResponse response
		)throws Exception {
		
		weatherBO.insertWeather(date, weather, microDust, temperatures, precipitation, windSpeed);
		
		
		response.sendRedirect("/lesson05/quizweather");
		
		
	}
	
}
