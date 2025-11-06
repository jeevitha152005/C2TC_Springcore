package com.tnsif.auto_wiring.springdi;

import java.util.List;

public class Library {
	private List<Book> books;
	
	public Library(List<Book> books) {
        this.books = books;
    }
	
	 public void displayBooks() {
	        System.out.println("Books in the Library:");
	        // Iterate through the list of books and print each book's details
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
}