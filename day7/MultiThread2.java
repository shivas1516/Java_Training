package com.celcom.day7;

public class MultiThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("My Thread Running....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MultiThread2 var = new MultiThread2();

		System.out.println(var.getState());
		System.out.println(var.getName());
		var.run();
		var.setName("My Thread");
		System.out.println(var.getState());
		System.out.println(var.getName());
	}

}
