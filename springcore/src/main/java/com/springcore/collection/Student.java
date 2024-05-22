package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.Properties;



public class Student {
   private String name;
   
   private List<String> books;
   private Set<String> phones;
   private Properties props;
   public Student(String name, List<String> books, Set<String> phones, Properties props, Map<String, String> courses) {
	super();
	this.name = name;
	this.books = books;
	this.phones = phones;
	this.props = props;
	this.courses = courses;
}

public Properties getProps() {
	return props;
}

public void setProps(Properties props) {
	this.props = props;
}


   public Student() {
	super();
	// TODO Auto-generated constructor stub
}

private Map<String,String> courses;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getBooks() {
	return books;
}
public void setBooks(List<String> books) {
	this.books = books;
}
public Set<String> getPhones() {
	return phones;
}
public void setPhones(Set<String> phones) {
	this.phones = phones;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
}
