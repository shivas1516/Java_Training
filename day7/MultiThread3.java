package com.celcom.day7;

public class MultiThread3 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("My Thread Running....");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MultiThread3 thread = new MultiThread3();
        thread.setName("My Thread");
        System.out.println(thread.getState()); // Should be NEW state
        System.out.println(thread.getName());
        
        thread.start();
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread");
        }

        try {
            thread.join(); // Wait for thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getState()); // Should be TERMINATED state
    }
}
