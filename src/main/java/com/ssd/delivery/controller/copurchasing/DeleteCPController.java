package com.ssd.delivery.controller.copurchasing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
public class DeleteCPController { 

	@Autowired
	private DeliveryImpl deliveryImpl;
	
	@RequestMapping("/coPurchasing/delete")
	public ModelAndView handleRequest(
			@RequestParam("CPId") String CPId) throws Exception {
		deliveryImpl.deleteCP(CPId);
		List<CoPurchasingDTO> CPList = deliveryImpl.getCPList();
		return new ModelAndView("CoPurchasing", "copurchasing", CPList);
	}
}
