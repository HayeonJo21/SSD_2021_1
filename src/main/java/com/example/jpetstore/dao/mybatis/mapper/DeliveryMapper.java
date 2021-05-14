package com.example.jpetstore.dao.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.jpetstore.domain.DeliveryDTO;
@Mapper
public interface DeliveryMapper {

	void create (DeliveryDTO delivery);
	
	void update(DeliveryDTO delivery);
	
	void remove(int deliveryId);
	
	DeliveryDTO getDeliveryById(int deliveryId);
	
	DeliveryDTO getDeliveryByUsername(String username);
	
	List<DeliveryDTO> getDeliveryList();
}
