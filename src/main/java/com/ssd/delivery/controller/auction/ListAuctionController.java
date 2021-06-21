package com.ssd.delivery.controller.auction;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.controller.UserSession;
import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.AuctionDTO;
import com.ssd.delivery.domain.CoPurchasingDTO;
import com.ssd.delivery.service.DeliveryFacade;


//@Controllerf
//@RequestMapping("/auction/view.do")
//public class ListAuctionController {
//	private DeliveryFacade delivery;
//	@Autowired
//	public void setDeliveryFacade(DeliveryFacade delivery) {
//		this.delivery= delivery;
//	}
//   
//	@GetMapping
//	public ModelAndView viewMypage(Model model, HttpSession session) throws Exception {
//		AccountDTO account = (AccountDTO)session.getAttribute("userSession");
//		
//		String username = account.getUsername();
//		ModelAndView mav = new ModelAndView();
//		
//		List<AuctionDTO> ACList = delivery.getAuctionList();
//		
//		mav.addObject("ACList", ACList);
//		mav.setViewName("auctionpage");
//	
//		return mav;
//	}
//	
//	
//}
/**
 * @author Juergen Hoeller
 * @since 01.12.2003
 * @modified by Changsup Park
 */
@Controller
@SessionAttributes("userSession")
public class ListAuctionController {

	private DeliveryFacade delivery;

	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}

	@RequestMapping("/auction/list")
	public ModelAndView handleRequest(
		@ModelAttribute("userSession") UserSession userSession
		) throws Exception {
		return new ModelAndView("auctionList", "auctionList", 
				delivery.getAuctionList());
	}

}
