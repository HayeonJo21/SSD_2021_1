package com.ssd.delivery.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.service.PetStoreFacade;

@Controller
public class ViewUserController { 

	private PetStoreFacade petStore;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	@RequestMapping("/user/view")
	public String handleRequest(
			@RequestParam("username") String username,
			ModelMap model) throws Exception {
		AccountDTO user = this.petStore.getAccountDTO(username);
		model.put("user", user);
		return "userView";
	}

}
