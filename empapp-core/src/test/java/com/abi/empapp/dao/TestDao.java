package com.abi.empapp.dao;

import com.abi.empapp.model.employee;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp=new employee();
		emp.setNAME("xxx");
		emp.setDESIGATION("chennai");
		EmployeeDao dao=new EmployeeDao();
		
		dao.save(emp);
		
		
		

	}

}
