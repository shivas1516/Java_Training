package com.celcom.day2;

public class InstanceAndStatic {
	
	static int a = 10; //Static Variable
	int b = 20; //Instance Variable
	
	//Instance method
	void InsMethod() {
		System.out.println("Instance Method");
	}
	
	//Static method
	static void StatMethod() {
		System.out.println("Static Method");
	}
	
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
		
		//Changed Static Variable
		System.out.println("Changed Static Variable");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		//Changed Instance Variable
		System.out.println("Changed Instance Variable");
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		//Static Method Accessing
		InstanceAndStatic.StatMethod();
		
		//Instance Method Accessing
		InstanceAndStatic objInst = new InstanceAndStatic();
		objInst.InsMethod();
	}
}
