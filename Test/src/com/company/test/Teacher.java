package com.company.test;

public class Teacher extends Person{
	private int teacherNo;
	private String subject;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(int teacherNo, String subject) {
		super();
		this.teacherNo = teacherNo;
		this.subject = subject;
	}
	public int getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(int teacherNo) {
		if(teacherNo>=1000) {
			this.teacherNo = teacherNo;
		}
		else {
			this.teacherNo = teacherNo+1000;
		}
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
