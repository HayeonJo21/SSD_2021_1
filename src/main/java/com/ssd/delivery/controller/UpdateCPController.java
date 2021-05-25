package com.ssd.delivery.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.CoPurchasingDTO;
@Controller
public class UpdateCPController { 

	@RequestMapping("/coPurchasing/update")
	public ModelAndView handleRequest(
			HttpServletRequest request,	
			@ModelAttribute("userSession") UserSession userSession) throws Exception {
		CoPurchasingDTO cp = new CoPurchasingDTO();
		return new ModelAndView("UpdateCPView", "cp", cp);
	}

}
