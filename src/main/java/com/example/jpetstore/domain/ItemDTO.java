package com.example.jpetstore.domain;

public class ItemDTO {

	private int itemId;
	private String itemName;
	private String filename;
	private int originalPrice;
	private int salePrice;
	
	public ItemDTO() {}
	
	public ItemDTO(int itemId) {
		super();
		this.itemId = itemId;
	}
	
	public ItemDTO(int itemId, String itemName, String filename,
			int originalPrice, int salePrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.filename = filename;
		this.originalPrice = originalPrice;
		this.salePrice = salePrice;
	}

	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public int getOriginalPrice() {
		return originalPrice;
	}
	
	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}
	
	public int getSalePrice() {
		return salePrice;
	}
	
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	
}
