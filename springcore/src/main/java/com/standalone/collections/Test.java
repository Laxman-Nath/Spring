package com.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/standalone/collections/config.xml");
         Person p=context.getBean("per",Person.class);
         System.out.println(p);
         System.out.println(p.getFriends().getClass().getName());
         System.out.println(p.getFeeStructure().getClass().getName());
         System.out.println(p.getProperties().getClass().getName());
	}

}
