package com.ssd.delivery.domain;

import java.io.Serializable;

public class CoPurchasingLineItemDTO implements Serializable{

	private int deliveryId;
	private int coPurchasingId;
	private String username;
	
	
	
	public CoPurchasingLineItemDTO() {
		super();
	}



	public CoPurchasingLineItemDTO(int deliveryId, int coPurchasingId, String username) {
		super();
		this.deliveryId = deliveryId;
		this.coPurchasingId = coPurchasingId;
		this.username = username;
	}



	public int getDeliveryId() {
		return deliveryId;
	}



	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}



	public int getCoPurchasingId() {
		return coPurchasingId;
	}



	public void setCoPurchasingId(int coPurchasingId) {
		this.coPurchasingId = coPurchasingId;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	
	
	
	
	
	
}
