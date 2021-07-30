package com.example.quiz06;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.quiz06.bo.FavoriteBO;
import com.example.quiz06.model.Favorite;

@Controller
public class Quiz06Controller {
	
	@Autowired
	FavoriteBO favoriteBO;
	
	@RequestMapping("/lesson06/quiz01")
		public String quiz01() {
			return "/lesson06/addweb";
		}
	
	@PostMapping("lesson06/addweb")
	@ResponseBody
	public void addweb(
			@RequestParam("name")String name,
			@RequestParam("url")String url
			) {
		favoriteBO.insertWeb(name,url);
	}
	
	
	@RequestMapping("/lesson06/selectweb")
	public String selectWeb(Model model) {
		
		List<Favorite> list = new ArrayList<Favorite>();
		list = favoriteBO.selectWeb();
		model.addAttribute("web", list);
		return "/lesson06/viewWeb";
	}
	
	

}
