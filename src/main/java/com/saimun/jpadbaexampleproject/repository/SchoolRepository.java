package com.saimun.jpadbaexampleproject.repository;

import com.saimun.jpadbaexampleproject.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}