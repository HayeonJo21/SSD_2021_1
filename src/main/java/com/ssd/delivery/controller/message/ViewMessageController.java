package com.ssd.delivery.controller.message;

import java.util.List;
import java.time.LocalTime;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.domain.FleaMarketDTO;
import com.ssd.delivery.domain.MessageDTO;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
public class ViewMessageController {
	@Autowired
	private DeliveryFacade delivery;
	
	@Autowired
	public void setDeliveryFacade(DeliveryFacade delivery) {
		this.delivery = delivery;
	}
	
	@RequestMapping("/message/create.do")
	public ModelAndView showMessageForm(Model model, HttpSession session) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		List<AccountDTO> receivers = delivery.getUserList();
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("sender", username);
		mav.addObject("receiversList", receivers);
		mav.setViewName("messageForm");
				
		return mav;

	
	}
	
	@RequestMapping("/message/sending.do")
	public ModelAndView sendingMessage(Model model, HttpSession session, @RequestParam("receiverUsername") String receiver,
			@RequestParam("content") String content) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		LocalTime currentTime = LocalTime.now();
		String date = currentTime.getHour() + "시 " + currentTime.getMinute() + "분";
		
		MessageDTO message = new MessageDTO(username, receiver, content, date);
		delivery.insertMessage(message);
		
		ModelAndView mav = new ModelAndView();
		
		List<MessageDTO> messageList = delivery.getMessageListByUsername(username);
		
		mav.addObject("DMList", messageList);
		mav.setViewName("messageList");
				
		return mav;
	
	}
	
	@RequestMapping("/user/message.do")
	public ModelAndView showMessageList(Model model, HttpSession session) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		ModelAndView mav = new ModelAndView();
	
		List<MessageDTO> messageReceiveList = delivery.getMessageListByReceiverUsername(username);
		List<MessageDTO> messageList = delivery.getMessageListByUsername(username);

		mav.addObject("DMList", messageList);
		mav.addObject("RCList", messageReceiveList);
		mav.addObject("userSession", account);
		mav.setViewName("messageList");
				
		return mav;
	}
	
	@RequestMapping("/message/view/content.do")
	public ModelAndView viewMessageContent(Model model, HttpSession session, @RequestParam("receiver") String receiver) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		ModelAndView mav = new ModelAndView();
		
		List<MessageDTO> messageContents = delivery.getMessageContentByUsername(username, receiver);
		List<MessageDTO> messageReceiveContents = delivery.getMessageContentByReceiverUsername(receiver, username);
		
		messageContents.addAll(messageReceiveContents);
		mav.addObject("username", username);
		mav.addObject("receiver", receiver);
		mav.addObject("contentList", messageContents);
		mav.setViewName("message");
				
		return mav;
	}
	
}
