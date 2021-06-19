package com.ssd.delivery.controller.auction;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

import com.ssd.delivery.controller.UserSession;
import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.DeliveryImpl;
import com.ssd.delivery.service.Message;

@Controller
@SessionAttributes("userSession")
@RequestMapping("/auction/join.do")
public class JoinAuctionController {
	@Autowired
	private DeliveryFacade delivery;

	@GetMapping
	public String handleRequest(
			@RequestParam("auctionId") int acId, HttpSession session, ModelMap model) throws Exception {
		
		AuctionDTO ac = this.delivery.getAuctionById(acId);
		DeliveryDTO del = delivery.getDeliveryById(ac.getDelivery());
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		if(ac.getCurrentPrice() == 0) {
			ac.setCurrentPrice(ac.getStartPrice());
		}
		System.out.println("AUCTIONID: " + acId + "CURR PRICE: " + ac.getCurrentPrice());
		model.put("ac", ac);
		model.put("delivery", del);
		model.put("user", account);
		return "auctionJoinForm";

	}

	
	@PostMapping
	public ModelAndView submit(AuctionLineItemDTO aclineitemDTO) {
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String currentDate = dFormat.format(date);
		AuctionDTO auction = delivery.getAuctionById(aclineitemDTO.getAuctionId());
		
		aclineitemDTO.setJoinDate(currentDate);
		delivery.updateCurrentPriceAuction(aclineitemDTO.getJoinPrice(), aclineitemDTO.getAuctionId());
	
		delivery.insertACLineItem(aclineitemDTO);
		
		ModelAndView mav = new ModelAndView();
		
		List<AuctionLineItemDTO> aclineitem = delivery.getACLineItemsByACId(aclineitemDTO.getAuctionId());
		mav.addObject("aclineitem", aclineitem);
		mav.addObject("ac", auction);
		mav.setViewName("auctionDetail");
		
		return mav;
	}
	
}
