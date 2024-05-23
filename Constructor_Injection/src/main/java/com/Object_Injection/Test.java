package com.Object_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Object_Injection/config.xml");
		Employee emp=(Employee) context.getBean("emp1");
		emp.show();

	}

}
