package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssd.delivery.domain.MessageDTO;
@Mapper
public interface MessageMapper {
	
	void insertMessage(MessageDTO message);
	
	void updateMessage(MessageDTO message);
	
	void deleteMessage(String username);
	
	List<MessageDTO> getMessageListByUsername(String username);
	
	List<MessageDTO> getMessageContentByUsername(String sender, String receiver);
	
	List<MessageDTO> getMessageList();
}
