package com.ssd.delivery.controller.message;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
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
	
	@RequestMapping("/delivery/messageCreate.do")
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
	
	@RequestMapping("/delivery/messageSend.do")
	public ModelAndView sendingMessage(Model model, HttpSession session, @RequestParam("receiverUsername") String receiver,
			@RequestParam("content") String content) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();

		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		String currentDate = dFormat.format(date);
		
		MessageDTO message = new MessageDTO(username, receiver, content, currentDate);
		delivery.insertMessage(message);
		
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
	
	@RequestMapping("/delivery/message.do")
	public ModelAndView showMessageList(Model model, HttpSession session) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String username = account.getUsername();
		ModelAndView mav = new ModelAndView();

		List<MessageDTO> smessageList = delivery.getMessageListByUsername(username);
		List<MessageDTO> rmessageList = delivery.getMessageListByReceiverUsername(username);

		ArrayList<String> messageList = new ArrayList<>();
		
		for (int i = 0; i < smessageList.size(); i++) {
			if (!messageList.contains(smessageList.get(i).getSenderUsername()) && smessageList.get(i).getSenderUsername() != null)
				messageList.add(smessageList.get(i).getSenderUsername());
			else if (!messageList.contains(smessageList.get(i).getReceiverUsername()) && smessageList.get(i).getReceiverUsername() != null)
				messageList.add(smessageList.get(i).getReceiverUsername());
		}
		
		for (int i = 0; i < rmessageList.size(); i++) {
			if (!messageList.contains(rmessageList.get(i).getSenderUsername()) && rmessageList.get(i).getSenderUsername() != null)
				messageList.add(rmessageList.get(i).getSenderUsername());
			else if (!messageList.contains(rmessageList.get(i).getReceiverUsername()) && rmessageList.get(i).getReceiverUsername() != null)
				messageList.add(rmessageList.get(i).getReceiverUsername());
		}
		
		mav.addObject("DMList", messageList);
		mav.addObject("userSession", account);
		mav.addObject("username", username);
		mav.setViewName("messageList");
		
		return mav;
	}
	
	@RequestMapping("/delivery/messageViewContent.do")
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
