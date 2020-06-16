package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam03")
public class ReceiveNameController {
	
	@ModelAttribute
	public ReceiveNameForm form() {
		return new ReceiveNameForm();
	}

	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("result")
	public String result(String name) {
		System.out.println(name);
		return "result";
	}
	
	@RequestMapping("formResult")
	public String fromResult(ReceiveNameForm form) {
		System.out.println(form.getName());
		return "result";
	}
	
}
