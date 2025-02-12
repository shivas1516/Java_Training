package com.celcom.SaturdayAssingment1;

public class Employee {
	String name, job;
	int basic;
	char grade;
	int grossSalary;
	Employee(String name, String job, int basic, char grade) {
		this.name = name;
		this.job = job;
		this.basic = basic;
		this.grade = grade;
	}
	void computeSalary()
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
							
		grossSalary = (int) gross;
	}
	void display() {
		System.out.println("The Name is " + name);
		System.out.println("The Job is " + job);
		System.out.println("The Salary is " + grossSalary);
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Sunder", "Junior Consultant", 10000, 'A');
		emp.computeSalary();
		emp.display();
	}

}
