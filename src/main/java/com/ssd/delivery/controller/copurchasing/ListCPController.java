package com.ssd.delivery.controller.copurchasing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
public class ListCPController {

	private DeliveryFacade delStore;

	@Autowired
	public void setPetStore(DeliveryFacade delStore) {
		this.delStore = delStore;
	}

	@RequestMapping("/coPurchasing/list")
	public ModelAndView handleRequest(
			@ModelAttribute("Account") AccountDTO account
			) throws Exception {
			String username = account.getUsername();
		return new ModelAndView("viewCPList");
	}

}
