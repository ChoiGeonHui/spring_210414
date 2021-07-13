package com.example.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

@RequestMapping("/lesson01/quiz02")
@RestController
public class Quiz02Controller {
	
	
	@RequestMapping("1")
	public List<Map<String, Object>> printlist(){
		Map<String, Object> map = new HashMap<>();
		List<Map<String, Object>> list = new ArrayList<>();
		
		map.put("rate",15);
		map.put("director","����ȣ");
		map.put("time",131);
		map.put("title","�����");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate",0);
		map.put("director","�κ����� ���ϴ�");
		map.put("time",116);
		map.put("title","�λ��� �Ƹ��ٿ�");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate",12);
		map.put("director","ũ�������� ���");
		map.put("time",147);
		map.put("title","�μ���");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate",19);
		map.put("director","������");
		map.put("time",133);
		map.put("title","���˿��� ����: ���۳�� �����ô�");
		list.add(map);
		
		map = new HashMap<>();
		map.put("rate",15);
		map.put("director","�����ý� �η���");
		map.put("time",137);
		map.put("title","��Ű���");
		list.add(map);
		
		
		return list;
		
	}
	
	@RequestMapping("/2")
	public List<Ex01> printlist2(){
		List<Ex01> list = new ArrayList<>();
		Ex01 ex = new Ex01();
		ex.setTitle("�ȳ��ϼ��� �����λ� �帳�ϴ�.");
		ex.setUser("hagulu");
		ex.setContent("�ȳ��ϼ���, �����߾��. ������ �� ��Ź �帳�ϴ�. Ȱ�� ������ �ϰڽ��ϴ�");
		list.add(ex);
		

		ex = new Ex01();
		ex.setTitle("�� ���");
		ex.setUser("bada");
		ex.setContent("���� ������� ����... �ݿ�������");
		list.add(ex);
		
		

		ex = new Ex01();
		ex.setTitle("���� ����Ʈ �� �̾߱� �ص帱�Կ�");
		ex.setUser("dulumary");
		ex.setContent("....");
		list.add(ex);
		return list;
	}
	
	
	@RequestMapping("/3")
	public ResponseEntity<Ex01> printlist3(){
		List<Ex01> list = printlist2();
		
		return new ResponseEntity<>(list.get(0), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
