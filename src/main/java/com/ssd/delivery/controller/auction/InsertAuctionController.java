package com.ssd.delivery.controller.auction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
//@SessionAttributes("sessionCP")
@SessionAttributes("userSession")
@RequestMapping({"/delivery/auctionInsert.do", "/delivery/auctionNewAuctionSubmitted.do"})
public class InsertAuctionController {
	
	@Autowired
	private DeliveryFacade delivery;
	@Autowired
	private DeliveryImpl deliveryImpl;
	
//	@RequestMapping("/auction/insert")
	@RequestMapping(method = RequestMethod.GET)
	public String showForm() {
		
		return "auctionForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(AuctionDTO auction) throws ParseException {
		
		String sdate = auction.getEndDate();
		
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");

		Date to = dFormat.parse(sdate);
		String date = dFormat.format(to);

		auction.setEndDate(date);
		
		delivery.insertAuction(auction);
		
		return "index";
	}
	
	
	

}
