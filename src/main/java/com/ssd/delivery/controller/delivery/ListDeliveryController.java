package com.ssd.delivery.controller.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.service.DeliveryImpl;

@Controller
@SessionAttributes("sessionDelivery")
public class ListDeliveryController {
	@Autowired
	private DeliveryImpl deliveryImpl;
	
	@RequestMapping("/delivery/list")
	public ModelAndView handleRequest(
		) throws Exception {
		return new ModelAndView("DeliveryList", "deliveryList", 
				deliveryImpl.getDeliveryList());
	}
}
