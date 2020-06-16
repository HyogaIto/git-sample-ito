package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {
	@RequestMapping("")
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/login")
	public String login(String mail,String pass,Model model) {
		String result="失敗";
		if("yamada@sample.com".equals(mail)&&"yamayama".equals(pass)) {
			result="成功";
		}
		model.addAttribute("result", result);
		return "exam01-result";
	}

}
