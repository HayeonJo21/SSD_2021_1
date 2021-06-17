package com.ssd.delivery.controller.copurchasing;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.DeliveryImpl;
import com.ssd.delivery.service.Message;

@Controller
@SessionAttributes("userSession")
@RequestMapping("/coPurchasing/insert/form.do")
public class InsertCPFormController {
	@Autowired
	private DeliveryFacade delivery;

	@SuppressWarnings("null")
	@GetMapping
	public ModelAndView showInsertForm() {
		List<DeliveryDTO> deliveryList = delivery.getDeliveryList();
		List<DeliveryDTO> del = delivery.isExistingCP();

		ModelAndView mav = new ModelAndView();

		for (int i = 0; i < del.size(); i++) {
			for (int j = 0; j < deliveryList.size(); j++) {
				if (del.get(i).getDeliveryId() == deliveryList.get(j).getDeliveryId()) {
					deliveryList.remove(j);
				}
			}
		}

		mav.addObject("delList", deliveryList);
		mav.setViewName("copurchasingForm");

		return mav;
	}
}
