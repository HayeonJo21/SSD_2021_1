package com.ssd.delivery.controller.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
@SessionAttributes("sessionDelivery")
public class InsertDeliveryController {
	@Autowired
	private DeliveryImpl deliveryImpl;
	
	@RequestMapping("/delivery/insert")
	public String handleRequest(
			@RequestParam("delivery") DeliveryDTO delivery,
			ModelMap model) throws Exception {
		deliveryImpl.insertDelivery(delivery);
		
		return "deliveryList";
	}
}
