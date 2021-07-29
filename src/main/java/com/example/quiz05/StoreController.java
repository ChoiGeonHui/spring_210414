package com.example.quiz05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson02.bo.StoreBO;
import com.example.lesson02.model.Store;
import com.example.quiz05.bo.NewReviewBO;
import com.example.quiz05.model.NewReview;

@Controller
public class StoreController {
	
	@Autowired
	StoreBO storeBO;
	
	@Autowired
	NewReviewBO newReviewBO;
	
	@RequestMapping("/lesson05/quizstore")
	public String viewStore(Model model) {
		List<Store> list = storeBO.getList();
		model.addAttribute("store", list);	
		return"lesson05/storetemper";
	}
	
	
	
	@PostMapping("/lesson05/selectreview")
	public String review(Model model,
			@RequestParam(value = "storeId") int storeId) {
		List<NewReview> list = newReviewBO.selectreview(storeId);
		Store store= new Store(); 
		store = storeBO.selectstoreName(storeId);
		String  name = store.getName();
		model.addAttribute("name", name);
		if (list.isEmpty()) {
			return "lesson05/storetemper3";
		}else {
			model.addAttribute("review", list);
			return "lesson05/storetemper2";
		}
	}

}
