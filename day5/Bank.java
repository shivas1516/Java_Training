package com.celcom.day5;
import java.util.ArrayList;

class Account {
	String accNumber;
	double balance;
	Account(String accNumber, double balance) {
		this.accNumber = accNumber;
		this.balance = balance;
	}
	void deposit(double amount) {
		balance += amount;
	}
	void withdraw(double amount) {
		if(amount > balance) System.out.println("Insufficient Balance");
		else {
			balance -= amount;
		}
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
        for (Account acc : collection) {
            System.out.println("The Account Number : " + acc.accNumber + " Balance : " + acc.balance);
        }
    }
	public static void main(String args[]) {
		Bank bank = new Bank();
		Account acc1 = new Account("9043365654", 6000);
		Account acc2 = new Account("9043376764", 8000);
		addAccount(acc1);
		addAccount(acc2);
		displayAccounts();
		System.out.println("After Processes");
		acc1.deposit(1000.90);
		acc1.withdraw(300);
		acc2.deposit(2000.90);
		acc2.withdraw(400);
		displayAccounts();
		System.out.println("After Removing :");
		removeAccount("9043365654");
		displayAccounts();
		
	}
	
}
