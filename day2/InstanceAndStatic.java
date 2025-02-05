package com.celcom.day2;

public class InstanceAndStatic {
	
	static int a = 10;
	int b = 20;
	
	public static void main(String args[]) {
		
		InstanceAndStatic obj1 = new InstanceAndStatic();
		InstanceAndStatic obj2 = new InstanceAndStatic();
		
		//Static Variable
		System.out.println("Unchanged Static Variable");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		//Instance Variable
		System.out.println("Unchanged Instance Variable");
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		obj1.a = 50;
		obj1.b = 100;
		
		//Static Variable
		System.out.println("Changed Static Variable");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		//Instance Variable
		System.out.println("Changed Instance Variable");
		System.out.println(obj1.b);
		System.out.println(obj2.b);
	}
}
