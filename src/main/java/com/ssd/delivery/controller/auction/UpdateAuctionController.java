package com.ssd.delivery.controller.auction;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.controller.UserSession;
import com.ssd.delivery.domain.AuctionDTO;


@Controller
public class UpdateAuctionController { 

	@RequestMapping("/auction/update")
	public ModelAndView handleRequest(
			HttpServletRequest request,	
			@ModelAttribute("userSession") UserSession userSession) throws Exception {
		AuctionDTO auction = new AuctionDTO();
		return new ModelAndView("UpdateAuctionView", "auction", auction);
	}

}
