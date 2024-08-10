package com.org.controller;

<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> f46a9d1 (second commit)
import java.util.Scanner;

import com.org.dao.EmployeeDao;
import com.org.dto.Employee;

public class EmployeeController {
<<<<<<< HEAD
	
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
=======

	public static void main(String[] args) {

	EmployeeController emp= new EmployeeController();
	emp.employeeController();

	}
	
	public void employeeController() {
		

		System.out.println("**********HOMEPAGE*********");

		System.out.println("1. Insert Employee");
		System.out.println("2. Fetch Employee");
		System.out.println("3. Fetch All Employees");
		System.out.println("4. Update Employee");
		System.out.println("5. Delete Employee");
		System.out.println("6. Exit");

		System.out.println("Choose your choice");
		Scanner os = new Scanner(System.in);

		int choice = os.nextInt();
		EmployeeDao dao = new EmployeeDao();

		switch (choice) {
		case 1: {
			
			System.out.println("Enter Employee Name : ");
			String name= os.next();
			System.out.println("Enter Employee Age : ");
			int age = os.nextInt();
			System.out.println("Enter Employee Mobile : ");
			long mobile= os.nextLong();
			System.out.println("Enter Employee Email : ");
			String email = os.next();
			System.out.println("Enter Employee Password : ");
			os.nextLine();
			String password=os.next();
			Employee emp = new Employee();

			emp.setName(name);
			emp.setAge(age);
			emp.setMobile(mobile);
			emp.setEmail(email);
			emp.setPassword(password);
		

			dao.InsertEmployee(emp);
			break;
			

		}
		case 2: {
			System.out.println("Enter the Employee Id to Update: ");
			int id = os.nextInt();
			Employee emp = dao.fetchEmployeeById(id);
			System.out.println(emp);
			break;

		}
		case 3: {
			
			

			List<Employee> listOfEmployees = dao.fetchall();
			System.out.println(listOfEmployees);
			break;

		}
		case 4: {
			
			System.out.println("Enter the Employee Id : ");
		
			int id = os.nextInt();
			System.out.println("Enter Employee Name : ");
			String name= os.next();
			System.out.println("Enter Employee Age : ");
			int age = os.nextInt();
			System.out.println("Enter Employee Mobile : ");
			long mobile= os.nextLong();
			System.out.println("Enter Employee Email : ");
			String email = os.next();
			System.out.println("Enter Employee Password : ");
			os.nextLine();
			String password=os.next();
			Employee emp = new Employee();
			emp.setName(name);
			emp.setAge(age);
			emp.setMobile(mobile);
			emp.setEmail(email);
			emp.setPassword(password);
			dao.updateEmployeeById(id, emp);
			break;

		}
		case 5: {
			
			System.out.println("Enter Employee Id to Delete: ");
			int id = os.nextInt();
			dao.deleteEmployeeById(id);
			break;
			


		}
		case 6: {
			
			return;

		}
		default:
			System.out.println("Invalid Option Chosen");
			break;
			
		}
		
		employeeController();
		
		
		
		
		
		
		
>>>>>>> f46a9d1 (second commit)
	}

}
