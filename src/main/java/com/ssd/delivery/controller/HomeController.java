package com.ssd.delivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	 @GetMapping("/")
	    public String home(){
	        return "index";
	    }
	
} 