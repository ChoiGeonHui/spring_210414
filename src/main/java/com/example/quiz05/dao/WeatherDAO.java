package com.example.quiz05.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.quiz05.model.Weather;

@Repository
public interface WeatherDAO {
	
	public List<Weather> selectWeather();

}
