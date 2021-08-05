package com.example.quiz06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	//ajax의 요청이 왔을때,
	// - 서버쪽에서 @ResponseBody 어노테이션을 사용해야한다.
	// - 리턴되는 값이 있어야 한다.
	@PostMapping("/lesson06/addweb")
	@ResponseBody
	public String addweb(
			@RequestParam("name")String name,
			@RequestParam("url")String url
			) {
		favoriteBO.insertWeb(name,url);
		return "success";
	}
	
	
	@RequestMapping("/lesson06/selectweb")
	public String selectWeb(Model model) {
		
		List<Favorite> list = new ArrayList<Favorite>();
		list = favoriteBO.selectWeb();
		model.addAttribute("web", list);
		return "/lesson06/viewWeb";
	}
	
	@GetMapping("/lesson06/chk")
	@ResponseBody
	public Map<String, Boolean> checkUrl(
			@RequestParam("url") String url) {
		
		Boolean result= favoriteBO.checkByurl(url);
		
		Map<String, Boolean> map = new HashMap<>();
		map.put("chk", result);
		
		return map;
	}
	
	
	@PostMapping("/lesson06/delete")
	@ResponseBody
	public String delete(
			@RequestParam("url") String url) {
		
		favoriteBO.deleteWeb(url);
		
		return "succes";
	}
	
	

}
