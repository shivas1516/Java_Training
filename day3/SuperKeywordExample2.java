package com.celcom.day3;

class A {
	A() {
		System.out.println("1");
	}
	A(int a) {
		this();
		System.out.println("A 1");
	}
}

class B extends A{
	B() {
		this(10);
		System.out.println("2");
	}
	B(int a) {
		super(20);
		System.out.println("B 1");
	}
}
public class SuperKeywordExample2 {
	public static void main(String args[]) {
		B obj = new B();
	}
}
