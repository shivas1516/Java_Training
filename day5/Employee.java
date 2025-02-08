package com.celcom.day5;

public class Employee {
	String name, job;
	Employee(String name, String job) {
		this.name = name;
		this.job = job;
	}
	static int computeSalary(int basic, char grade)
	{
		double allowance;
		double hra, da, pf;
		hra = 0.2 * basic;
		da = 0.5 * basic;
		pf = 0.11 * basic;
		if (grade == 'A') 
		{
			allowance = 1700.0;
		}
		else if (grade == 'B')
		{
			allowance = 1500.0;
		}
		else
		{
			allowance = 1300.0;
		}
		double gross = Math.round(basic + hra + da + allowance - pf);
							
		return (int)gross;
	}
	void display() {
		System.out.println("The Name is " + name);
		System.out.println("The Job is " + job);
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Sunder", "Junior Consultant");
		emp.display();
		System.out.println("The Salary is " + Employee.computeSalary(10000, 'A'));
	}

}
