package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex")
public class ExamThymeleafController {
	@RequestMapping("")
	public String index() {
		return "ex-thymeleaf-input";
	}

	@RequestMapping("/result")
	public String result(String name, Integer age, String hobby1, 
			String hobby2, String hobby3, Model model) {
		List<String> hobbyList = new ArrayList<>();
		hobbyList.add(hobby1);
		hobbyList.add(hobby2);
		hobbyList.add(hobby3);

		model.addAttribute("name", name);
		model.addAttribute("age", age);
		model.addAttribute("hobbyList", hobbyList);

		return "ex-thymeleaf-result";
	}
	


}
