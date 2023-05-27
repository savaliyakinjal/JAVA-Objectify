package com.myproject.model;


import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Employee {
	
	@Id
	private Long id;
	
	private String name;
	private String email;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email+"]";
	}
	
	
	
	
	
	
	
}
