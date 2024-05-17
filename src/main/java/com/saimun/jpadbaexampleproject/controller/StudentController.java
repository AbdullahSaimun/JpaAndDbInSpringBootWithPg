package com.saimun.jpadbaexampleproject.controller;

import com.saimun.jpadbaexampleproject.model.Student;
import com.saimun.jpadbaexampleproject.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	private final StudentService studentService;


	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}


	@PostMapping(value = "/save-student",produces = "application/json")
	public Student saveStudent(@RequestBody Student student) {
		Student st = studentService.saveStudent(student);
		return st;
	}
}
