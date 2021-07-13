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
		String  a="<h1>�׽�Ʈ ������Ʈ �ϼ�</h1>";
		a +="<b>�ش� ������Ʈ�� ���ؼ� ���� Ǯ�̸� �����մϴ�</b>";
		return a;
	}
	
	@RequestMapping("/lesson01/quiz01/2")
	@ResponseBody
	public Map<String, Object> printmap(){
		Map<String, Object> map = new HashMap<>();
		
		map.put("����", 80);
		map.put("����", 90);
		map.put("����", 85);
		
		return map;
	}

}
