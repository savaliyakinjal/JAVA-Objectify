package com.myproject;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("Hello App Engine!\r\n");
    
//    Objectify ofy=OfyFactory.init();
//    
//    Employee employee=new Employee(1l, "kinjal", "kinjal@gmail.com");
//    ofy.save().entities(employee).now();
//    response.getWriter().println("Employee :"+employee);
    
//    employee.setName("smruti");
//    employee.setEmail("smruti@gmail.com");
//    ofy.save().entities(employee).now();
//    response.getWriter().println("Employee :"+employee);
//    
//    int id = employee.getId();
//    employee = ofy.load().type(Employee.class).id(id).now();
//    response.getWriter().println("person=" + employee);
    
    

  }
}