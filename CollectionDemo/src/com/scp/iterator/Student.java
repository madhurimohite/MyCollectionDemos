package com.scp.iterator;

public class Student {

	int studId;
	public Student(int studId, String name) {
		super();
		this.studId = studId;
		this.name = name;
	}
	String name;
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + "]";
	}
	
}
