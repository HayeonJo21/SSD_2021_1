package com.ssd.delivery.controller.auction;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
@SessionAttributes("userSession")
@RequestMapping("/auction/insert.do")
public class InsertAuctionFormController {
	
	@Autowired
	private DeliveryFacade delivery;
	
	@GetMapping
	public ModelAndView showInsertForm(HttpSession session) {

		AccountDTO account = (AccountDTO) session.getAttribute("userSession");
		List<DeliveryDTO> deliveryList = delivery.getDeliveryByUsername(account.getUsername());
		
		ModelAndView mav = new ModelAndView();

		mav.addObject("delList", deliveryList);
		mav.setViewName("auctionForm");

		return mav;
	}
	
	

}
