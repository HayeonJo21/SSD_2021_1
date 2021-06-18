package com.ssd.delivery.controller.delivery;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
@RequestMapping("/delivery/insert.do")
@SessionAttributes("userSession")
public class InsertDeliveryController {
	@Autowired
	private DeliveryFacade delivery;
	 
	@GetMapping
	public String showForm() { 
		return "deliveryForm";
	}
	
	@PostMapping
	public ModelAndView insertDelivery(Model model, HttpSession session, @ModelAttribute("deliveryForm")  DeliveryDTO del) throws Exception {
		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
		
		String sdate = del.getServiceDate();
		
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy/MM/dd");

		Date to = dFormat.parse(sdate);
		String date = dFormat.format(to);

		del.setServiceDate(date);
		delivery.insertDelivery(del);
	
		ModelAndView mav = new ModelAndView();

		mav.addObject("delivery", del);
		mav.addObject("userSession", account);
		mav.setViewName("deliveryDetail");
				
		return mav;
	
	}
	
}
