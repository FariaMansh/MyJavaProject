package com.AOPspringBoot.AOPspringBootDemo.Entity;


public class StudentEntity {
	
	private int studentId;
	private String studentName;
	private String studentSubject;
	
	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentSubject="
				+ studentSubject + "]";
	}
	public StudentEntity() {
		super();
	}
	public StudentEntity(int studentId, String studentName, String studentSubject) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSubject = studentSubject;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSubject() {
		return studentSubject;
	}
	public void setStudentSubject(String studentSubject) {
		this.studentSubject = studentSubject;
	}
	

}
