package com.ssd.delivery.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssd.delivery.domain.DeliveryDTO;
@Mapper
public interface DeliveryMapper {

	void insert (DeliveryDTO delivery);
	
	void update(DeliveryDTO delivery);
	
	void delete(int deliveryId);
	
	DeliveryDTO getDeliveryById(int deliveryId);
	
	DeliveryDTO getDeliveryByUsername(String username);
	
	List<DeliveryDTO> getDeliveryList();
}
