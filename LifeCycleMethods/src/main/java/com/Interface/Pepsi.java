package com.Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
private double price;

public double getPrice() {
	return price;
}

public Pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

public void setPrice(double price) {
	System.out.println("Setting price");
	this.price = price;
}

@Override
public String toString() {
	return "Pepsi [price=" + price + "]";
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Destroying");
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Initializing");
	
}
}
