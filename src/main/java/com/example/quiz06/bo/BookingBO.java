package com.example.quiz06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz06.dao.BookingDAO;
import com.example.quiz06.model.Booking;

@Service
public class BookingBO {
	
	@Autowired
	BookingDAO bookingDAO;
	
	public List<Booking> selectBooking(){
		return bookingDAO.selectBooking();
	}
	
	public void deleteBooking(int id) {
		bookingDAO.deleteBooking(id);
	}

}
