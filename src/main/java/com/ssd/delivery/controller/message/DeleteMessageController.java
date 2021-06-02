package com.ssd.delivery.controller.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.MessageDTO;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
@SessionAttributes("sessionMessage")
public class DeleteMessageController {
	@Autowired
	private DeliveryImpl deliveryImpl;

	@RequestMapping("/message/delete")
	public ModelAndView handleRequest(
			@RequestParam("username") String username) throws Exception {
		deliveryImpl.deleteMessage(username);
		List<MessageDTO> messageList = deliveryImpl.getMessageList();
		return new ModelAndView("Message", "message", messageList);
	}
}