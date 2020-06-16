package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	@RequestMapping("/show-company-introduction")
	public String showCompanyIntroduction() {
		return "redirect:show-company-introduction2";
	}
	
	@RequestMapping("/show-company-introduction2")
	public String showCompanyIntroduction2() {
		return "exam02";
	}
}
