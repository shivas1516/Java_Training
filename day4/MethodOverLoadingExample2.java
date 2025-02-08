package com.celcom.day4;

public class MethodOverLoadingExample2 {
	
	void addition(int a, int b) {
		System.out.println("The Addition of Two Integer is " + (a + b));
	}
	
	void addition(double a, double b) {
		System.out.println("The Addition of Two Double is " + (a + b));
	}
	
	void addition(long a, long b) {
		System.out.println("The Addition of Two Long is " + (a + b));
	}
	
	public static void main(String[] args) {
		MethodOverLoadingExample2 obj = new  MethodOverLoadingExample2();
		obj.addition(10, 10);
		obj.addition(87.93873, 4.98793873);
		obj.addition(290369049737L, 19726578449L);
		
	}
}
