package com.ssd.delivery.controller.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import com.ssd.delivery.controller.UserSession;
import com.ssd.delivery.domain.*;
import com.ssd.delivery.service.AccountFormValidator;
import com.ssd.delivery.service.DeliveryFacade;

//등록, 수정 둘 다 이곳에서
@Controller
@RequestMapping({"/user/insertAccount.do","/user/updateAccount.do"})
public class AccountFormController {

	@Value("updateAccountForm")
	private String formViewName;
	
	@Autowired
	private DeliveryFacade delStore;
	
	@Autowired
	private AccountFormValidator validator;
	
	@ModelAttribute("accountForm")
	public AccountForm formBackingObject(HttpServletRequest request) 
			throws Exception {
		Account userSession = 
			(Account) WebUtils.getSessionAttribute(request, "userSession");
		if (userSession != null) {	// edit an existing account
			return new AccountForm(delStore.findUser(userSession.getUsername()));
		}
		else {	// create a new account
			return new AccountForm();
		}
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showForm() {
		return formViewName;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(HttpServletRequest request, HttpSession session,
			@ModelAttribute("accountForm") AccountForm accountForm,
			BindingResult result) throws Exception  {
		
		validator.validate(accountForm, result);
		if (result.hasErrors()) return formViewName;
		
		try {
			if (accountForm.isNewAccount()) {
				delStore.insertAccount(accountForm.getAccount());
			}
			else {
				delStore.updateAccount(accountForm.getAccount());
			}
		}
		catch (DataIntegrityViolationException ex) {
			result.rejectValue("account.userId", "USER_ID_ALREADY_EXISTS",
					"User ID already exists: choose a different ID.");
			return formViewName; 
		}
		
		
		AccountDTO userSession = delStore.findUser(accountForm.getAccount().getUsername());

		session.setAttribute("userSession", userSession);
		
		return "redirect:/";
	}
}