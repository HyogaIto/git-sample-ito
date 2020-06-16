package com.example.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;

@Controller
@RequestMapping("/ex14")
public class Ex14Controller {

	@RequestMapping("")
	public String index(Model model) {
		
		List<String> list = new ArrayList<>();
		list.add("柴田");
		list.add("中西");
		list.add("東");
		list.add("森本");
		list.add("伊藤");
		
		model.addAttribute("list",list);
		
		
		return "ex-14";
		
	}
}
