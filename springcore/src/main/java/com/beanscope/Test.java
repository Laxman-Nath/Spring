package com.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context=new ClassPathXmlApplicationContext("com/beanscope/config.xml");
       Student st1=context.getBean("St",Student.class);
       Student st2=context.getBean("St",Student.class);
       System.out.println(st1);
       System.out.println(st2);
       System.out.println(st1.hashCode());
       System.out.println(st2.hashCode());
       
       Teacher t1=context.getBean("teacher",Teacher.class);
       Teacher t2=context.getBean("teacher",Teacher.class);
       System.out.println(t1);
       System.out.println(t2);
       System.out.println(t1.hashCode());
       System.out.println(t2.hashCode());
	}

}
