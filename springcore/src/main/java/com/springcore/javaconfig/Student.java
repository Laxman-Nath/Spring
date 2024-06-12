package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
	private Book book;
public Student(Book book) {
		super();
		this.book = book;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
public void Study() {
	book.showName();
	System.out.println("I'm studying...........");
}
}

