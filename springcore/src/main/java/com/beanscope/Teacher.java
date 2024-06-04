package com.beanscope;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {
	@Value("Yagyaraj pandey")
private String Name;

@Override
public String toString() {
	return "Teacher [Name=" + Name + "]";
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}
}
