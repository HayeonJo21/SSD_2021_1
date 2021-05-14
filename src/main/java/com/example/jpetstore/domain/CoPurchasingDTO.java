package com.example.jpetstore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("serial")
public class CoPurchasingDTO implements Serializable {

	/* Private Fields */

	private String coPurchasingId;
	private int unitCost;
	private int price;
	private String username;
	private int maxNumberofPurchaser;
	private DeliveryDTO delivery;
	

	
	
	
	/* JavaBeans Properties */
	
	
	public CoPurchasingDTO() {
		super();
	}
	
	public CoPurchasingDTO(String coPurchasingId, int unitCost, int price, String username, int maxNumberofPurchaser,
			DeliveryDTO delivery) {
		super();
		this.coPurchasingId = coPurchasingId;
		this.unitCost = unitCost;
		this.price = price;
		this.username = username;
		this.maxNumberofPurchaser = maxNumberofPurchaser;
		this.delivery = delivery;
	}



	public String getCoPurchasingId() {
		return coPurchasingId;
	}
	public void setCoPurchasingId(String coPurchasingId) {
		this.coPurchasingId = coPurchasingId;
	}
	public int getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getMaxNumberofPurchaser() {
		return maxNumberofPurchaser;
	}
	public void setMaxNumberofPurchaser(int maxNumberofPurchaser) {
		this.maxNumberofPurchaser = maxNumberofPurchaser;
	}
	public DeliveryDTO getDelivery() {
		return delivery;
	}
	public void setDelivery(DeliveryDTO delivery) {
		this.delivery = delivery;
	}

	

}