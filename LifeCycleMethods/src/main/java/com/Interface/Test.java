package com.Interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/Interface/config.xml");
		Pepsi p=(Pepsi) context.getBean("p1");
		System.out.println(p);
		context.registerShutdownHook();

	}

}
