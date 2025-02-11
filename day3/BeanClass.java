package com.celcom.day3;

public class BeanClass {
	private int eid;
	private String name;
	private int esalary;
	
	public BeanClass() {
	}

	public BeanClass(int eid, String name, int esalary) {
		this.eid = eid;
		this.name = name;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public static void main(String args[]) {
		BeanClass emp = new BeanClass(96, "Ranjith", 15000);
		System.out.println("The Name is " + emp.getName());
		System.out.println("The id is " + emp.getEid());
		System.out.println("The Salary is " + emp.getEsalary());
		emp.setEsalary(50000);
		System.out.println("The Updated Salary is " + emp.getEsalary());
	}
}
