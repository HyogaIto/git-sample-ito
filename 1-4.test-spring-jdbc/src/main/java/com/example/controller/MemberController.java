package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		System.out.println(repository.findAll());
		
		System.out.println(repository.load(2));
		
		Member member =new Member();
		
		member.setName("伊藤彪我");
		member.setAge(23);
		member.setDepId(1);
		
		repository.save(member);
		
		Member member2 =new Member();
		member2=repository.load(2);
		member2.setName("シロー");
		repository.save(member2);
		
		return "member";
	}
}
