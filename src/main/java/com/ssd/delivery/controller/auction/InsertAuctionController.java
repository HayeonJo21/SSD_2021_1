package com.ssd.delivery.controller.auction;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.Message;

@Controller
@SessionAttributes("userSession")
@RequestMapping("/auction/insert2.do")
public class InsertAuctionController {
	@Autowired
	private DeliveryFacade delivery;

	@GetMapping
	public ModelAndView insert2(@RequestParam("deliveryId") int deliveryId, HttpSession session) throws Exception {
		
		DeliveryDTO delItem = delivery.getDeliveryById(deliveryId);
		
		ModelAndView mav = new ModelAndView();

		mav.addObject("delivery", delItem);
		mav.setViewName("auctionForm2");
		
		return mav;
	}
	
	@PostMapping
	public ModelAndView insertAuction(Model model, HttpSession session, @ModelAttribute("AuctionForm")  AuctionDTO auction, 
			@RequestParam("deliveryId") int deliveryId, @RequestParam("endDate")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm") Date closeTime) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		auction.setDelivery(deliveryId);
		System.out.println(closeTime);
		
		delivery.insertAuction(auction);
		delivery.testScheduler(closeTime);
		ModelAndView mav = new ModelAndView();
		
		DeliveryDTO del = delivery.getDeliveryById(deliveryId);

		mav.addObject("ac", auction);
		mav.addObject("delivery", del);
		mav.addObject("userSession", account);
		mav.setViewName("auctionDetail");
				
		return mav;
	
	}
	
}
