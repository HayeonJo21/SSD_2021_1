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
		registry.addViewController("/delivery/insertAccount.do").setViewName("register");
		registry.addViewController("/delivery/updateAccount.do").setViewName("accountUpdate");
		registry.addViewController("/delivery/newUserSubmitted.do").setViewName("index");
		registry.addViewController("/delivery/mypage.do").setViewName("mypage");
		registry.addViewController("/delivery/signon.do").setViewName("login");
		registry.addViewController("/delivery/signoff.do").setViewName("index"); 
//		registry.addViewController("/auction/view.do").setViewName("auctionpage");
		registry.addViewController("/delivery/copurchasingView.do").setViewName("copurchasingpage");
		registry.addViewController("/delivery/fleamarketView.do").setViewName("fleaMarketPage");
		registry.addViewController("/delivery/message.do").setViewName("message");
		registry.addViewController("/delivery/messageCreate.do").setViewName("messageForm");
		registry.addViewController("/delivery/messageSend.do").setViewName("message");
		registry.addViewController("auctionDetail.do").setViewName("auctionDetail");
		registry.addViewController("delivery/detailView.do").setViewName("deliveryDetail");
		registry.addViewController("delivery/listView.do").setViewName("deliveryDetail");
		

	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor)
				.addPathPatterns("/shop/editAccount.do", "/shop/listOrders.do",
					"/shop/viewOrder.do", "/shop/newOrder.do");		
	}
}
