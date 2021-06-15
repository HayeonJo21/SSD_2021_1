package com.ssd.delivery.controller.fleamarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
@RequestMapping("/delivery/fleamarketView.do")
public class ViewFMController { 

	private DeliveryFacade delivery;

	@Autowired
	public void setPetStore(DeliveryFacade delivery) {
		this.delivery = delivery;
	}
	
	@GetMapping
	public String showPage() {
		return "fleaMarketPage";
	}

//	@RequestMapping("/fleamarket/view.do")
//	public String handleRequest(
//			@RequestParam("username") String username,
//			@RequestParam("fleamarket") String fleamarket,
//			ModelMap model) throws Exception {
////		AuctionDTO auction = this.petStore.getAuctionById(auctionId);
//
//		AccountDTO user = this.delivery.getAccountDTO(username);
//		model.put("fleamarket", fleamarket);
//		return "userView";
//	}

}
