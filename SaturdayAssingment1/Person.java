package com.celcom.SaturdayAssingment1;
import java.util.Scanner;
public class Person {
	
	int age;
	String name;
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	void display() {
		System.out.println("The Name is " + name);
		System.out.println("The Age is " + age);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name and Age : ");
		int age = sc.nextInt();
		String name = sc.next();
		sc.close();
		Person person
		= new Person(age, name);
		person.display();
	}
	
}
