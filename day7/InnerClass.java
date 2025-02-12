package com.celcom.day7;

//Inner Class
public class InnerClass {
	
	// 1. Non-Static Inner Class
	class InnerClass1{
		void myMethod1() {
			System.out.println("Non-Static Inner class");
		}
	}
	
	// 2.Static Inner Class
	class InnerClass2{
		void myMethod1() {
			System.out.println("Static Inner Class");
		}
	}
	
	// 3. Local Inner Class
	void myMethod() {
		class InnerClass3{
			void myMethodInner() {
				System.out.println("Local Inner Class");
			}
		}
	}
	
	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		
	}
}
