package com.celcom.day7;

public class MultiThread4 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " Thread Running....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		MultiThread4 thread1 = new MultiThread4();
		thread1.setName("T1");
		
		MultiThread4 thread2 = new MultiThread4();
		thread2.setName("T2");
				
		MultiThread4 thread3 = new MultiThread4();
		thread3.setName("T3");
		
		thread2.start();
		thread3.start();
		System.out.println("Main Thread");
		thread1.start();
	}
}
