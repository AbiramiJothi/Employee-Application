package com.abi.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.abi.empapp.model.employee;
import com.abi.empapp.util.ConnectionUtil;

public class EmployeeDao {
	
	
		private JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
		
		public void save(employee emp){
		String sql="insert into employee(NAME,DESIGATION)values(?,?)";
		Object[] params={emp.getNAME(),emp.getDESIGATION()};
		int rows=jdbcTemplate.update(sql,params);
		System.out.println(rows);
		
		}
				
		}
		
	


