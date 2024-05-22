package com.springcore;

public class Student {
  public int getStudentId() {
		return studentId;
	}
	public Student() {
	super();
	// TODO Auto-generated constructor stub
}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public Student(int studentId, String studentName, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
}
	public void setStudentId(int studentId) {
		System.out.println("Setting student id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting student Name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting student address");
		this.studentAddress = studentAddress;
	}
private int studentId;
  private String studentName;
  private String studentAddress;
}
