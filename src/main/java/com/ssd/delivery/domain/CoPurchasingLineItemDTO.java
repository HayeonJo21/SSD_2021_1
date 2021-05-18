package com.ssd.delivery.domain;

public class CoPurchasingLineItemDTO {

	private String username;
	private String address;
	
	public CoPurchasingLineItemDTO() {}
	
	public CoPurchasingLineItemDTO(String username) {
		super();
		this.username = username;
	}
	
	public CoPurchasingLineItemDTO(String username, String address) {
		super();
		this.username = username;
		this.address = address;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
