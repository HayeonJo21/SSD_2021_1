package com.ssd.delivery.controller.account;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
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
	public String showPage() {
		return "mypage";
	}
	
	@RequestMapping("/user/myPage/coPurchasing.do")
	public String viewCPItem(ModelMap model, HttpSession session) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		
		List<CoPurchasingDTO> CPList = delivery.getCPListByUsername(username); //dao 인터페이스에 추가해야 할 메소드

		model.put("CPList", CPList);
		
		return "/coPurchasing";
	}
	
	@RequestMapping("/user/myPage/auction.do")
	public String viewAuctionItem(ModelMap model, HttpSession session) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		
		List<AuctionDTO> auctionList = delivery.getAuctionByUsername(username);

		model.put("auctionList", auctionList);
		
		return "/auction";
	}
}