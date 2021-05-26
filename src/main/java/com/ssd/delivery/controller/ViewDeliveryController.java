package com.ssd.delivery.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.dao.mybatis.mapper.DeliveryMapper;
import com.ssd.delivery.domain.DeliveryDTO;

public class ViewDeliveryController {

	@RequestMapping("/delivery/view")
	public String handleRequest(
			@RequestParam("deliveryId") int deliveryId,
			ModelMap model) throws Exception {
		DeliveryDTO delivery;
		DeliveryMapper d = null;
		delivery = d.getDeliveryById(deliveryId);
		model.put("delivery", delivery);
		return "deliveryView";
	}
}
//DeliverFacade 작성필요
//Mapper가 아닌 Dao 사용으로 변경
