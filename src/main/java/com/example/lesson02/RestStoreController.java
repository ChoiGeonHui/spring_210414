package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.StoreBO;
import com.example.lesson02.model.Store;

@RestController
public class RestStoreController {
	
	@Autowired
	private StoreBO storeService;
	
	@RequestMapping("/lesson02/quiz01")
	public List<Store> printList(){
		List<Store> list = storeService.getList();
		return  list;
	}

}
