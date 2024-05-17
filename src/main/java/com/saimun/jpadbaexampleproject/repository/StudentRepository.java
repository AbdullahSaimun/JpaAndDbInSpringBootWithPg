package com.saimun.jpadbaexampleproject.repository;

import com.saimun.jpadbaexampleproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}