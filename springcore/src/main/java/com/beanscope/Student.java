package com.beanscope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("St")
//@Scope("singleton")
@Scope("prototype")
public class Student {
	@Value("Laxman")
private String Name;
	@Value("Mahendranagar")
private String City;
	@Value("#{list}")
private List<String> Address;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public List<String> getAddress() {
	return Address;
}
public void setAddress(List<String> address) {
	Address = address;
}
@Override
public String toString() {
	return "Student [Name=" + Name + ", City=" + City + ", Address=" + Address + "]";
}
}
