package com.Collection_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/Collection_Injection/config.xml");
		Question q=(Question)context.getBean("Q1");
		q.displayInfo();

	}

}
