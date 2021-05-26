package com.ssd.delivery.controller.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.controller.UserSession;
import com.ssd.delivery.domain.Cart;

@Controller
@SessionAttributes("userSession")
public class DeleteUserController { 

	@RequestMapping("/user/delete")
	public ModelAndView handleRequest(
			@RequestParam("username") String username,
			@ModelAttribute("userSession") UserSession userSession
		) throws Exception {
		// userSession.delete(username);
		return new ModelAndView();
	}
}
