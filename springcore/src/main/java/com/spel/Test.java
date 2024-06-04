package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spel/config.xml");
		Demo d=context.getBean("demo",Demo.class);
		System.out.println(d);
        
		SpelExpressionParser parser=new SpelExpressionParser();
		Expression exp=parser.parseExpression("2*10");
		System.out.println(exp.getValue());
	}

}
