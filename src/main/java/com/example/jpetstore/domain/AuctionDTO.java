package com.example.jpetstore.domain;

import java.io.Serializable;
import java.sql.Date;

public class AuctionDTO implements Serializable {
	private String auctionId;
	private String serviceId;
	private String customerId;
	private Date endDate;
	private Date serviceDate;
	private int startPrice;
	private int finalPrice;
	private String address1;
	private String address2;
	private String successfulBidder;
	private Delivery delivery; //deliver 객체 참조
	
	
	//기본생성자
	public AuctionDTO() {
		super();
	}
	
	
	public AuctionDTO(String auctionId, String serviceId, String customerId, Date endDate, Date serviceDate,
			int startPrice, int finalPrice, String address1, String address2, String successfulBidder,
			Delivery delivery) {
		super();
		this.auctionId = auctionId;
		this.serviceId = serviceId;
		this.customerId = customerId;
		this.endDate = endDate;
		this.serviceDate = serviceDate;
		this.startPrice = startPrice;
		this.finalPrice = finalPrice;
		this.address1 = address1;
		this.address2 = address2;
		this.successfulBidder = successfulBidder;
		this.delivery = delivery;
	}
	
	//getter&setter
	public String getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(String auctionId) {
		this.auctionId = auctionId;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}
	public int getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(int startPrice) {
		this.startPrice = startPrice;
	}
	public int getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getSuccessfulBidder() {
		return successfulBidder;
	}
	public void setSuccessfulBidder(String successfulBidder) {
		this.successfulBidder = successfulBidder;
	}
	public Delivery getDelivery() {
		return delivery;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	
	
	
	

}
