package com.ssd.delivery.controller.delivery;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
@RequestMapping("/delivery/list/view.do")
public class ListDeliveryController {
	@Autowired
	private DeliveryFacade delivery;
	
	@GetMapping
	public ModelAndView showDelivery(Model model, HttpSession session) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		List<DeliveryDTO> deliveryList = delivery.getDeliveryList();
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("delivery", deliveryList);
		mav.addObject("userSession", account);
		mav.setViewName("deliveryPage");
				
		return mav;
	}
	
}