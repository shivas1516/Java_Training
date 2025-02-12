package com.celcom.day7;


public class Exercise {
    public static void main(String[] args) {
        System.out.println(demoMethod());
    }

    public static String demoMethod() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch block executed.");
            return "Returning from catch block.";
        } finally {
            System.out.println("Finally block executed.");
        }
        return "Method completed.";
    }
}
