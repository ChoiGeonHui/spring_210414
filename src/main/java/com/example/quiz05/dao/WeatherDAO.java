package com.example.quiz05.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.quiz05.model.Weather;

@Repository
public interface WeatherDAO {
	
	public List<Weather> selectWeather();
	
	public void insertWeather(
			@Param("date")Date date,
			@Param("weather")String weather,
			@Param("microDust")String microDust,
			@Param("temperatures")double temperatures,
			@Param("precipitation")double precipitation,
			@Param("windSpeed")double windSpeed
			);

}
