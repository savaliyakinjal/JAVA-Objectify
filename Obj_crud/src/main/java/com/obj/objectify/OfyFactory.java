package com.obj.objectify;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.obj.model.Person;

public class OfyFactory extends ObjectifyFactory{
	 
	 public static Objectify init() {
		    return new OfyFactory().begin();
		  }

		  public OfyFactory() {
		    register(Person.class);
		    
		  }

		  @Override
		  public Objectify begin() {
		    return super.begin();
		  }
}
