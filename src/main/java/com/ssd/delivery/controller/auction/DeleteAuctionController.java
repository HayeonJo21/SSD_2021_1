package com.ssd.delivery.controller.auction;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.service.DeliveryFacade;


@Controller
@RequestMapping("/admin/auction/delete.do")
public class DeleteAuctionController { 

	private DeliveryFacade delivery;

	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}
	
	@GetMapping
	public String adminAuctionDelete(Model model, HttpSession session, @RequestParam("auctionId") int auctionId) throws Exception {
		System.out.println("경매 삭제!!!!");
		delivery.deleteAuction(auctionId);
		
		return "redirect:/admin/auction.do";
	}
	
}
