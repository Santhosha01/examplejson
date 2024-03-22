package com.librarymanagement.customer;

import java.util.List;

import com.librarymanagement.books.Book;

public class Customer {
  String Name;
  long CustomerId;
  List<Book> books;

public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getCustomerId() {
	return CustomerId;
}
public void setCustomerId(long customerId) {
	CustomerId = customerId;
}
@Override
public String toString() {
	return "Customer [Name=" + Name + ", CustomerId=" + CustomerId + ", books=" + books + "]";
}
  
}
