package com.ssd.delivery.domain;

import java.io.Serializable;
import java.sql.Date;

public class FleaMarketDTO implements Serializable {
	private int fleamarketId;
	private String username;
	private Date fleamarketDate;
	private String address;
	private int totalPrice;
	private int itemId;
	
	
	public FleaMarketDTO() {
		super();
	}


	public int getFleamarketId() {
		return fleamarketId;
	}


	public void setFleamarketId(int fleamarketId) {
		this.fleamarketId = fleamarketId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Date getFleamarketDate() {
		return fleamarketDate;
	}


	public void setFleamarketDate(Date fleamarketDate) {
		this.fleamarketDate = fleamarketDate;
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


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
