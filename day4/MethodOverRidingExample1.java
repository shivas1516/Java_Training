package com.celcom.day4;

class SuperClass {
	
	void display() {
		System.out.println("Iam from Super Class");
	}
	
}

class SubClass extends SuperClass {
	
	void display() {
		System.out.println("Iam from Sub Class");
	}
	
}

public class MethodOverRidingExample1 {
	
	public static void main(String args[]) {
		SubClass obj = new SubClass();
		obj.display();
		SuperClass obj1 = new SuperClass();
		obj1.display();
	}
	
}
