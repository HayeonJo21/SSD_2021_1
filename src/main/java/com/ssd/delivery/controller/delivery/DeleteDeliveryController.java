package com.ssd.delivery.controller.delivery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.dao.mybatis.mapper.DeliveryMapper;

@Controller
@SessionAttributes("sessionDelivery")
public class DeleteDeliveryController {

	@RequestMapping("/delivery/delete")
	public ModelAndView handleRequest(
			@RequestParam("username") int username,
			@ModelAttribute("sessionDelivery") DeliveryMapper delivery
			) throws Exception {
		delivery.deleteDelivery(username);
		return new ModelAndView("Delivery", "delivery", delivery);
	}
}
