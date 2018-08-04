package com.manament.school.entities;

public class Subject {
	private long subjectId;
	private String nameSubject;
	private int numberTest;
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public String getNameSubject() {
		return nameSubject;
	}
	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}
	public int getNumberTest() {
		return numberTest;
	}
	public void setNumberTest(int numberTest) {
		this.numberTest = numberTest;
	}
	
}
