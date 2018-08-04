package com.manament.school.entities;

public class Student extends Persion{
	private String parentPhoneNumber;
	private String motherPhoneNumber;
	private long classId;
	
	
	public Student() {
		super();
	}


	public String getParentPhoneNumber() {
		return parentPhoneNumber;
	}


	public void setParentPhoneNumber(String parentPhoneNumber) {
		this.parentPhoneNumber = parentPhoneNumber;
	}


	public String getMotherPhoneNumber() {
		return motherPhoneNumber;
	}


	public void setMotherPhoneNumber(String motherPhoneNumber) {
		this.motherPhoneNumber = motherPhoneNumber;
	}


	public long getClassId() {
		return classId;
	}


	public void setClassId(long classId) {
		this.classId = classId;
	}
	
}
