package com.ssd.delivery.dao.mybatis;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ssd.delivery.dao.DeliveryDao;
import com.ssd.delivery.dao.mybatis.mapper.DeliveryMapper;
import com.ssd.delivery.domain.DeliveryDTO;

@Repository
public class MybatisDeliveryDao implements DeliveryDao{

	@Autowired
	private DeliveryMapper deliveryMapper;
	
	public void create (DeliveryDTO delivery) throws DataAccessException {
		deliveryMapper.create(delivery);
	}
	
	public void update(DeliveryDTO delivery) throws DataAccessException {
		deliveryMapper.update(delivery);
	}
	
	public void remove(int deliveryId) throws DataAccessException {
		deliveryMapper.remove(deliveryId);
	}
	
	public DeliveryDTO getDeliveryById(int deliveryId) throws DataAccessException {
		return deliveryMapper.getDeliveryById(deliveryId);
	}
	
	public DeliveryDTO getDeliveryByUsername(String username) throws DataAccessException {
		return deliveryMapper.getDeliveryByUsername(username);
	}
	
	public List<DeliveryDTO> getDeliveryList() throws DataAccessException {
		return deliveryMapper.getDeliveryList();
	}
}
