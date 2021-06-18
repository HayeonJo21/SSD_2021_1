package com.ssd.delivery.dao.mybatis;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssd.delivery.dao.EventDao;
import com.ssd.delivery.dao.mybatis.mapper.EventMapper;


@Repository
public class MybatisEventDao implements EventDao {	
	@Autowired
	private EventMapper accountMapper;
	
	public void insertNewEvent(HashMap<String, Date> map) {
		accountMapper.insertNewEvent(map);
	}

	public void closeEvent(Date curTime) {
		accountMapper.closeEvent(curTime);		
	}
}