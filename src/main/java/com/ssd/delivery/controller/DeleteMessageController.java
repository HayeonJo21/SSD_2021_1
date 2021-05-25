package com.ssd.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.dao.mybatis.mapper.MessageMapper;

@Controller
@SessionAttributes("sessionMessage")
public class DeleteMessageController {

	@RequestMapping("/message/delete")
	public ModelAndView handleRequest(
			@RequestParam("username") String username,
			@ModelAttribute("sessionMessage") MessageMapper message
			) throws Exception {
		message.delete(username);
		return new ModelAndView("Message", "message", message);
	}
}
