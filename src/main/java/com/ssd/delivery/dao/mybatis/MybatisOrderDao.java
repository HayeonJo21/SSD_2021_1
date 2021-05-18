package com.ssd.delivery.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ssd.delivery.dao.OrderDao;
import com.ssd.delivery.dao.SequenceDao;
import com.ssd.delivery.dao.mybatis.mapper.LineItemMapper;
import com.ssd.delivery.dao.mybatis.mapper.OrderMapper;
import com.ssd.delivery.domain.LineItem;
import com.ssd.delivery.domain.Order;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisOrderDao implements OrderDao {
	
	@Autowired
	protected OrderMapper orderMapper;
	@Autowired
	protected LineItemMapper lineItemMapper;
	@Autowired
	private SequenceDao sequenceDao;

	public List<Order> getOrdersByUsername(String username) 
			throws DataAccessException {
	    return orderMapper.getOrdersByUsername(username);
	}
	
	@Transactional
	public Order getOrder(int orderId) throws DataAccessException {
		Order order = orderMapper.getOrder(orderId);
		if (order != null) {
			order.setLineItems(lineItemMapper.getLineItemsByOrderId(orderId));
		}
	    return order;
	}
	
	@Transactional
	public void insertOrder(Order order) throws DataAccessException {  
    	order.setOrderId(sequenceDao.getNextId("ordernum"));
    	orderMapper.insertOrder(order);
    	orderMapper.insertOrderStatus(order);
    	for (int i = 0; i < order.getLineItems().size(); i++) {
    		LineItem lineItem = (LineItem) order.getLineItems().get(i);
    		lineItem.setOrderId(order.getOrderId());
    		lineItemMapper.insertLineItem(lineItem);
    	}
	}
}