package com.jigyasa.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.jigyasa.model.Employee;

public class EmployeeDAO {
	
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public JdbcTemplate getJdbctemplate()
	{
		return jdbcTemplate;
	}
	public int setEmployee(Employee eid)
	{
		String query="insert into employee values('"+eid.getName()+"')";
		return jdbcTemplate.update(query);
	}

	
	public void updateEmployee(String id  , String name ,String dept , Double salary )
	{
		/*String names = eid.getName();
		String depts = eid.getDept();
	   Double sals = eid.getSalary();
		String query="update into employee set name = "+eid.setName(names)+" , dept= '"+eid.setDept(depts)+" ', salary = '"+eid.setSalary(sals)+"'  where id = '"+eid.getId()+"' ";
		*/
		
		
	/*	eid.setName(name);
		eid.setDept(dept);
		eid.setSalary(salary);
		
		
		String query="update into employee set name = "+eid.setName(name)+" , dept= '"+eid.setDept(depts)+" ', salary = '"+eid.setSalary(sals)+"'  where id = '"+eid.getId()+"' ";
	*/
		
		
		
		String updateTableSQL = "UPDATE employee SET NAME = ?  , DEPT=? ,SALARY = ? WHERE ID = ?";
	
		// id how to take from resultse
	
            jdbcTemplate.execute(updateTableSQL,new PreparedStatementCallback() {
			
			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setString(1,name);
				ps.setString(2, dept);
				ps.setDouble(3,salary);				
				ps.setString(4,id);				
				 return ps;
			}
		});
		 
		 
		//MyPrepared myPrepared = new MyPrepared(updateTableSQL);
		
		
		 
	}
	private class MyPrepared implements PreparedStatementCallback{

		public String qry;
		
		public MyPrepared() {
			// TODO Auto-generated constructor stub
		}
		public MyPrepared(String qry){
			this.qry=qry;
		}
		@Override
		public Object doInPreparedStatement(PreparedStatement ps)
				throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			ps.setString(1, "name");
			ps.setString(2, "id");
			return ps;
		}
		
	}

	
	public int deleteEmployee(Employee eid)
	{
		String query="insert into employee values('"+eid.getName()+"')";
		return jdbcTemplate.update(query);
	}

	
	public int searchEmployee(Employee eid)
	{
		String query="insert into employee values('"+eid.getName()+"')";
		return jdbcTemplate.update(query);
	}


}
