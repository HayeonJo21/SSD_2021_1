package com.ssd.delivery.controller.fleamarket;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.controller.UserSession;
import com.ssd.delivery.domain.FleaMarketDTO;
@Controller
@SessionAttributes("userSession")
public class InsertFMController { 

	@RequestMapping("/fleamarket/update")
	public ModelAndView handleRequest(
			HttpServletRequest request,	
			@ModelAttribute("userSession") UserSession userSession) throws Exception {
		FleaMarketDTO fm = new FleaMarketDTO();
		return new ModelAndView("UpdateFleaMarketView", "fm", fm);
	}

}
