package com.ssd.delivery.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.ItemDTO;
import com.ssd.delivery.domain.OrderDTO;

public interface FleaMarketDao {

	void create(ItemDTO item) throws DataAccessException;
	void update(ItemDTO item) throws DataAccessException;
	void remove(ItemDTO item) throws DataAccessException;

	ItemDTO getFleaMarketById(int itemId) throws DataAccessException;
	List<ItemDTO> findFleaMarketByUsername(String username) throws DataAccessException;
	List<ItemDTO> findFleaMarketList() throws DataAccessException;



}