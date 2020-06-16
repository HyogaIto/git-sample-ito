package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Ex06Form;

@Controller
@RequestMapping("/ex06")
public class EX06Controller {
	
	@ModelAttribute
	public Ex06Form setUpForm() {
		return new Ex06Form();
	}

	@RequestMapping("")
	public String index() {
		return "ex-06";
	}
	
	@RequestMapping("receive-info")
	public String receiveHobby(Ex06Form ex06Form) {
		System.out.println("名前："+ex06Form.getName());
		System.out.println("年齢："+ex06Form.getAge());
		System.out.println("コメント："+ex06Form.getComment());
		return "finished";
	}
	
}
