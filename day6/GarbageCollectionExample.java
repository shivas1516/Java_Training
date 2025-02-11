package com.celcom.day6;

class MyClass{
	static int count = 0;
	MyClass(){
		count++;
		System.out.println(count);
	}
	@Override
	protected void finalize() {
		count--;
		System.out.println(count);
	}
}
public class GarbageCollectionExample {

	public static void main(String[] args) {
		
		MyClass one = new MyClass();
		MyClass two = new MyClass();
		one = null;
		System.gc();
		two = null;
		Runtime.getRuntime().gc();
	}

}