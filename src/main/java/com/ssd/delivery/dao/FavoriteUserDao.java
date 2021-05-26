package com.ssd.delivery.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.FavoriteUserDTO;

public interface FavoriteUserDao {

	void insertFU(FavoriteUserDTO favoriteUser) throws DataAccessException;
	
	void updateFU(FavoriteUserDTO favoriteUser) throws DataAccessException;
	
	void deleteFU(String username) throws DataAccessException;
	
	FavoriteUserDTO getFUByUsername(String username) throws DataAccessException;
	
	List<FavoriteUserDTO> getFUList() throws DataAccessException;
}
