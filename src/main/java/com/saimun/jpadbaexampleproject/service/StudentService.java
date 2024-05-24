package com.saimun.jpadbaexampleproject.service;

import com.saimun.jpadbaexampleproject.model.Student;
import com.saimun.jpadbaexampleproject.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}


	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
}
