package com.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.org.dto.Employee;

public class EmployeeDao {
	
	
	public void InsertEmployee(Employee emp) {
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
				
				
				PreparedStatement stmt = con.prepareStatement("insert into employee(name,age,mobile,email,password)values(?,?,?,?,?)");
				
				
				stmt.setString(1, emp.getName());
				stmt.setInt(2, emp.getAge());
				stmt.setLong(3, emp.getMobile());
				stmt.setString(4, emp.getEmail());
				stmt.setString(5,emp.getPassword());
				
			    stmt.executeUpdate();
			    
			    stmt.close();
			    con.close();
			    
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
			
		public Employee fetchEmployeeById(int id) {
			Employee emp= new Employee();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
				
				
				PreparedStatement stmt = con.prepareStatement("select * from employee where id=?");
				stmt.setInt(1, id);
				
				
			    ResultSet rst = stmt.executeQuery();
			    
			    if(rst.next()) {
			    emp.setId(rst.getInt("id"));
			    emp.setName(rst.getString("name"));
			    emp.setAge(rst.getInt("age"));
			    emp.setMobile(rst.getLong("mobile"));
			    emp.setEmail(rst.getString("email"));
			    emp.setPassword(rst.getString("password"));
			    	
			    }
			    rst.close();
			    stmt.close();
			    con.close();
			    
			    return emp;
			   
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
			
		
		
	}



