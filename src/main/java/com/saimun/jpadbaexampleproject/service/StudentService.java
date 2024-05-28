package com.saimun.jpadbaexampleproject.service;

import com.saimun.jpadbaexampleproject.model.Student;
import com.saimun.jpadbaexampleproject.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

	public List<Student> findAllStudentByName(String name) {
		return studentRepository.findAllByFirstNameContainingIgnoreCase(name);
	}

	public List<Student> findAllStudentByAgeAfter(int age) {
		return studentRepository.findAllByAgeAfter(age);
	}

	public List<Student> findAllByAgeAfterAndAgeBefore(int after, int before) {
		return studentRepository.findAllByAgeAfterAndAgeBefore(after,before);
	}

	public void  saveStudentList(List<Student> students) {
		studentRepository.saveAll(students);
		System.out.println("saved successfully list");
	}

	public Optional<Student> findByLastNameEqualsIgnoreCase(String lastName) {
		return studentRepository.findByLastNameEqualsIgnoreCase(lastName);
	}
}
