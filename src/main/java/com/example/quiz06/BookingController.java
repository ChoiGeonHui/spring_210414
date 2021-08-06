package com.example.quiz06;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.quiz06.bo.BookingBO;
import com.example.quiz06.model.Booking;

@Controller
public class BookingController {
	
	@Autowired
	BookingBO bookingBO;
	
	@RequestMapping("lesson06/bookingView")
	public String view() {
		return "lesson06/bookingView";
	}
	
	@RequestMapping("/lesson06/addbooking")
	public String addview() {
		return "lesson06/addbooking";
	}

	//리스트보기
	@RequestMapping("/lesson06/bookinglist")
	public String bookingList(Model model) {
		
		List<Booking> list = bookingBO.selectBooking();
		model.addAttribute("booking", list);
		
		return "lesson06/bookingList";
	}
	
	
	//삭제
	@PostMapping("/lesson06/deletebooking")
	@ResponseBody
	public String deleteBooking(
			@RequestParam("id") int id) {
		
		bookingBO.deleteBooking(id);
		
		return "success";
	}
	
	
	//예약 추가
	@PostMapping("/lesson06/addbooking")
	@ResponseBody
	public String addBooking(
			@RequestParam("name") String name,
			@DateTimeFormat(pattern =  "yyyy-MM-dd") Date date,
			@RequestParam("day") int day,
			@RequestParam("headcount") int headcount,
			@RequestParam("phoneNumber") String phoneNumber
			) {
		
		bookingBO.insertBooking(name, date, day, headcount, phoneNumber);
		
		return "success";
	}
	
	//예약확인
	@PostMapping("/lesson06/chkbooking")
	@ResponseBody
	public Map<String, Booking> checkBooking(
			@RequestParam("name") String name,
			@RequestParam("phoneNumber") String phoneNumber
			) {
		Booking booking = new Booking();
		Map<String, Booking> map = new HashMap<>();
		booking =  bookingBO.checkBooking(name, phoneNumber);
		map.put("chkBooking", booking);
		
		return map;
	}
	
	
	
}
