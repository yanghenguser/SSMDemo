package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	@RequestMapping("/")
	public String rootframe(){
		
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(){
		
		return "ok";
	}
}
