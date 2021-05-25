package com.ssd.delivery.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.AccountDTO;
@Controller
@SessionAttributes("userSession")
public class UpdateUserController { 

	@RequestMapping("/user/update")
	public ModelAndView handleRequest(
			HttpServletRequest request,	
			@ModelAttribute("userSession") UserSession userSession) throws Exception {
		AccountDTO user = new AccountDTO();
		return new ModelAndView("UpdateUserView", "user", user);
	}

}
