package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;

@Controller
@RequestMapping("/exam-bonus")
public class ExamBonusController {
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("")
	public String index(){
		
	return "exam-bonus-input";
	}	
	
	@RequestMapping("/result")
	public String result(User user,String mail,String pass,Model model) {
		User use =new User();
		
		String result;
		if("yamada@sample.com".equals(mail)&&"yamayama".equals(pass)) {
			result="成功";
			use.setName("山田太郎");
			use.setEmail(mail);
			use.setAge(18);
			
			session.setAttribute("user", use);
			model.addAttribute("result", "ログインに"+result+"しました");
			
			return "exam-bonus-result";
		}
		result="失敗";
		model.addAttribute("result", "ログインに"+result+"しました");
		return "exam-bonus-input";
		
	}

}
