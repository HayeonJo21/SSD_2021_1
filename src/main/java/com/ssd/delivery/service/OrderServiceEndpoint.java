package com.ssd.delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssd.delivery.domain.Order;

/**
 * @author Chang-Sup Park
 */
@Component

public class OrderServiceEndpoint {
	@Autowired
	OrderService orderService;		// inject orderSeviceImpl
	
	
	public Order getOrder(int orderId) {
		return orderService.getOrder(orderId);
	}

	public List<Order> getOrdersByUsername(String username) {
		return orderService.getOrdersByUsername(username);
	}
}
