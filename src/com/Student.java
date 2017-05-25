package com;
public class Student implements Cloneable {

	private String stuName;
	
	public String getStuName() {
		return stuName;
	}

	public Student(String stuName) {
		this.stuName = stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = new Student(stuName);
		return student;
	}
}
