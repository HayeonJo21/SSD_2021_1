package com.ssd.delivery.controller.copurchasing;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.service.DeliveryFacade;

@Controller
@RequestMapping("/admin/coPurchasing/delete.do")
public class DeleteCPController { 

	private DeliveryFacade delivery;

	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}
	
	@GetMapping
	public String admincoPurchasingDelete(Model model, HttpSession session, @RequestParam("cpId") int cpId) throws Exception {
		
		delivery.deleteCP(cpId);
		delivery.deleteCPLineItem(cpId);
		
		return "redirect:/admin/coPurchasing.do";
	}
}
