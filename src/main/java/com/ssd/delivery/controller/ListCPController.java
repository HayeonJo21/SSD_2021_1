package com.ssd.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.service.PetStoreFacade;

@Controller
public class ListCPController {

	private PetStoreFacade petStore;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@RequestMapping("/coPurchasing/list")
	public ModelAndView handleRequest(
		) throws Exception {
		return new ModelAndView("viewUserList", "userList", 
				petStore.findUserList());
	}

}
