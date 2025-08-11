package com.library;

public class Book {
	int bookid;
	String title;
	String author;
	boolean issuedStatus;
	int count = 0;
	static Book[] book = new Book[5];

	public Book(int bookid, String title, String author, boolean issuedStatus) {
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.issuedStatus = issuedStatus;
		book[count++] = this;
	}

	public void displayDetails() {
		System.out.println("Book Details");
		System.out.println("Book Id: "+this.bookid);
		System.out.println("Book Title:"+this.title);
		System.out.println("Book Author: "+ this.author);
		System.out.println("Book issued status: "+ this.issuedStatus);
	}

}
