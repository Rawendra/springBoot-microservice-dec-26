package com.example.rawendraprojectspring.controller;

import java.time.LocalDate;



public class Users {
	private String name;
	private Integer id;
	private LocalDate dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String name, Integer id, LocalDate dob) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
	}
	
	
	

}
