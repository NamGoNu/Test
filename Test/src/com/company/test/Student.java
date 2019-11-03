package com.company.test;

public class Student extends Person{
	private int studentNo;
	private String major;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}
	public Student(int studentNo, String major) {
		super();
		this.studentNo = studentNo;
		this.major = major;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		if(studentNo < 1000) {
			this.studentNo = studentNo;
		}
		else {
			this.studentNo = studentNo/1000;
			
		}
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
