package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssd.delivery.domain.FavoriteUserDTO;
@Mapper
public interface FavoriteUserMapper {

	void insert(FavoriteUserDTO favoriteUser);
	
	void update(FavoriteUserDTO favoriteUser);
	
	void delete(String username);
	
	FavoriteUserDTO getFUByUsername(String username);
	
	List<FavoriteUserDTO> getFUList();
}
