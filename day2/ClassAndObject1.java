package com.celcom.day2;
import java.util.Scanner;

class Employee{
	
	//Variable declaration
	int emp_id;
	String emp_name;
	double emp_salary;
	
	//Constructor (constructor name must be the class)
	Employee(int emp_id, String emp_name, double emp_salary){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}
	
	//Display method
	void show() {
		System.out.println("Employee Id: " + emp_id);
		System.out.println("Employee Name: " + emp_name);
		System.out.println("Employee Salary: " + emp_salary);
	}
}

public class ClassAndObject1 {
	public static void main(String[] args) {
		// Creating object for scanner class
		Scanner scan = new Scanner(System.in);
		
		//User Inputs
		System.out.println("Enter Your Id: ");
		int UserId = scan.nextInt();
		
		System.out.println("Enter Your Name: ");
		String UserName = scan.nextLine();
		
		System.out.println("Enter Your Salary: ");
		double UserSalary = scan.nextDouble();
		
		// 1st Object
		Employee obj = new Employee(UserId, UserName, UserSalary);
		obj.show();
	}

}
