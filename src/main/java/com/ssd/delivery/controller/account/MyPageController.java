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
public class MyPageController {
	private DeliveryFacade delStore;
	@Autowired
	public void setJkdk(DeliveryFacade delStore) {
		this.delStore = delStore;
	}
  
  @RequestMapping("/user/myPage.do")
	public ModelAndView viewMyPagesMain(@SessionAttribute("userSession") AccountDTO userSession) {
		if (userSession == null) {
			return new ModelAndView("thyme/Home", "message", "로그인 후 이용 가능합니다.");
		}
		
		return new ModelAndView("thyme/user/MyPage");
	}
	
	@RequestMapping("/user/myPage/coPurchasing.do")
	public String viewCPItem(ModelMap model, HttpSession session) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		
		List<CoPurchasingDTO> CPList = delStore.getCPListByUsername(username); //dao 인터페이스에 추가해야 할 메소드

		model.put("CPList", CPList);
		
		return "/coPurchasing";
	}
	
	@RequestMapping("/user/myPage/auction.do")
	public String viewAuctionItem(ModelMap model, HttpSession session) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		
		List<AuctionDTO> auctionList = delStore.getAuctionByUsername(username);

		model.put("auctionList", auctionList);
		
		return "/auction";
	}
}