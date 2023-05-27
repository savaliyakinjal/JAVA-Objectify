package com.obj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.server.spi.discovery.DiscoveryGenerator.Result;
import com.google.cloud.datastore.Transaction.Response;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.LoadResult;
import com.googlecode.objectify.Objectify;
import com.obj.model.Person;
import com.obj.objectify.OfyFactory;

/**
 * Servlet implementation class addPerson
 */
@WebServlet("/addPerson")
public class addPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("text/plain");
//	    response.getWriter().println("HomeServlet Works");
	    
	    Objectify ofy = OfyFactory.init();
	    
	    Person person = new Person("chandni");
//	    assert person.id != null;
//	    System.out.println(person);
	    ofy.save().entities(person).now();
	    response.getWriter().println("person=" + person);
	    
//	    Person person = new Person(2l,"smruti");
//	    ofy.save().entities(person).now();
//	    response.getWriter().println("person=" + person);
	    
	    
//	    person.setName("Brandon2");
//	    ofy.save().entities(person).now();
//	    response.getWriter().println("person=" + person);
	    
	    
	    // **************** for get result **********************
	    
//	    LoadResult<Person> result=ofy.load().key(Key.create(Person.class,3l)); 
//	    Person person2=result.now();
//	    System.out.println(person2);
	    
	 // More likely this is what you will type ****** for get result*******
	    
//	    Person person3 = ofy.load().type(Person.class).id(1).now();
//	    System.out.println(person3);
	    
	 // Or you can issue a query ********** for filter********* no work***
	    
//	    Person person4 = ofy.load().type(Person.class).filter("name", "kinjal").first().now();
//	    Person person=ofy.load().type(Person.class).filter("smruti","name").first().now();
//	    System.out.println(person4);
//	    System.out.println(person);
	    
	 // Change some data and write it ************ for update **********
	    
//	    person.setName("kinju");
//	    ofy.save().entity(person).now();    // async without the now()
//	    System.out.println(person);
	    
	 // Delete it
//	    ofy.delete().entity(person).now();    // async without the now()
	}

	

}
