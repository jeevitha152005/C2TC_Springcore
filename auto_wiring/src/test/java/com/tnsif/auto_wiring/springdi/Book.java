package com.tnsif.auto_wiring.springdi;

public class Book {
 	private String title;
    private String author;
    private int bid;
    
    private Department department;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	public Book(Department department)
    {
    	this.department=department;
    }
    // Constructor that allows dependency injection for the title and author of the book
    public Book(String title, String author, int bid) {
        this.title = title;  // Sets the book's title
        this.author = author;  // Sets the book's author
        this.bid=bid;
    }
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bid=" + bid + "]";
	}

	public void displayDepartment() {
	    if (department != null) {
	        System.out.println("Department Name: " + department.getDepartmentName());
	    } else {
	        System.out.println("No department assigned.");
	    }}

}