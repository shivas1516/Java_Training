package com.celcom.day4;

public class MethodOverLoadingExample3 {
	
	static void concat(String a, String b) {
		System.out.println("Concatination of Two Strings " + (a + b));
	}

	static void concat(int a, int b) {
		System.out.println("Concatination of Two Integer " + a + b);
	}
	
	static void concat(double a, double b) {
		System.out.println("Concatination of Two Double is " + a + b);
	}
	public static void main(String[] args) {
		MethodOverLoadingExample3.concat(10,20);
		MethodOverLoadingExample3.concat("Ranjith", "Mohan");
		MethodOverLoadingExample3.concat(10.09, 98.78766);
	}

}
