package com.library;

public class LibraryOperations {

	public void availableBooks() {
		for(int i=0;i<Book.book.length;i++)
		{
			Book b = Book.book[i];
			if(b != null && !b.issuedStatus) {
				b.displayDetails();
			}
		}
	}

	public void issueBook(Book book) {
		System.out.println("Issude Book is: ");
		book.displayDetails();
		
		for(Book books : Book.book)
		{
			if(books != null && books.equals(book))
				book.issuedStatus = true;
		}
	}
	
	public void returnBook(Book book)
	{
		System.out.println("Returned Book is: ");
		book.displayDetails();
		for(Book books : Book.book)
		{
			if(books != null && books.equals(book))
				book.issuedStatus = false;
		}
	}
}
