package com.celcom.day4;

public class ConstructorOverLoadingExample {
	ConstructorOverLoadingExample(String a, String b) {
		this(10, 20);
		System.out.println("Concatination of Two Strings is " + (a + b));
	}

	ConstructorOverLoadingExample(int a, int b) {
		this(10.082798, 90.918727);
		System.out.println("Concatination of Two Integer is " + a + b);
	}
	
	ConstructorOverLoadingExample(double a, double b) {
		System.out.println("Concatination of Two Double is " + a + b);
	}
	public static void main(String[] args) {
		ConstructorOverLoadingExample obj = new ConstructorOverLoadingExample("Ranjith", "Mohan");
//		obj = new ConstructorOverLoadingExample(10, 20);
//		obj = new ConstructorOverLoadingExample(10.02793, 198.9188);
	}

}
