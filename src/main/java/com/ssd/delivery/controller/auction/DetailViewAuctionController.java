package com.ssd.delivery.controller.auction;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.dao.mybatis.mapper.EventMapper;
import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.AuctionLineItemDTO;
import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.service.DeliveryFacade;


/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
@RequestMapping("/delivery/auctionDetailView.do")
public class DetailViewAuctionController { 
	@Autowired
	private DeliveryFacade delivery;
	@Autowired
	EventMapper eventMapper;
	
	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}
	
	@GetMapping
	public String handleRequest(
			@RequestParam("acId") int auctionId,
			ModelMap model, HttpSession session) throws Exception {
		AuctionDTO auction = this.delivery.getAuctionById(auctionId);
		DeliveryDTO del = delivery.getDeliveryById(auction.getDelivery());
		String status = eventMapper.getStatusByDeliveryId(auction.getDelivery());
		System.out.println(auction.getDelivery());
		System.out.println(status);
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		List<AuctionLineItemDTO> aclineitem = delivery.getACLineItemsByACId(auctionId);
		
		model.put("status", status);
		model.put("aclineitem", aclineitem);
		model.put("userSession", account);
		model.put("ac", auction);
		model.put("delivery", del);
		
		return "auctionDetail";
	}

}
