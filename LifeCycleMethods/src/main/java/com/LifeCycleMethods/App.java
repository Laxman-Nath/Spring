package com.LifeCycleMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/LifeCycleMethods/config.xml");
        Samosa s=(Samosa) context.getBean("s1");
        System.out.println(s);
        context.registerShutdownHook();
    }
}
