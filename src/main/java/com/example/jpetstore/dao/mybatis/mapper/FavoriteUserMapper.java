package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import com.example.jpetstore.domain.FavoriteUserDTO;

public interface FavoriteUserMapper {

	void create(FavoriteUserDTO favoriteUser);
	
	void update(FavoriteUserDTO favoriteUser);
	
	void remove(String username);
	
	FavoriteUserDTO getFUByUsername(String username);
	
	List<FavoriteUserDTO> getFUList();
}
