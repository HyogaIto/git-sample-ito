package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {
	
	@RequestMapping("")
	public String index() {
		return "ex-04";
	}
	
	@RequestMapping("/login")
	public String login(String mail,String pass) {
		if("abc@gmail.com".equals(mail) && "abc".equals(pass)) {
			return "ex-04-success";
		}else {
			return "ex-04-failure";
		}
		
	}

}
