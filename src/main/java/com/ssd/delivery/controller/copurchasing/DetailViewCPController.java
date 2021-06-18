package com.ssd.delivery.controller.copurchasing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.domain.CoPurchasingLineItemDTO;

import com.ssd.delivery.domain.DeliveryDTO;
import com.ssd.delivery.domain.Item;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.PetStoreFacade;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
@RequestMapping("/coPurchasing/detailView.do")
public class DetailViewCPController { 
	@Autowired
	private DeliveryFacade delivery;
	
	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}
	
	@GetMapping
	public String handleRequest(
			@RequestParam("coPurchasingId") int cpId,
			ModelMap model) throws Exception {
		
		System.out.println(cpId);
		CoPurchasingDTO cp = this.delivery.getCPById(cpId);
		DeliveryDTO del = delivery.getDeliveryById(cp.getDelivery());
		
		List<CoPurchasingLineItemDTO> cplineitem = delivery.getCPLineItemsByCPId(cpId);
		
		if (cplineitem != null) model.put("cplineitem", cplineitem);
		
		model.put("cp", cp);
		model.put("del", del);
//		model.put("cplineitem", cplineitem);
		return "coPurchasingDetail";
		
		
		
		
	}

}
