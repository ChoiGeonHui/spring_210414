package com.example.quiz06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz06.dao.FavoriteDAO;
import com.example.quiz06.model.Favorite;

@Service
public class FavoriteBO {
	
	@Autowired
	FavoriteDAO favoriteDAO;
	
	public List<Favorite> selectWeb(){
		return favoriteDAO.selectWeb();
	};
	
	public void insertWeb(String name ,String url) {
		favoriteDAO.insertWeb(name,url);
	}
	
	public boolean checkByurl(String url) {
	 return	favoriteDAO.checkByurl(url);
	}
	
	public void deleteWeb(String url) {
		favoriteDAO.deleteWeb(url);
	}

}
