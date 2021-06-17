package com.ssd.delivery.controller.account;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
@RequestMapping("/delivery/mypage.do")
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
		List<DeliveryDTO> DelList = delivery.getDeliveryByUsername(username);
		List<FavoriteUserDTO> favList = delivery.getFUByUsername(username);
		
		mav.addObject("CPList", CPList);
		mav.addObject("DelList", DelList);
		mav.addObject("ACList", ACList);
		mav.addObject("favList", favList);
		mav.addObject("user", account);
		mav.setViewName("mypage");
	
		return mav;
	}
	
	@PostMapping
	public String onSubmit(HttpServletRequest request, HttpSession session,
			@ModelAttribute("accountForm")  AccountDTO account,
			BindingResult result) throws Exception  {
		
//		validator.validate(accountForm, result);
//		if (result.hasErrors()) return "index";
		
		delivery.updateAccount(account);
		
		session.setAttribute("userSession", account);
		return "redirect:/delivery/mypage.do";
}
	
}