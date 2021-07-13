package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Quiz01Controller {
	
	
	@RequestMapping("/lesson01/quiz01/1")
	@ResponseBody
	public String print1() {
		String  a="<h1>테스트 프로젝트 완성</h1>";
		a +="<b>해당 프로젝트를 통해서 문제 풀이를 진행합니다</b>";
		return a;
	}
	
	@RequestMapping("/lesson01/quiz01/2")
	@ResponseBody
	public Map<String, Object> printmap(){
		Map<String, Object> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 85);
		
		return map;
	}

}
