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
	
//	public void updateQuantity(Order order) throws DataAccessException {
//		for (int i = 0; i < order.getLineItems().size(); i++) {
//			LineItem lineItem = (LineItem) order.getLineItems().get(i);
//			String itemId = lineItem.getItemId();
//			Integer increment = new Integer(lineItem.getQuantity());
//			Map<String, Object> param = new HashMap<String, Object>(2);
//			param.put("itemId", itemId);
//			param.put("increment", increment);
//			itemMapper.updateInventoryQuantity(param);
//		}
//	}
//
//	public boolean isItemInStock(String itemId) throws DataAccessException {
//		return (itemMapper.getInventoryQuantity(itemId) > 0);
//	}
//
//	public List<Item> getItemListByProduct(String productId) 
//			throws DataAccessException {
//		return itemMapper.getItemListByProduct(productId);
//	}
//
//	public Item getItem(String itemId) throws DataAccessException {
//		return itemMapper.getItem(itemId);
//	}
	
	
	
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
