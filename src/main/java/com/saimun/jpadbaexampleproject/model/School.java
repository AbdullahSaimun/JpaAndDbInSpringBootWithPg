package com.saimun.jpadbaexampleproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class School {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	public School() {
	}

	public School(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
}