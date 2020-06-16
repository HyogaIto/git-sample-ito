package com.example.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.FactorialService;

@Controller
@RequestMapping("/factorial")
public class FactorialController {
	
	@Autowired
	FactorialService service;
	
	@RequestMapping("/view-result")
	public String viewResult(Model model) {
		int num=5;
		
		model.addAttribute("result", service.getFactrial(num));
		
		return "ex-22-result";
	}
	
}
