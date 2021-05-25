package com.ssd.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.service.PetStoreFacade;

@Controller
public class ViewCPController { 

	private PetStoreFacade petStore;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@RequestMapping("/coPurchasing/view")
	public String handleRequest(
			@RequestParam("coPurchasingId") String CPId,
			ModelMap model) throws Exception {
		CoPurchasingDTO cp = null;
		model.put("cp", cp);
		return "coPurchaingView";
	}

}
