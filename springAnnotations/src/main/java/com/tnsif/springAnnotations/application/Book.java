package com.tnsif.springAnnotations.application;

import org.springframework.beans.factory.annotation.Value;

public class Book {
	@Value("110")
	private int bookId;
	@Value("J.K.Rowling")
	private String bookAuthor;
	@Value("Fantastic Beasts")
	private String bookTitle;
	@Value("1200")
	private double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int boodId) {
		this.bookId = boodId;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}