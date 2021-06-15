package com.ssd.delivery.controller.account;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.delivery.domain.Account;
import com.ssd.delivery.domain.AccountDTO;
import com.ssd.delivery.domain.FavoriteUserDTO;
import com.ssd.delivery.domain.Product;
import com.ssd.delivery.service.DeliveryFacade;
import com.ssd.delivery.service.Message;
import com.ssd.delivery.service.PetStoreFacade;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;

@Controller
@SessionAttributes("userSession")
@RequestMapping("/delivery/signon.do")
public class SignonController {

	private DeliveryFacade delivery;

	@Autowired
	public void setDelivery(DeliveryFacade delivery) {
		this.delivery = delivery;
	}

	@GetMapping
	public String showForm() {
		return "login";
	}

	@PostMapping
	public String handleRequest(HttpServletRequest request, @RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam(value = "forwardAction", required = false) String forwardAction, Model model)
			throws Exception {

		AccountDTO account = delivery.findUser(username);
		System.out.println("******로그인 컨트롤러*******");

		if (account == null) { // 로그인 정보 불일치
			model.addAttribute("data", new Message("가입되지 않은 아이디거나 잘못된 비밀번호 입니다.", "/"));
			return "login";
		}

		model.addAttribute("userSession", account);

		// 로그인 하기 직전 페이지로 이동
		// forwardAction(이전 페이지) 값은 GET 요청 시 interceptor에서 form으로 보낸 뒤 POST 요청 시에
		// parameter로 받아오는 것
		
		if (forwardAction != null)
			return "redirect:/" + forwardAction;
		else
			return "redirect:/";
	}
}
