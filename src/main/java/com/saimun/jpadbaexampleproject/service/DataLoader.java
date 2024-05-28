package com.saimun.jpadbaexampleproject.service;

import com.saimun.jpadbaexampleproject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("abdulla","saimun","saimun@gmail.com", 25);
		Student student2 = new Student("ashrafur","hammat","hammat@gmail.com", 18);
		Student student3 = new Student("anisu","habib","habib@gmail.com", 12);
		Student student4 = new Student("abdulla","khan","khan@gmail.com", 9);
		studentService.saveStudentList(Arrays.asList(student1,student2,student3,student4));

		List<Student> studentList = studentService.getAllStudent();
		studentList.forEach(obj -> {
			System.out.println(STR."\{obj.getFirstName()}, \{obj.getLastName()}, \{obj.getEmail()}");
		});

		System.out.println("----a---------------------------------------");

		studentService.findAllStudentByName("abdulla").forEach(obj -> System.out.println(obj.getFirstName()+ ", "+ obj.getEmail()));

		System.out.println("----------b----------------------------------");

		studentService.findAllStudentByAgeAfter(20).forEach(obj-> System.out.println(obj.getAge() + ", "+obj.getFirstName()));
		System.out.println("---------------------------------------------------c------------");

		studentService.findAllByAgeAfterAndAgeBefore(10,20).forEach(ob-> System.out.println(ob.getFirstName() + ", " + ob.getAge()));
		System.out.println("----------------------------d-------------------------");


	}
}
