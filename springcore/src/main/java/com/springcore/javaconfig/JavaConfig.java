package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class JavaConfig {
	@Bean
	public Book getBook() {
		return new Book();
	}
	@Bean(name={"student","temp"})
 public Student getStudent() {
//	 return new Student(getBook());
	Student st=new Student();
	st.setBook(getBook());
	return st;
 }
 }

