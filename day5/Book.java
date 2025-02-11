package com.celcom.day5;
import java.util.ArrayList;

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
        Book b1 = new Book("Java Basics", "John Doe", "12345");
        Book b2 = new Book("Data Structures", "Jane Doe", "67890");

        addBook(b1);
        addBook(b2);
        displayBooks();
        
        System.out.println("After removing:");
        removeBook("12345");
        displayBooks();
    }
}