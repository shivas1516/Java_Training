package com.celcom.day5;

public class Rectangle {
	int height;
	int width;
	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	int calculateArea() {
		return height * width;
	}
	int calculatePerimeter() {
		return 2 * (height + width);
	}
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(10, 12);
		System.out.println("The Ares of Rectangle is " + rectangle.calculateArea());
		System.out.println("The Ares of Rectangle is " + rectangle.calculatePerimeter());
	}
}
