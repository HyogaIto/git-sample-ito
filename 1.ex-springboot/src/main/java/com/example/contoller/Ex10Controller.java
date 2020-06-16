package com.example.contoller;



import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Ex10User;
import com.example.form.Ex10Form;

@Controller
@RequestMapping("/ex10")
public class Ex10Controller {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "ex-10-input";
	}
	
	@RequestMapping("/ex10Input")
//	public String ex10Input(Ex10Form ex10Form) {
//		session.setAttribute("name", ex10Form.getName());
//		session.setAttribute("age", ex10Form.getAge());
//		session.setAttribute("comment", ex10Form.getComment());
//		return "ex-10-output";
//	}
//	
//	public String ex10Input(Ex10User user) {
//		session.setAttribute("user", user);
//		return "ex-10-output";
//	}
	
	public String ex10Input(Ex10Form ex10Form) {
		Ex10User user =new Ex10User();
		user.setName(ex10Form.getName());
		user.setBirthDay(ex10Form.getBirthDay());
		user.setComment(ex10Form.getComment());
		application.setAttribute("user", user);
		return "ex-10-output";
	}
	
	@RequestMapping("/ex10Output")
	public String ex10Output() {
		return "ex-10-output";
	}
	
	@RequestMapping("/ex10Output2")
	public String ex10Output2() {
		return "ex-10-output2";
	}
	
}
