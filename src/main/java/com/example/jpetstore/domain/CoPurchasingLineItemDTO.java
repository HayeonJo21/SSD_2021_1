package com.example.jpetstore.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CoPurchasingLineItemDTO implements Serializable{

	private int copurchasingId;
	private int deliveryId;
	
	public CoPurchasingLineItemDTO() {}
	
	public CoPurchasingLineItemDTO(int copurchasingId) {
		super();
		this.copurchasingId = copurchasingId;
	}
	
	public CoPurchasingLineItemDTO(int copurchasingId, int deliveryId) {
		super();
		this.copurchasingId = copurchasingId;
		this.deliveryId = deliveryId;
	}
	
	public int getCopurchasingId() {
		return this.copurchasingId;
	}
	
	public void setCopurchasingId(int copurchasingId) {
		this.copurchasingId = copurchasingId;
	}
	
	public int getDeliveryId() {
		return this.deliveryId;
	}
	
	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}
}
