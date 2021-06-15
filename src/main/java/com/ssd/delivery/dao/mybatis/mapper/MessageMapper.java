package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssd.delivery.domain.MessageDTO;
@Mapper
public interface MessageMapper {
	
	void insertMessage(MessageDTO message);
	
	void updateMessage(MessageDTO message);
	
	void deleteMessage(String username);
	
	List<MessageDTO> getMessageListByUsername(@Param("username")String username);
	
	List<MessageDTO> getMessageContentByUsername(@Param("username")String sender, @Param("receiverUsername")String receiver);
	
	List<MessageDTO> getMessageList();
}
