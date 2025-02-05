package com.celcom.day1;
import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {
        Scanner ref_var = new Scanner(System.in);
        
        System.out.print("Enter number1: ");
        int num1 = ref_var.nextInt();
        
        System.out.print("Enter number2: ");
        int num2 = ref_var.nextInt();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = ref_var.next().charAt(0);
        
        int result = 0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        
        System.out.println("The result is: " + result);
    }
}