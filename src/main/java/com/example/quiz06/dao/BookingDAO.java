package com.example.quiz06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.quiz06.model.Booking;

@Repository
public interface BookingDAO {
	
	public List<Booking> selectBooking();
	
	public void deleteBooking(@Param("id") int id);

}
