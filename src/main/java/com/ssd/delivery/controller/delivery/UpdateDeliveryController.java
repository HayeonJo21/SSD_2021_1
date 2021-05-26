package com.ssd.delivery.controller.delivery;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.DeliveryDTO;

@Controller
@SessionAttributes("sessionDelivery")
public class UpdateDeliveryController {
	@RequestMapping("/delivery/update")
	public ModelAndView handleRequest(
			HttpServletRequest request,	
			@ModelAttribute("sessionDelivery") DeliveryDTO Delivery) throws Exception {
		DeliveryDTO delivery = new DeliveryDTO();
		return new ModelAndView("UpdateDeliveryView", "delivery", delivery);
	}
}
