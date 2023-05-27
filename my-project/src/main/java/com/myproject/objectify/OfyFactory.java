package com.myproject.objectify;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.myproject.model.Employee;


public class OfyFactory extends ObjectifyFactory{
	 
	 public static Objectify init() {
		    return new OfyFactory().begin();
		  }

		  public OfyFactory() {
		    register(Employee.class);
		    
		  }

		  @Override
		  public Objectify begin() {
		    return super.begin();
		  }
}
