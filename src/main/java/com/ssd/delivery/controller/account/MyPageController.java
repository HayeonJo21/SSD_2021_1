package com.ssd.delivery.controller.account;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
@RequestMapping("/user/mypage.do")
public class MyPageController {
	private DeliveryFacade delivery;
	@Autowired
	public void setDeliveryFacade(DeliveryFacade delivery) {
		this.delivery= delivery;
	}
   
	@GetMapping
	public ModelAndView viewMypage(Model model, HttpSession session) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		ModelAndView mav = new ModelAndView();
		
		List<CoPurchasingDTO> CPList = delivery.getCPListByUsername(username);
		List<AuctionDTO> ACList = delivery.getAuctionByUsername(username);
		List<FleaMarketDTO> FMList = delivery.getFMByUsername(username);
		
		mav.addObject("CPList", CPList);
		mav.addObject("FMList", FMList);
		mav.addObject("ACList", ACList);
		mav.addObject("user", account);
		mav.setViewName("mypage");
	
		return mav;
	}
	
	
}