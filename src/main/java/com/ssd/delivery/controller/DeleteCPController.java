package com.ssd.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.Cart;

@Controller
public class DeleteCPController { 

	@RequestMapping("/coPurchasing/delete")
	public ModelAndView handleRequest(
			
		) throws Exception {
		return new ModelAndView();
	}
}
