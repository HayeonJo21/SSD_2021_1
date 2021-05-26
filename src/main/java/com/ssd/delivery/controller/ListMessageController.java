package com.ssd.delivery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class ListMessageController {

	@RequestMapping("/delivery/list")
	public ModelAndView handleRequest(
		) throws Exception {
		return new ModelAndView("DeliveryList", "deliveryList", 
				.getDeliveryList());
	}
}
