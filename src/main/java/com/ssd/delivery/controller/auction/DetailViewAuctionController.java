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
<<<<<<< HEAD

	@Autowired
=======
>>>>>>> branch 'master' of https://github.com/choi1k/SSD_2021_1.git
	private DeliveryFacade delivery;
	
<<<<<<< HEAD
=======

	@Autowired
>>>>>>> branch 'master' of https://github.com/choi1k/SSD_2021_1.git
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}

<<<<<<< HEAD
	//@RequestMapping("/shop/viewItem.do")
=======
	@RequestMapping("/shop/viewItem1.do")
>>>>>>> branch 'master' of https://github.com/choi1k/SSD_2021_1.git
	public String handleRequest(
			@RequestParam("auctionId") int auctionId,
			ModelMap model) throws Exception {
		AuctionDTO auction = this.delivery.getAuctionById(auctionId);
		model.put("auction", auction);
		model.put("auctionView", auction);
		return "Auction";
		
		
		
		
	}

}
