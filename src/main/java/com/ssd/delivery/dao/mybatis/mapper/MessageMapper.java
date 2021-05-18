package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssd.delivery.domain.MessageDTO;
@Mapper
public interface MessageMapper {
	
	void create(MessageDTO message);
	
	void update(MessageDTO message);
	
	void remove(String username);
	
	MessageDTO getMessageByUsername(String username);
	
	List<MessageDTO> getMessageList();
}
