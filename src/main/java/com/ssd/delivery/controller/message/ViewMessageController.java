package com.ssd.delivery.controller.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ssd.delivery.domain.MessageDTO;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
@RequestMapping("user/message.do")
@SessionAttributes("sessionMessage")
public class ViewMessageController {
	@Autowired
	private DeliveryFacade delivery;
	
	@Autowired
	public void setPetStore(DeliveryFacade delivery) {
		this.delivery = delivery;
	}
	
	@GetMapping
	public String showPage() {
		return "message";
	}

//	@RequestMapping("/message/view")
//	public String handleRequest(
//			@RequestParam("username") String username,
//			ModelMap model) throws Exception {
//		MessageDTO message = delivery.getMessageByUsername(username);
//		model.put("message", message);
//		return "messageView";
//	}
}
