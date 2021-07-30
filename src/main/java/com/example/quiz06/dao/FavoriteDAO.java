package com.example.quiz06.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.quiz06.model.Favorite;

@Repository
public interface FavoriteDAO {
	
	public List<Favorite> selectWeb();
	
	public void insertWeb(@Param("name")String name,@Param("url")String url);

}
