package com.ssd.delivery.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.FavoriteUserDTO;

public interface FavoriteUserDao {

	void create(FavoriteUserDTO favoriteUser) throws DataAccessException;
	
	void update(FavoriteUserDTO favoriteUser) throws DataAccessException;
	
	void delete(String username) throws DataAccessException;
	
	FavoriteUserDTO getFUByUsername(String username) throws DataAccessException;
	
	List<FavoriteUserDTO> getFUList() throws DataAccessException;
}
