package com.ssd.delivery.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.MessageDTO;

@Controller
@SessionAttributes("sessionMessage")
public class UpdateMessageController {
	@RequestMapping("/message/update")
	public ModelAndView handleRequest(
			HttpServletRequest request,
			@ModelAttribute("sessionMessgae") MessageDTO Message) throws Exception {
		MessageDTO message = new MessageDTO();
		return new ModelAndView("UpdateMessageView", "message", message);
	}
}
