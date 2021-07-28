package com.example.quiz05.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz05.dao.WeatherDAO;
import com.example.quiz05.model.Weather;

@Service
public class WeatherBO {
	
	@Autowired
	WeatherDAO weatherDAO;
	
	
	public List<Weather> selectWeather(){
		return weatherDAO.selectWeather();
	}

}
