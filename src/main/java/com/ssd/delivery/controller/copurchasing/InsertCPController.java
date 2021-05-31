package com.ssd.delivery.controller.copurchasing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
@SessionAttributes("sessionCP")
public class InsertCPController {
	@Autowired
	private DeliveryImpl deliveryImpl;
	
	@RequestMapping("/coPurchasing/insert")
	public String handleRequest(
			@RequestParam("coPurchasing") CoPurchasingDTO cp,
			ModelMap model) throws Exception {
		deliveryImpl.insertCP(cp);
		
		return "deliveryList";
	}
}
