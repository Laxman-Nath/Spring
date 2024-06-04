package com.ambuigity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ambuigity/config.xml");
		Addition a=(Addition)context.getBean("add");
		a.doSum();

	}

}
