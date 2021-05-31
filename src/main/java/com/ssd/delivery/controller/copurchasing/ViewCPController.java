package com.ssd.delivery.controller.copurchasing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
public class ViewCPController { 

	private DeliveryFacade delStore;

	@Autowired
	public void setPetStore(DeliveryFacade delStore) {
		this.delStore = delStore;
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
