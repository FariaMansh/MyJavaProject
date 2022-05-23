package com.AOPspringBoot.AOPspringBootDemo.Service;


import org.springframework.stereotype.Service;

import com.AOPspringBoot.AOPspringBootDemo.Entity.StudentEntity;

@Service
public class StudentService {
	
	
	
	
	public void createStudent(int data) {
		StudentEntity studentEntity = new StudentEntity();
		System.out.println("Student Created!");
		studentEntity.setStudentId(1);
		studentEntity.setStudentName("Faria");
		studentEntity.setStudentSubject("English");
	}
	
	public boolean deleteStudent(String empId) {
		System.out.println("Delete Student Record");
		return true;
	
	}

}
