package com.ssd.delivery.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("serial")
public class OrderDTO implements Serializable {

	/* Private Fields */

	private int orderId;
	private String username;
	private Date orderDate;
	private String address;
	private int totalPrice;



	public OrderDTO() {
		super();
	}

	public OrderDTO(int orderId, String username, Date orderDate, String address, int totalPrice) {
		super();
		this.orderId = orderId;
		this.username = username;
		this.orderDate = orderDate;
		this.address = address;
		this.totalPrice = totalPrice;
	}
	/* JavaBeans Properties */
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}