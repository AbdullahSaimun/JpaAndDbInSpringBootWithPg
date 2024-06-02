package com.saimun.jpadbaexampleproject.service;

import com.saimun.jpadbaexampleproject.model.School;
import com.saimun.jpadbaexampleproject.model.Student;
import com.saimun.jpadbaexampleproject.model.StudentProfile;
import com.saimun.jpadbaexampleproject.repository.SchoolRepository;
import com.saimun.jpadbaexampleproject.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class StudentSchoolDataLoader implements CommandLineRunner {

	private final SchoolRepository schoolRepository;

	private final StudentRepository studentRepository;

	public StudentSchoolDataLoader(SchoolRepository schoolRepository, StudentRepository studentRepository) {
		this.schoolRepository = schoolRepository;
		this.studentRepository = studentRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		School sc = new School("Baitush Sharaf");
		Student student1 = new Student("abdulla","saimun","sadf@email.com",23);
		Student student2 = new Student("ad","kh","eee@email.com",23);
		Student student3 = new Student("ee","aaa","aaa@email.com",23);
		student1.setSchool(sc);
		student2.setSchool(sc);
		student3.setSchool(sc);
		sc.setStudents(Arrays.asList(student1,student2,student3));
		StudentProfile profile = new StudentProfile("this bio for studsent 1");
		profile.setStudent(student1);
		student1.setStudentProfile(profile);

		student2.setStudentProfile(profile);

		var schoolEntity = schoolRepository.save(sc);

		var students = schoolEntity.getStudents();
		System.out.println(students);
		System.out.println("---------------a----------a----");
		var stuentOneSavedEntity = studentRepository.saveAndFlush(student1);
		System.out.println(stuentOneSavedEntity);
		System.out.println("--------d-----------------d-----------");

	}
}
