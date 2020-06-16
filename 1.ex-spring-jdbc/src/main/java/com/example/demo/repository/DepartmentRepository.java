package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Department;

@Repository
public class DepartmentRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private final String TABLE_NAME="departments";
	
	private static final RowMapper<Department> DEPARTMENT_ROW_MAPPER=(rs,i)->{
		Department department=new Department();
		department.setId(rs.getInt("id"));
		department.setName(rs.getString("name"));
		return department;
	};
	
	private SimpleJdbcInsert insert;
	
	@PostConstruct
	public void init() {
		SimpleJdbcInsert simpleJdbcInsert=new SimpleJdbcInsert((JdbcTemplate)template.getJdbcOperations());
		SimpleJdbcInsert withTableName=simpleJdbcInsert.withTableName(TABLE_NAME);
		insert=withTableName.usingGeneratedKeyColumns("id");
	}
	
	public Department load(Integer id) {
		String sql="select id,name from "+TABLE_NAME+" where id=:id;";
		SqlParameterSource param=new MapSqlParameterSource().addValue("id", id);
		
		Department department =template.queryForObject(sql, param,DEPARTMENT_ROW_MAPPER);
		
		return department;
	}
	
	public List<Department> findAll(){
		String sql="select id,name from "+TABLE_NAME+" order by id;";
		
		List<Department> departmentList=template.query(sql, DEPARTMENT_ROW_MAPPER);
		return departmentList;
	}
	
	public Department save(Department department) {
		
		
		return null;
	}
	public void deleteById(Integer id) {
		System.out.println("dep-Repository-deleteById");
	}
	

}
