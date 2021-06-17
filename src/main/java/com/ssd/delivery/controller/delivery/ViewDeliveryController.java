package com.ssd.delivery.controller.delivery;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.DeliveryImpl;
import com.ssd.delivery.service.Message;

@Controller
@RequestMapping("/delivery/detailView.do")
public class ViewDeliveryController {
	@Autowired
	private DeliveryFacade delivery;
	
	@GetMapping
	public ModelAndView DeliveryDetailView(Model model, HttpSession session, @RequestParam("deliveryId") int deliveryId) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		DeliveryDTO deliveryItem = delivery.getDeliveryById(deliveryId);
		DeliveryDTO del = delivery.isExistingCP();
		
		ModelAndView mav = new ModelAndView();
		
		if(del != null && del.getDeliveryId() == deliveryId) {
			Message msg = new Message("공동구매로 진행중인 용달 서비스 입니다.", "/");
			mav.addObject("msg", msg);
			mav.addObject("delivery", deliveryItem);
			mav.addObject("userSession", account);
			mav.setViewName("deliveryDetail");
		}
		else{
			mav.addObject("delivery", deliveryItem);
			mav.addObject("userSession", account);
			mav.setViewName("deliveryDetail");
		}
		
				
		return mav;
	}
}
