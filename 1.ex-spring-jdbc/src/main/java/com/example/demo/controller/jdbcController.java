package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jdbc")
public class jdbcController {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@RequestMapping("execute")
	public String excute() {
		String sql="SELECT count(*) from employees "
				+ " where id=:firstID or id=:secondID;";
		SqlParameterSource param=new MapSqlParameterSource().addValue("firstID", 1).addValue("secondID", 3);
		Integer result =template.queryForObject(sql, param, Integer.class);
		System.out.println("result="+result);
		return "finished";
				
	}
}
