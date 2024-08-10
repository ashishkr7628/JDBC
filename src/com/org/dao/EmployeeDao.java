package com.org.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> f46a9d1 (second commit)

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
<<<<<<< HEAD
=======
				System.out.println("Data Inserted");
>>>>>>> f46a9d1 (second commit)
			    
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
			
<<<<<<< HEAD
		public Employee fetchEmployeeById(int id) {
=======
		public Employee fetchEmployeeById (int id) {
>>>>>>> f46a9d1 (second commit)
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
			    
<<<<<<< HEAD
			    return emp;
=======
			    
>>>>>>> f46a9d1 (second commit)
			   
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
<<<<<<< HEAD
=======
			return emp;
			
			
		}
		
		
		public List<Employee> fetchall(){
			
			List<Employee> list= new ArrayList<Employee>();
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
				
				
				PreparedStatement stmt = con.prepareStatement("select * from employee ");
				
				
				
			    ResultSet rst = stmt.executeQuery();
			    
			    while(rst.next()) {
			    	Employee emp1= new Employee();
			    emp1.setId(rst.getInt("id")); 
			    emp1.setName(rst.getString("name"));
			    emp1.setAge(rst.getInt("age"));
			    emp1.setMobile(rst.getLong("mobile"));
			    emp1.setEmail(rst.getString("email"));
			    emp1.setPassword(rst.getString("password"));
			    list.add(emp1);
			    
			    	
			    }
			    
			   
			    rst.close();
			    stmt.close();
			    con.close();
			    
			
			   
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
			
			
			
		
			
			
			
			
			
		
			
			
			
			
			
		}
		
		public void updateEmployeeById(int id,Employee emp) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
				
				
				PreparedStatement stmt = con.prepareStatement("update employee set name=?,age=?,mobile=?,email=?,password=? where id=?");
				
				stmt.setString(1,emp.getName());
				stmt.setInt(2,emp.getAge());
				stmt.setLong(3,emp.getMobile());
				stmt.setString(4,emp.getEmail());
				stmt.setString(5,emp.getPassword());
				stmt.setInt(6, id);
				
				
			    stmt.executeUpdate();
			    
			    stmt.close();
			    con.close();
			    System.out.println("Data Updated");
			    
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
>>>>>>> f46a9d1 (second commit)
			
			
		}
		
<<<<<<< HEAD
		
=======
		public void deleteEmployeeById(int id) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","ashish");
				
				
				PreparedStatement stmt = con.prepareStatement("delete from employee where id=?");
				
				stmt.setInt(1,id);
				
			    stmt.executeUpdate();
			    
			    stmt.close();
			    con.close();
			    System.out.println("Data Deleted");
			    
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
>>>>>>> f46a9d1 (second commit)
		
		
			
		
		
	}



