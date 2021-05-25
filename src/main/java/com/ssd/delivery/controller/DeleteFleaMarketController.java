package com.ssd.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.Cart;

@Controller
@SessionAttributes("userSession")
public class DeleteFleaMarketController { 

	@RequestMapping("/fleamarket/delete")
	public ModelAndView handleRequest(
			@RequestParam("f") String username,
			@ModelAttribute("userSession") UserSession userSession
		) throws Exception {
		// userSession.delete(username);
		return new ModelAndView();
	}
}
