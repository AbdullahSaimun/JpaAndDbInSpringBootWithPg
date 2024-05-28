package com.saimun.jpadbaexampleproject.repository;

import com.saimun.jpadbaexampleproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findAllByFirstNameContainingIgnoreCase(String name);

	List<Student> findAllByAgeAfter(int age);

	List<Student> findAllByAgeAfterAndAgeBefore(int after, int before);

	Optional<Student> findByLastNameEqualsIgnoreCase(String firstName);
}