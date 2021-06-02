package com.ssd.delivery.controller.auction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.Item;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.PetStoreFacade;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
public class DetailViewAuctionController { 
	private DeliveryFacade delivery;
	

	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}

	@RequestMapping("/shop/viewItem1.do")
	public String handleRequest(
			@RequestParam("auctionId") int auctionId,
			ModelMap model) throws Exception {
		AuctionDTO auction = this.delivery.getAuctionById(auctionId);
		model.put("auction", auction);
		model.put("auctionView", auction);
		return "Auction";
		
		
		
		
	}

}
