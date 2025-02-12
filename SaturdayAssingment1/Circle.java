package com.celcom.SaturdayAssingment1;

public class Circle {
	double radius;
	Circle(double radius) {
		this.radius = radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	double getRadius() {
		return radius;
	}
	void calculateArea() {
		System.out.println("The Area is " + 3.14 * radius * radius);
	}
	void calculateCircumferaence() {
		System.out.println("The Circumference is " + 2 * 3.14 * radius);
	}
	public static void main(String args[]) {
		Circle circle = new Circle(3.187);
		circle.calculateArea();
		circle.calculateCircumferaence();
		circle.setRadius(4.89);
		System.out.println("The New Radius is " + circle.getRadius());
		circle.calculateArea();
		circle.calculateCircumferaence();
		
	}
}
