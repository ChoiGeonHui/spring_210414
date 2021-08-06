package com.example.quiz06.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.quiz06.model.Booking;

@Repository
public interface BookingDAO {
	
	public List<Booking> selectBooking();
	
	public void deleteBooking(@Param("id") int id);
	
	public void insertBooking(
			@Param("name") String name,
			@Param("date") Date date,
			@Param("day") int day,
			@Param("headcount") int headcount,
			@Param("phoneNumber") String phoneNumber
			);
	
	public Booking checkBooking(@Param("name") String name,
			@Param("phoneNumber") String phoneNumber);

}
