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
import com.ssd.delivery.domain.FavoriteUserDTO;
import com.ssd.delivery.service.AccountFormValidator;
import com.ssd.delivery.service.DeliveryFacade;

@Controller
@RequestMapping({"/shop/newAccount.do","/shop/editAccount.do"})
public class AccountFormController { 

	@Value("EditAccountForm")
	private String formViewName;
	@Value("index")
	private String successViewName;
	private static final String[] LANGUAGES = {"english", "japanese"};
	
	@Autowired
	private DeliveryFacade delStore;
	
	public void setPetStore(DeliveryFacade delStore) {
		this.delStore = delStore;
	}

	@Autowired
	private AccountFormValidator validator;
	public void setValidator(AccountFormValidator validator) {
		this.validator = validator;
	}
		
	@ModelAttribute("accountForm")
	public AccountForm formBackingObject(HttpServletRequest request) 
			throws Exception {
		UserSession userSession = 
			(UserSession) WebUtils.getSessionAttribute(request, "userSession");
		if (userSession != null) {	// edit an existing account
			return new AccountForm(
				delStore.findUser(userSession.getAccount().getUsername()));
		}
		else {	// create a new account
			return new AccountForm();
		}
	}

	@ModelAttribute("languages")
	public String[] getLanguages() {
		return LANGUAGES;
	}

//	@ModelAttribute("categories")
//	public List<Category> getCategoryList() {
//		return petStore.getCategoryList();
//	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showForm() {
		return formViewName;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(
			HttpServletRequest request, HttpSession session,
			@ModelAttribute("accountForm") AccountForm accountForm,
			BindingResult result) throws Exception {

//		if (request.getParameter("account.listOption") == null) {
//			accountForm.getAccount().setListOption(false);
//		}
//		if (request.getParameter("account.bannerOption") == null) {
//			accountForm.getAccount().setBannerOption(false);
//		}
		
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
			result.rejectValue("account.username", "USER_ID_ALREADY_EXISTS",
					"이미 존재하는 아이디 입니다. 다른 아이디를 입력해주세요.");
			return formViewName; 
		}
		
		UserSession userSession = new UserSession(
			delStore.findUser(accountForm.getAccount().getUsername()));
		PagedListHolder<FavoriteUserDTO> myList = new PagedListHolder<FavoriteUserDTO>(
			delStore.getFavoriteUserList(accountForm.getAccount().getFavoriteMall()));
		myList.setPageSize(4);
		userSession.setMyList(myList);
		session.setAttribute("userSession", userSession);
		return successViewName;  
	}
}
