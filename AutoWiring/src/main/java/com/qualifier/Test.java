package com.qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/qualifier/config.xml");
		Human h=context.getBean("human",Human.class);
        h.startPumping();
        h.showBeat();
	}

}
