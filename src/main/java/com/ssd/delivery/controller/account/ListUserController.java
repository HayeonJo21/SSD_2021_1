package com.ssd.delivery.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.controller.UserSession;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
@SessionAttributes("userSession")
public class ListUserController {

	private DeliveryFacade delStore;

//	@Autowired
//	public void setDelStore(DeliveryFacade delStore) {
//		this.delStore = delStore;
//	}
//
//	@RequestMapping("/user/list.do")
//	public ModelAndView handleRequest(
//		@ModelAttribute("userSession") UserSession userSession
//		) throws Exception {
//		return new ModelAndView("viewUserList", "userList", 
//				delStore.getUserList());
//	}

}
