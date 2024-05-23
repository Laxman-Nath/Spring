package com.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/Constructor_Injection/config.xml");
        Employee emp=(Employee) context.getBean("e");
        emp.show();
    }
}
