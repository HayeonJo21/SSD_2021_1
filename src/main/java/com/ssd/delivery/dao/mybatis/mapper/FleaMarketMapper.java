package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssd.delivery.domain.FleaMarketDTO;
import com.ssd.delivery.domain.ItemDTO;

@Mapper
public interface FleaMarketMapper {
	
	void insertFM(ItemDTO item);
	void updateFM(ItemDTO item);
	void deleteFM(ItemDTO item);

	ItemDTO getFMById(int itemId);
	List<FleaMarketDTO> getFMByUsername(String username);
	List<ItemDTO> getFMList();

}

