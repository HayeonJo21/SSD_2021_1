package com.ssd.delivery.controller.copurchasing;

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
@RequestMapping("/coPurchasing/join.do")
public class JoinCPController {
	@Autowired
	private DeliveryFacade delivery;

	@GetMapping
	public String handleRequest(
			@RequestParam("coPurchasingId") int cpId,
			HttpSession session,
//			@ModelAttribute("userSession") UserSession userSession,
			ModelMap model) throws Exception {
		
		
		CoPurchasingDTO cp = this.delivery.getCPById(cpId);
		
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
//		String username = userSession.getAccount().getUsername();
		
//		AccountDTO user = delivery.findUser(username);
		
		model.put("cp", cp);
//		model.put("delivery", del);
		model.put("user", account);
		return "copurchasingJoinForm";

	}

	
	@PostMapping
	public String submit(CoPurchasingLineItemDTO cplineitemDTO) {
		delivery.insertCPLineItem(cplineitemDTO);
		
		return "/delivery/copurchasingView.do";
	}
	
}
