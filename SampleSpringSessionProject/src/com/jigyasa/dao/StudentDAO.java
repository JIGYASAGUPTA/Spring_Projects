package com.jigyasa.dao;

import com.jigyasa.model.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public JdbcTemplate getJdbctemplate()
	{
		return jdbcTemplate;
	}
	public int setStudent(Student stu)
	{
		String query="insert into student values('"+stu.getName()+"')";
		return jdbcTemplate.update(query);
	}

}

