package com.obj.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Person {
	 @Id
	public Long id;
	  
	  private String name;
	  
	  public Person() { 
	  }

	 
	  
	  public Person(String name) {
		super();
		this.name = name;
	}



	public Person(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	  
	  public String toString() {
	    String s = "";
	    s += "id=" + getId() + " ";
	    s += "name=" + name + " ";
	    return s;
	  }
}
