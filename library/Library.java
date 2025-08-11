package com.library;

public class Library {

	public static void main(String[] args) {
		
		LibraryOperations libraryOperations = new LibraryOperations();
		
		Book book1 = new Book(1, "Java", "James Gosling", false);
		Book book2 = new Book(2, "Python", "Guido van Rossum", false);
		Book book3 = new Book(3, "C", "Padma Reddy", false);
		Book book4 = new Book(4, "C++", "Padma Reddy", false);
		Book book5 = new Book(5, "DSA", "M K Prasad", false);
		
		libraryOperations.availableBooks();
		libraryOperations.issueBook(book5);
		libraryOperations.returnBook(book5);
	}

}
