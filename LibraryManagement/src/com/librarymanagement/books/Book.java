package com.librarymanagement.books;

public class Book {
   String Name;
   long BookId;
   
   public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getBookId() {
	return BookId;
}
public void setBookId(long bookId) {
	BookId = bookId;
}
@Override
public String toString() {
	return "Book [Name=" + Name + ", BookId=" + BookId + "]";
}

   
}
