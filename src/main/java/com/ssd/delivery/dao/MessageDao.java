package com.ssd.delivery.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.ssd.delivery.domain.MessageDTO;

public interface MessageDao {

	void insertMessage(MessageDTO message) throws DataAccessException;
	
	void updateMessage(MessageDTO message) throws DataAccessException;
	
	void deleteMessage(String username) throws DataAccessException;
	
	MessageDTO getMessageByUsername(String username) throws DataAccessException;
	
	List<MessageDTO> getMessageList() throws DataAccessException;
}
