package com.ssd.delivery.controller.auction;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.Account;
import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.domain.FavoriteUserDTO;
import com.ssd.delivery.domain.Product;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.Message;
import com.ssd.delivery.service.PetStoreFacade;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;

@Controller
@SessionAttributes("userSession")
@RequestMapping({"/admin/auction.do","/delivery/adminAuction.do"})
public class AdminAuctionController {

	private DeliveryFacade delivery;

	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}

	@GetMapping
	public String adminAuctionView(Model model, HttpSession session) throws Exception {
		List<DeliveryDTO> del = delivery.isExistingAC();
		
		List<AuctionDTO> ACList = delivery.getAuctionList();

		for (int i = 0; i < del.size(); i++) {
			for (int j = 0; j < ACList.size(); j++) {
				if (del.get(i).getDeliveryId() == ACList.get(j).getDelivery()) {
					ACList.get(j).setFlag(1);
				}
			}
		}
		
		model.addAttribute("ACList", ACList);
	
		return "redirect:/admin/auction.do";
	}
	
	
}
