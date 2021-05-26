package com.ssd.delivery.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.ssd.delivery.dao.ItemDao;
import com.ssd.delivery.dao.mybatis.mapper.FleaMarketMapper;
import com.ssd.delivery.dao.mybatis.mapper.ItemMapper;
import com.ssd.delivery.domain.Item;
import com.ssd.delivery.domain.ItemDTO;
import com.ssd.delivery.domain.LineItem;
import com.ssd.delivery.domain.Order;

public class MybatisFleaMarketDao {
	
	
	@Autowired
	private ItemMapper itemMapper;
	private FleaMarketMapper fleaMarketMapper;
	

	
	
	void insert(ItemDTO item) throws DataAccessException{
		fleaMarketMapper.insert(item);
	};
	
	void update(ItemDTO item) throws DataAccessException{
		fleaMarketMapper.update(item);
	};
	
	void delete(ItemDTO item) throws DataAccessException{
		fleaMarketMapper.delete(item);
	};
	
	

	ItemDTO getFleaMarketById(int itemId) throws DataAccessException{
		return fleaMarketMapper.getFleaMarketById(itemId);
	};
	
	List<ItemDTO> getleaMarketByUsername(String username) throws DataAccessException{
		return fleaMarketMapper.getFleaMarketByUsername(username);
	};
	
	List<ItemDTO> getFleaMarketList() throws DataAccessException{
		return fleaMarketMapper.getFleaMarketList();
	};

}
