package com.ssd.delivery.controller.account;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.controller.UserSession;
import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.service.DeliveryFacade;
@Controller
@SessionAttributes("userSession")
public class UpdateUserController { 
	
	private DeliveryFacade delStore;

	@Autowired
	public void setDelStore(DeliveryFacade delStore) {
		this.delStore = delStore;
	}

	@RequestMapping("/user/update")
	public ModelAndView handleRequest(
			HttpServletRequest request,	
			@ModelAttribute("userSession") UserSession userSession) throws Exception {
		AccountDTO user = new AccountDTO();
		return new ModelAndView("UpdateUserView", "user", user);
	}

}
