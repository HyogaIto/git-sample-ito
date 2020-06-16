package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex23")
public class Ex23Controller {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@RequestMapping("/execute")
	public String execute() {
		String sql="select count(*) from departments "
				+ "where name=:name1 or name=:name2";
		SqlParameterSource param =new MapSqlParameterSource().addValue("name1", "総務部").addValue("name2", "技術部");
		Integer result =template.queryForObject(sql, param, Integer.class);
		System.out.println(result);
		return "finished";
	}

}
