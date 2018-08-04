package com.manament.school.entities;

import java.math.BigDecimal;

public class student_score {
	private long student_score_id;
	private long studentId;
	private long subjectId;
	private BigDecimal firstScore;
	private BigDecimal secondScore;
	private BigDecimal threeScore;
	private BigDecimal finalTestScore;
	private BigDecimal averageScore;
	public long getStudent_score_id() {
		return student_score_id;
	}
	public void setStudent_score_id(long student_score_id) {
		this.student_score_id = student_score_id;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public BigDecimal getFirstScore() {
		return firstScore;
	}
	public void setFirstScore(BigDecimal firstScore) {
		this.firstScore = firstScore;
	}
	public BigDecimal getSecondScore() {
		return secondScore;
	}
	public void setSecondScore(BigDecimal secondScore) {
		this.secondScore = secondScore;
	}
	public BigDecimal getThreeScore() {
		return threeScore;
	}
	public void setThreeScore(BigDecimal threeScore) {
		this.threeScore = threeScore;
	}
	public BigDecimal getFinalTestScore() {
		return finalTestScore;
	}
	public void setFinalTestScore(BigDecimal finalTestScore) {
		this.finalTestScore = finalTestScore;
	}
	public BigDecimal getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(BigDecimal averageScore) {
		this.averageScore = averageScore;
	}
	
	
	
}
