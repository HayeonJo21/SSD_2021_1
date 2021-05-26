package com.ssd.delivery.dao.mybatis;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ssd.delivery.dao.MessageDao;
import com.ssd.delivery.dao.mybatis.mapper.MessageMapper;
import com.ssd.delivery.domain.MessageDTO;

@Repository
public class MybatisMessageDao implements MessageDao {

	@Autowired
	private MessageMapper messageMapper;
	
	public void insertMessage(MessageDTO message) throws DataAccessException {
		messageMapper.insertMessage(message);
	}
	
	public void updateMessage(MessageDTO message) throws DataAccessException {
		messageMapper.updateMessage(message);
	}
	
	public void deleteMessage(String username) throws DataAccessException {
		messageMapper.deleteMessage(username);
	}
	
	public MessageDTO getMessageByUsername(String username) throws DataAccessException {
		return messageMapper.getMessageByUsername(username);
	}
	
	public List<MessageDTO> getMessageList() throws DataAccessException {
		return messageMapper.getMessageList();
	}
}
