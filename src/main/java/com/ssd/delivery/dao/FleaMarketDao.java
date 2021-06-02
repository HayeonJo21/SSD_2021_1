package com.ssd.delivery.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.ItemDTO;

public interface FleaMarketDao {

	void insertFM(ItemDTO item) throws DataAccessException;
	
	void updateFM(ItemDTO item) throws DataAccessException;
	void deleteFM(ItemDTO item) throws DataAccessException;

	ItemDTO getFMById(int itemId) throws DataAccessException;
	List<ItemDTO> getFMByUsername(String username) throws DataAccessException;
	List<ItemDTO> getFMList() throws DataAccessException;



}
