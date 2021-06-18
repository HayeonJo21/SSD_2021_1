package com.ssd.delivery.controller.event;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.service.DeliveryFacade;

@Controller
public class TestSchedulerController { 

	private DeliveryFacade delivery;

	@Autowired
	public void setPetStore(DeliveryFacade delivery) {
		this.delivery = delivery;
	}

	@RequestMapping("/shop/testScheduler.do")
	public ModelAndView handleRequest(HttpServletRequest request,
			@RequestParam("keyword")
			@DateTimeFormat(pattern="yyyy-MM-dd HH:mm") Date closeTime) throws Exception {
		System.out.println(closeTime);
		delivery.testScheduler(closeTime);
		return new ModelAndView("Scheduled", "closeTime", closeTime);	
	}
}
