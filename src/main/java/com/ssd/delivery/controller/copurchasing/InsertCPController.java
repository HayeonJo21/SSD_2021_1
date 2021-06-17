package com.ssd.delivery.controller.copurchasing;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
@SessionAttributes("userSession")
@RequestMapping("/coPurchasing/insert.do")
public class InsertCPController {
	@Autowired
	private DeliveryFacade delivery;

	@GetMapping
	public ModelAndView showInsertForm() {
		List<DeliveryDTO> deliveryList = delivery.getDeliveryList();
		ModelAndView mav = new ModelAndView();

		mav.addObject("delList", deliveryList);
		mav.setViewName("copurchasingForm");

		return mav;
	}

	@RequestMapping(value = "/coPurchasing/insert2.do", method = RequestMethod.GET)
	public ModelAndView insert2(@RequestParam("deliveryId") int deliveryId) throws Exception {

		System.out.println("%%%%%%%%%%%%%%%%%");
		DeliveryDTO del = delivery.getDeliveryById(deliveryId);
		ModelAndView mav = new ModelAndView();

		mav.addObject("delivery", del);
		mav.setViewName("copurchasingForm2");

		return mav;
	}

	@PostMapping
	public ModelAndView inserCP(Model model, HttpSession session, @ModelAttribute("CPForm")  CoPurchasingDTO CP) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		delivery.insertCP(CP);
		
		ModelAndView mav = new ModelAndView();
		
		DeliveryDTO del = delivery.getDeliveryById(CP.getDelivery());
		
		mav.addObject("cp", CP);
		mav.addObject("del", del);
		mav.addObject("userSession", account);
		mav.setViewName("coPurchasingDetail");
				
		return mav;
	
	}
}
