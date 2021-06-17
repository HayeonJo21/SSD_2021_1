package com.ssd.delivery.controller.copurchasing;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
@RequestMapping("/delivery/copurchasingView.do")
public class ViewCPController {

	private DeliveryFacade delivery;

	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}

	@GetMapping
	public ModelAndView showCP(Model model, HttpSession session) throws Exception {
		List<CoPurchasingDTO> CPList = delivery.getCPList();
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("CPList", CPList);
		mav.setViewName("copurchasingpage");
				
		return mav;
	}

//	@RequestMapping("/coPurchasing/view")
//	public ModelAndView handleRequest(@ModelAttribute("user") AccountDTO user,
//			@RequestParam("coPurchasingId") String CPId) throws Exception {
//		CoPurchasingDTO cp = delStore.getCPById(CPId);
//		
//		return new ModelAndView("ViewCP", "cp", cp);
//	}

}
