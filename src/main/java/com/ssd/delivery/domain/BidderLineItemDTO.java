package com.ssd.delivery.domain;

public class BidderLineItemDTO {

	private int bidderId;
	private String address;
	private int bidPrice;
	
	public BidderLineItemDTO() {}
	
	public BidderLineItemDTO(int bidderId) {
		super();
		this.bidderId = bidderId;
	}
	
	public BidderLineItemDTO(int bidderId, String address, int bidPrice) {
		super();
		this.bidderId = bidderId;
		this.address = address;
		this.bidPrice = bidPrice;
	}

	public int getBidderId() {
		return bidderId;
	}
	
	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getBidPrice() {
		return bidPrice;
	}
	
	public void setBidPrice(int bidPrice) {
		this.bidPrice = bidPrice;
	}
		
}
