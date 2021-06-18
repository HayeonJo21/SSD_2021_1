package com.ssd.delivery.controller.account;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.Message;

@Controller
@SessionAttributes("userSession")

@RequestMapping({"/user/favoriteUser.do", "/user/view"})
public class AddFavoriteUserController { 
	
	private DeliveryFacade delivery;
	@Autowired
	public void setDeliveryFacade(DeliveryFacade delivery) {
		this.delivery= delivery;
	}
	
//	@GetMapping 
//	public String handleRequest(
//			@RequestParam("username") String username,
//			ModelMap model) throws Exception {
//		
//		AccountDTO user = delivery.findUser(username);
//		AccountDTO favUser = delivery.findUser(username);
//		model.put("favUser", favUser);
//		model.put("user", user);
//		return "viewUser";
//	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView viewMypage(Model model, HttpSession session, @RequestParam("username") String username) throws Exception {

		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		AccountDTO favUser = delivery.findUser(username);
		ModelAndView mav = new ModelAndView();
		
		if(account == null) {
			Message msg = new Message("로그인 후 이용 가능합니다. 로그인을 해주세요.", "/");
			mav.addObject("msg", msg);
			mav.setViewName("login");
			
		}
		else {
		mav.addObject("favUser", favUser);
		mav.addObject("user", account);

		mav.setViewName("viewUser");
		}

		return mav;
	}

	@PostMapping
	public String submit(FavoriteUserDTO fav) {
		delivery.insertFU(fav);
		
		return "redirect:/delivery/mypage.do";
	}
	
//	public String onSubmit(HttpServletRequest request, HttpSession session,
//			@ModelAttribute("accountForm")  AccountDTO account,
//			@RequestParam("username") String username,
//			BindingResult result) throws Exception  {
//
//		String accountname = account.getUsername();
//
//		FavoriteUserDTO fav = new FavoriteUserDTO(accountname, username);
//
//
//		delivery.insertFU(fav);
//
//		session.setAttribute("userSession", account);
//		return "redirect:/delivery/mypage.do";
//	}

}