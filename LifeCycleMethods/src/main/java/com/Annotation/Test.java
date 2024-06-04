package com.Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/Annotation/config.xml");
		Subject s=(Subject) context.getBean("s1");
		System.out.println(s);
         context.registerShutdownHook();
	}

}
