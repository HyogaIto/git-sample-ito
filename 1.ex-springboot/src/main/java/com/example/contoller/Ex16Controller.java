package com.example.contoller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Ex10User;

@Controller
@RequestMapping("/ex16")
public class Ex16Controller {
	
	@Autowired
	private ServletContext application;
	
	
	
	@RequestMapping("")
	public String index() {
		
		List<Ex10User> list;
		list=(ArrayList<Ex10User>)application.getAttribute("list");
		
		if(list==null) {
			list=new ArrayList<>();
			application.setAttribute("list", list);
		}
		
		List<Ex10User> list2=list;
		int j=0;
		for(int i=list2.size() ; i>0;i--) {
			list.add(i-1,list2.get(j));
			j++;
		}
		
		return "ex-16";
	}
	
	@RequestMapping("post")
	public String post(String name,String comment){
		Ex10User user=new Ex10User();
		user.setName(name);
		user.setComment(comment);
		
		List<Ex10User> list;
		
		list=(ArrayList<Ex10User>)application.getAttribute("list");
		list.add(user);
		application.setAttribute("list", list);
		
		
		return "ex-16";
	}

}
