package com.celcom.day3;

public class ClassExampleForMobile {
	int imsNo;
	String brand;
	int prize;
	String processor;
	ClassExampleForMobile(int imsNo, String brand, int prize, String processor) {
		this.imsNo = imsNo;
		this.brand = brand;
		this.prize = prize;
		this.processor = processor;
	}
	
	void display() {
		System.out.println("The IMSNO is " + imsNo);
		System.out.println("The Brand is " + brand);
		System.out.println("The Prize is " + prize);
		System.out.println("The Processor is " + processor);
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setImsNo(int imsNo) {
		this.imsNo = imsNo;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public static void main(String args[]) {
		ClassExampleForMobile obj = new ClassExampleForMobile(1235678, "IQOO", 15000, "SnapDragon");
		obj.display();
		obj.setBrand("VIVO");
		obj.display();
	}
}
