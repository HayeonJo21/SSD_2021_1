package com.example.jpetstore.domain;
import java.io.Serializable;
import java.sql.Date;

public class MessageDTO implements Serializable{
	
	private String senderUsername;
	private String receiverUsername;
	private String content;
	private Date messageDate; //String으로 변경 가능
	
	
	//기본 생성자
	public MessageDTO() {
		super();
	}
	
	
	public MessageDTO(String senderUsername, String receiverUsername, String content, Date messageDate) {
		super();
		this.senderUsername = senderUsername;
		this.receiverUsername = receiverUsername;
		this.content = content;
		this.messageDate = messageDate;
	}
	
	
	//getter & setter
	public String getSenderUsername() {
		return senderUsername;
	}
	public void setSenderUsername(String senderUsername) {
		this.senderUsername = senderUsername;
	}
	public String getReceiverUsername() {
		return receiverUsername;
	}
	public void setReceiverUsername(String receiverUsername) {
		this.receiverUsername = receiverUsername;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getMessageDate() {
		return messageDate;
	}
	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}
	
	

}
