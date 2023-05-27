package com.objectify;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.model.Book;



public class OfyFactory extends ObjectifyFactory{
	 
	 public static Objectify init() {
		    return new OfyFactory().begin();
		  }

		  public OfyFactory() {
		    register(Book.class);
		    
		  }

		  @Override
		  public Objectify begin() {
		    return super.begin();
		  }
}
