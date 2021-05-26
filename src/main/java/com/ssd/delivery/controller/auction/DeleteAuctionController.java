package com.ssd.delivery.controller.auction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DeleteAuctionController { 

	@RequestMapping("/auction/delete")
	public ModelAndView handleRequest(
			
		) throws Exception {
		return new ModelAndView();
	}
}
