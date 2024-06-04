package com.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	System.out.println("Setting object");
	this.subject = subject;
}

public Subject() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Subject [subject=" + subject + "]";
}

@PostConstruct
public void Start() {
	System.out.println("Starting method:");
}
@PreDestroy
public void End() {
	System.out.println("Ending method:");
}
}
