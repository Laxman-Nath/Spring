package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/config.xml");
	 Student st=(Student) context.getBean("student1");
	 System.out.println(st.getName());
	 System.out.println(st.getBooks());
	 System.out.println(st.getPhones());
	 System.out.println(st.getCourses());
     System.out.println(st.getProps());
	}

}
