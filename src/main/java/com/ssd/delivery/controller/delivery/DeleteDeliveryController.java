package com.ssd.delivery.controller.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
@SessionAttributes("sessionDelivery")
public class DeleteDeliveryController {
	@Autowired
	private DeliveryImpl deliveryImpl;
	
	@RequestMapping("/delivery/delete")
	public ModelAndView handleRequest(
			@RequestParam("username") int username) throws Exception {
		deliveryImpl.deleteDelivery(username);
		List<DeliveryDTO> deliveryList = deliveryImpl.getDeliveryList();
		return new ModelAndView("Delivery", "delivery", deliveryList);
	}
}