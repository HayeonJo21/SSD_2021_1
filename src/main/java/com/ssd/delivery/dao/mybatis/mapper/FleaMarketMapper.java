package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import com.ssd.delivery.domain.ItemDTO;

public interface FleaMarketMapper {
	
	void insert(ItemDTO item);
	void update(ItemDTO item);
	void delete(ItemDTO item);

	ItemDTO getFleaMarketById(int itemId);
	List<ItemDTO> getFleaMarketByUsername(String username);
	List<ItemDTO> getFleaMarketList();

}

