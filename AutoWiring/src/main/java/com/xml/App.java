package com.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/xml/config.xml");
        Employee emp=context.getBean("emp",Employee.class);
        City c=context.getBean("city",City.class);
        System.out.println(emp.toString());
        c.showCityDetails();
    }
}
