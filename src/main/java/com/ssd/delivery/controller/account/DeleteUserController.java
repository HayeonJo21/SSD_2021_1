package com.ssd.delivery.controller.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;
import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.DeliveryImpl;

@Controller
@SessionAttributes("userSession")
public class DeleteUserController { 

	@Autowired
	private DeliveryFacade delStore;
	
	@Value("DeleteAccountForm")
	private String formViewName;
	
	@ModelAttribute("DeleteAccountForm")
	public AccountForm formBackingObject(HttpServletRequest request) 
			throws Exception {
		AccountDTO userSession = 
			(AccountDTO) WebUtils.getSessionAttribute(request, "userSession");
		
			return new AccountForm();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String deleteAccount(@RequestParam("account.password") String password, 
			 HttpSession session) throws Exception {
		AccountDTO curAccount = (AccountDTO)session.getAttribute("userSession");
		try {
			System.out.println(curAccount.getPassword() + " " + password + " " + curAccount.getUsername());
			if (curAccount.getPassword().equals(password)) {
				delStore.deleteAccount(curAccount.getUsername());
				session.removeAttribute("userSession");
				session.invalidate();
			} else {	// 패스워드가 일치하지 않음
				return formViewName;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return formViewName; 
		}
		
		return "thyme/user/Goodbye";
	}
}
