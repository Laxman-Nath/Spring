package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
@Value("#{2+3+4}")
private int x;
@Value("#{2+4}")
private int y;
@Value("#{T(java.lang.Math).sqrt(25)}")
private double z;
@Value("#{T(java.lang.Math).E}")
private double E;
@Value("#{T(java.lang.Math).PI}")
private double P;
@Value("#{new java.lang.String('laxman nath')}")
private String name;
@Value("#{4>2}")
private boolean isStudent;
public boolean isStudent() {
	return isStudent;
}
public void setStudent(boolean isStudent) {
	this.isStudent = isStudent;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getE() {
	return E;
}
public void setE(double e) {
	E = e;
}
public double getZ() {
	return z;
}
public void setZ(double z) {
	this.z = z;
}

public double getP() {
	return P;
}
public void setP(double p) {
	P = p;
}


@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", P=" + P + ", name=" + name + ", isStudent="
			+ isStudent + "]";
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
}
