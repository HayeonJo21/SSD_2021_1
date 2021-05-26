package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import com.ssd.delivery.domain.ItemDTO;

public interface FleaMarketMapper {
	
	void insertFM(ItemDTO item);
	void updateFM(ItemDTO item);
	void deleteFM(ItemDTO item);

	ItemDTO getFMById(int itemId);
	List<ItemDTO> getFMByUsername(String username);
	List<ItemDTO> getFMList();

}

