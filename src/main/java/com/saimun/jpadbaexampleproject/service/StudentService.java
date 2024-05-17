package com.saimun.jpadbaexampleproject.service;

import com.saimun.jpadbaexampleproject.model.Student;
import com.saimun.jpadbaexampleproject.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}


	public Student saveStudent(Student student) {
		Student st = studentRepository.save(student);
		return st;
	}
}
