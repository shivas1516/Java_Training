package com.celcom.day4;

public class JavaBlocks {
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");
	}
	public String toString() {
		return "to String";
	}
	public static void main(String args[]) {
		System.out.println("Main Method Block");
		JavaBlocks obj = new JavaBlocks();
		System.out.println(obj);
	}
}
