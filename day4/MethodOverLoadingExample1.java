package com.celcom.day4;

public class MethodOverLoadingExample1 {
	
	public static void display(int a) {
		int res = 1;
		for(int i = 1; i <= a; i++) res *= i;
		System.out.println("The Factorial is " + res);
	}
	
	public static void display(int a, int b) {
		System.out.println("The Sum is " + (a + b));
	}
	
	public static void display(String name) {
		System.out.println("Greetings Mr/Ms : " + name);
	}
	
	public static void main(String[] args) {
		MethodOverLoadingExample1.display(10);
		MethodOverLoadingExample1.display(1,17);
		MethodOverLoadingExample1.display("Ranjith");
	}

}
