package com.example.jpetstore.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BidderLineItemDTO implements Serializable{

	private int auctionId;
	private int deliveryId;
	private int bidPrice;
	
	public BidderLineItemDTO() {}
	
	public BidderLineItemDTO(int auctionId) {
		super();
		this.auctionId = auctionId;
	}
	
	public BidderLineItemDTO(int auctionId, int deliveryId, int bidPrice) {
		super();
		this.auctionId = auctionId;
		this.deliveryId = deliveryId;
		this.bidPrice = bidPrice;
	}

	public int getAuctionId() {
		return auctionId;
	}
	
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
	
	public int getDeliveryId() {
		return deliveryId;
	}
	
	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}
	
	public int getBidPrice() {
		return bidPrice;
	}
	
	public void setBidPrice(int bidPrice) {
		this.bidPrice = bidPrice;
	}
		
}
