package com.ssd.delivery;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
	@Qualifier(value = "signonInterceptor")
	private HandlerInterceptor interceptor;

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/delivery/mainpage.jsp").setViewName("index");
		registry.addViewController("/user/insertAccount.do").setViewName("register");
		registry.addViewController("/user/updateAccount.do").setViewName("mypage");
		registry.addViewController("/user/newUserSubmitted.do").setViewName("index");
		registry.addViewController("/user/mypage.do").setViewName("mypage");
		registry.addViewController("/delivery/signon.do").setViewName("login");
		registry.addViewController("/delivery/signoff.do").setViewName("index"); 
		registry.addViewController("/auction/view.do").setViewName("auctionpage");
		registry.addViewController("/copurchasing/view.do").setViewName("copurchasingpage");
		registry.addViewController("/fleamarket/view.do").setViewName("fleaMarketPage");
		registry.addViewController("/user/message.do").setViewName("message");
		

	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor)
				.addPathPatterns("/shop/editAccount.do", "/shop/listOrders.do",
					"/shop/viewOrder.do", "/shop/newOrder.do");		
	}
}
