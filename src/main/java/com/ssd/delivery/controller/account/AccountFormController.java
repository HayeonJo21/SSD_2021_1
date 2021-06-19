package com.ssd.delivery.controller.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;
import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.AccountFormValidator;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.Message;
import com.ssd.delivery.service.OrderValidator;

//등록, 수정 둘 다 이곳에서
@Controller
@SessionAttributes("userSession")
@RequestMapping({"/delivery/userInsertAccount.do","/delivery/newUserSubmitted.do"})
public class AccountFormController {
	@Autowired
	private DeliveryFacade delivery;
	@Autowired
	private AccountFormValidator validator;
	
	@GetMapping
	public String showForm() { 
		return "register";
	}
	
//	@PostMapping
//	public String handleRequest(HttpServletRequest request, AccountDTO account,
//			@RequestParam(value = "forwardAction", required = false) String forwardAction, Model model)
//			throws Exception {
//
//		boolean existingUser = delivery.existingUser(account.getUsername());
//
//		if (existingUser == false) { // 존재하지 않는 회원, 회원가입기능 구현
//			account.setStatus(1);
//			delivery.insertAccount(account);
//			
//			return "redirect:/";
//		}
//		else {
//			delivery.updateAccount(account);
//		}
//
//		model.addAttribute("userSession", account);
//
//		if (forwardAction != null) {
//			return "redirect:/" + forwardAction;
//		}
//		else {
//			return "redirect:/";
//		}
//	}
//	
//	@RequestMapping(method=RequestMethod.POST)
//	public String submit(AccountDTO account) {
//		account.setStatus(1);
//		delivery.insertAccount(account);
//		
//		return "redirect:/";
//	}

	
//	@Autowired
//	private AccountFormValidator validator;
//	
//	@ModelAttribute("register")
//	public AccountForm formBackingObject(HttpServletRequest request) 
//			throws Exception {
//		Account userSession = 
//			(Account) WebUtils.getSessionAttribute(request, "userSession");
//		if (userSession != null) {	// edit an existing account
//			return new AccountForm(delivery.findUser(userSession.getUsername()));
//		}
//		else {	// create a new account
//			return new AccountForm();
//		}
//	}
//	

//	
	@PostMapping
	public String onSubmit(HttpServletRequest request, HttpSession session,
			@ModelAttribute("accountForm") AccountDTO account,
			BindingResult result) throws Exception  {
		
		validator.validate(account, result);
		if (result.hasErrors()) return "register";
		
		try {
			AccountDTO existingUser = delivery.findUser(account.getUsername());
			
			if(existingUser == null) {
				account.setStatus(1);
				delivery.insertAccount(account);
			}
		}
		catch (DataIntegrityViolationException ex) {
			result.rejectValue("account.username", "USER_ID_ALREADY_EXISTS",
					"User ID already exists: choose a different ID.");
			return "redirect:/"; 
		}
		
		session.setAttribute("userSession", account);
		
		return "redirect:/";
	}
}