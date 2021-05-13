package com.example.jpetstore.dao.mybatis;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.example.jpetstore.dao.MessageDao;
import com.example.jpetstore.dao.mybatis.mapper.MessageMapper;
import com.example.jpetstore.domain.MessageDTO;

@Repository
public class MybatisMessageDao implements MessageDao {

	@Autowired
	private MessageMapper messageMapper;
	
	public void create(MessageDTO message) throws DataAccessException {
		messageMapper.create(message);
	}
	
	public void update(MessageDTO message) throws DataAccessException {
		messageMapper.update(message);
	}
	
	public void remove(String username) throws DataAccessException {
		messageMapper.remove(username);
	}
	
	public MessageDTO getMessageByUsername(String username) throws DataAccessException {
		return messageMapper.getMessageByUsername(username);
	}
	
	public List<MessageDTO> getMessageList() throws DataAccessException {
		return messageMapper.getMessageList();
	}
}
