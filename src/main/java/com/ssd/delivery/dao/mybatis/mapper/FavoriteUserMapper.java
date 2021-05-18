package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssd.delivery.domain.FavoriteUserDTO;
@Mapper
public interface FavoriteUserMapper {

	void create(FavoriteUserDTO favoriteUser);
	
	void update(FavoriteUserDTO favoriteUser);
	
	void remove(String username);
	
	FavoriteUserDTO getFUByUsername(String username);
	
	List<FavoriteUserDTO> getFUList();
}