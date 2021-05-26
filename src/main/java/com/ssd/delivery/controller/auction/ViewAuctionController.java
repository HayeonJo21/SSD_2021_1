package com.ssd.delivery.controller.auction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.service.PetStoreFacade;

@Controller
public class ViewAuctionController { 

	private PetStoreFacade petStore;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@RequestMapping("/auction/view")
	public String handleRequest(
			@RequestParam("username") String username,
			@RequestParam("auction") String auction,
			ModelMap model) throws Exception {
//		AuctionDTO auction = this.petStore.getAuctionById(auctionId);

		AccountDTO user = this.petStore.getAccountDTO(username);
		model.put("auction", auction);
		return "userView";
	}

}
