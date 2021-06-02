package com.ssd.delivery.controller.auction;

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
public class InsertAuctionController {
	@Autowired
	private DeliveryImpl deliveryImpl;
	
	@RequestMapping("/auction/insert")
	public String handleRequest(
			@RequestParam("auction") AuctionDTO auction,
			ModelMap model) throws Exception {
		
		deliveryImpl.insertAuction(auction);
		
		return "deliveryList";
	}
}
