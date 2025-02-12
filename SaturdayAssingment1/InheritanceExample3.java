package com.celcom.SaturdayAssingment1;
class Shape {
	void calculateArea(int length, int breadth) {
		
	}
}
class Rectangle1 extends Shape{
	void calculateArea(int length, int breadth) {
		System.out.println("The Area of Rectangle is " + (length * breadth));
	}
}
public class InheritanceExample3{
	public static void main(String args[]) {
		Shape rec = new Rectangle1();
		rec.calculateArea(12, 10);
	}
}
