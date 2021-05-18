package com.ssd.delivery.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.ItemDTO;
import com.ssd.delivery.domain.OrderDTO;

public interface FleaMarketDao {

	void insert(ItemDTO item) throws DataAccessException;
	
	void update(ItemDTO item) throws DataAccessException;
	void delete(ItemDTO item) throws DataAccessException;

	ItemDTO getFleaMarketById(int itemId) throws DataAccessException;
	List<ItemDTO> getFleaMarketByUsername(String username) throws DataAccessException;
	List<ItemDTO> getFleaMarketList() throws DataAccessException;



}
