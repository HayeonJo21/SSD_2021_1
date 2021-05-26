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
	

	
	
	void insertFM(ItemDTO item) throws DataAccessException{
		fleaMarketMapper.insertFM(item);
	};
	
	void updateFM(ItemDTO item) throws DataAccessException{
		fleaMarketMapper.updateFM(item);
	};
	
	void deleteFM(ItemDTO item) throws DataAccessException{
		fleaMarketMapper.deleteFM(item);
	};
	
	

	ItemDTO getFMById(int itemId) throws DataAccessException{
		return fleaMarketMapper.getFMById(itemId);
	};
	
	List<ItemDTO> getFMByUsername(String username) throws DataAccessException{
		return fleaMarketMapper.getFMByUsername(username);
	};
	
	List<ItemDTO> getFMList() throws DataAccessException{
		return fleaMarketMapper.getFMList();
	};

}
