package com.celcom.SaturdayAssingment1;
import java.util.ArrayList;
import java.util.Scanner;
class Book {
    String title, author, ISBN;
    static ArrayList<Book> collection = new ArrayList<>();

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    static void addBook(Book book) {
        collection.add(book);
    }

    static void removeBook(String ISBN) {
        collection.removeIf(book -> book.ISBN.equals(ISBN));
    }

    static void displayBooks() {
        for (Book b : collection) {
            System.out.println(b.title + " by " + b.author + " ISBN: " + b.ISBN);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int flag = 0;
        do {
            System.out.println("Enter 1 ------> Add Book");
            System.out.println("Enter 2 ------> Remove Book");
            System.out.println("Enter 3 ------> Display Books");
            System.out.println("Enter 4 ------> Exit");
        	int choice = sc.nextInt();
            switch(choice) {
            case 1:
            	System.out.println("Enter Title, Author, ISBN");
            	String title = sc.next();
            	String author = sc.next();
            	String ISBN = sc.next();
            	addBook(new Book(title, author, ISBN));
            	System.out.println("Book Added!!");
            	break;
            case 2:
            	System.out.println("ISBN");
            	ISBN = sc.next();
            	removeBook(ISBN);
            	System.out.println("Book Removed!!");
            	break;
            case 3:
            	displayBooks();
            	break;
            case 4:
            	System.out.println("Terminated!!");
            	flag = 1;
            	break;
            default:
            	System.out.println("Enter Valid Choice!!");
            	break;
            }
        }while(flag == 0);
        sc.close();
    }
}