package com.ssd.delivery.controller.fleamarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssd.delivery.domain.Item;
import com.ssd.delivery.service.PetStoreFacade;

/**
 * @author Juergen Hoeller
 * @since 30.11.2003
 * @modified-by Changsup Park
 */
@Controller
public class DetailViewFMController { 

	private PetStoreFacade petStore;

	@Autowired
	public void setPetStore(PetStoreFacade petStore) {
		this.petStore = petStore;
	}

	//@RequestMapping("/shop/viewItem.do")
	public String handleRequest(
			@RequestParam("itemId") String itemId,
			ModelMap model) throws Exception {
		Item item = this.petStore.getItem(itemId);
		model.put("item", item);
		model.put("product", item.getProduct());
		return "Item";
	}

}
