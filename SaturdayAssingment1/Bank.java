package com.celcom.SaturdayAssingment1;
import java.util.ArrayList;
import java.util.Scanner;

class Account {
	String accNumber;
	double balance;
	Account(String accNumber, double balance) {
		this.accNumber = accNumber;
		this.balance = balance;
	}
}

public class Bank {
	
	static ArrayList<Account> collection = new ArrayList<>();
	static void addAccount(Account acc) {
        collection.add(acc);
    }

    static void removeAccount(String accNumber) {
        collection.removeIf(acc -> acc.accNumber.equals(accNumber));
    }
    static void displayAccounts() {
    	int flag = 0;
        for (Account acc : collection) {
        	flag = 1;
            System.out.println("The Account Number : " + acc.accNumber + " Balance : " + acc.balance);
        }
        if(flag == 0) {
        	System.out.println("No More Accounts in the Bank!!");
        }
    }
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		do {
			System.out.println("Enter 1 ------> Add Account");
            System.out.println("Enter 2 ------> Remove Account");
            System.out.println("Enter 3 ------> Display Accounts");
            System.out.println("Enter 4 ------> Deposit");
            System.out.println("Enter 5 ------> Withdraw");
            System.out.println("Enter 6 ------> Show Balance");
            System.out.println("Enter 7 ------> Exit");
            int choice = sc.nextInt();
            switch(choice) {
            case 1:
            	System.out.println("Enter the Account Number and Initial Deposit");
            	String accNo = sc.next();
            	int balance = sc.nextInt();
            	addAccount(new Account(accNo, balance));
            	System.out.println("Account Added!!");
            	break;
            case 2:
            	System.out.println("Enter the Account Number");
            	accNo = sc.next();
            	removeAccount(accNo);
            	System.out.println("Account Removed");
            	break;
            case 3:
            	displayAccounts();
            	break;
            case 4:
            	System.out.println("Enter the Account Number");
            	accNo = sc.next();
            	System.out.println("Enter the Deposit Amount");
            	double deposit = sc.nextDouble();
            	for (Account acc : collection) {
                    if(acc.accNumber.equals(accNo)) {
                    	acc.balance += deposit;
                    	System.out.println("New Balance is " + acc.balance);
                    	break;
                    }
                }
            	break;
            case 5:
            	System.out.println("Enter the Account Number");
            	accNo = sc.next();
            	System.out.println("Enter the Withdraw Amount");
            	double withdraw = sc.nextDouble();
            	for (Account acc : collection) {
                    if(acc.accNumber.equals(accNo)) {
                    	if(acc.balance < withdraw) {
                    		System.out.println("Insufficient Cash");
                    	}
                    	else acc.balance -= withdraw;
                    	break;
                    }
                }
            	break;
            case 6:
            	System.out.println("Enter the Account Number to show balance");
            	accNo = sc.next();
            	for (Account acc : collection) {
                    if(acc.accNumber.equals(accNo)) {
                    	System.out.println("The Balance for the Accout No is " + acc.balance);
                    }
            	}
            	break;
            case 7:
            	System.out.println("Terminated!!");
            	flag = 1;
            	break;
            default:
            	System.out.println("Enter Valid Choice");
            	break;
            }
		}while(flag == 0);
	sc.close();
	}
	
}
