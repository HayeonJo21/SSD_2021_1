package com.ssd.delivery.controller.auction;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
@RequestMapping("/delivery/auctionView.do")
public class ViewAuctionController { 

	private DeliveryFacade delivery;

	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}
	
	@GetMapping
	public ModelAndView showAC(Model model, HttpSession session) throws Exception {
		List<AuctionDTO> ACList = delivery.getAuctionList();
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ACList", ACList);
		mav.setViewName("auctionpage");
				
		return mav;
	}
	
//	@RequestMapping("/auction/view.do")
//	public String handleRequest(
//			@RequestParam("username") String username,
//			@RequestParam("auction") String auction,
//			ModelMap model) throws Exception {
////		AuctionDTO auction = this.petStore.getAuctionById(auctionId);
//
//		AccountDTO user = this.petStore.getAccountDTO(username);
//		model.put("auction", auction);
//		return "auction";
//	}

}
