package com.AOPspringBoot.AOPspringBootDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AOPspringBoot.AOPspringBootDemo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/getStudent")
	public void getStudent() {
		studentService.createStudent(7);	
	}
	
	@GetMapping("/deleteStudent")
	public void delStudent() {
		studentService.deleteStudent("Faria");	
	}
	
	

}
