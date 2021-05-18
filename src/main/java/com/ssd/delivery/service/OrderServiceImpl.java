package com.ssd.delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.delivery.dao.OrderDao;
import com.ssd.delivery.domain.Order;

/**
 * @author Chang-Sup Park
 */
@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	public Order getOrder(int orderId) {
		return orderDao.getOrder(orderId);
	}

	public List<Order> getOrdersByUsername(String username) {
		return orderDao.getOrdersByUsername(username);
	}
}
