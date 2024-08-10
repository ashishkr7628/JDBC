package com.org.controller;

import java.util.Scanner;

import com.org.dao.EmployeeDao;
import com.org.dto.Employee;

public class EmployeeController {
	
	public static void main(String[] args) {
		
//		Scanner os= new Scanner(System.in);
//		Employee emp =new Employee();
//		String name= os.next();
//		int age = os.nextInt();
//		long mobile= os.nextLong();
//		String email = os.next();
//		os.nextLine();
//		String password=os.next();
//		emp.setName(name);
//		emp.setAge(age);
//		emp.setMobile(mobile);
//		emp.setEmail(email);
//		emp.setPassword(password);
//		
		EmployeeDao dao = new EmployeeDao();
//		dao.InsertEmployee(emp);
//		
		System.out.println("Data Inserted");
		
		
		Employee emp = dao.fetchEmployeeById(1);
		System.out.println(emp);
	}

}
