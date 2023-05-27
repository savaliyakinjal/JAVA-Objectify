package com.crud.servlet;





import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.crud.model.Employee;
import com.crud.service.OfyService;



@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet{

    private static final Logger log = Logger.getLogger(EmployeeServlet.class.getName());


    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        log.info("Employee get Method");
        System.out.println("@webservlet init and working fine.");
    }

//    @GET
//    @Path("/findByID")
//    public void searchEmployeeById(@Context HttpServletRequest req, @Context HttpServletResponse resp, @QueryParam("id") long id){
//
//        log.info("Employee search by ID. ");
//        Employee empFetch = OfyService.ofy().load().type(Employee.class).id(id).now();
//
//        System.out.println(empFetch.toString());
//
//    }


    public void doPut(HttpServletRequest req, HttpServletResponse resp){
        log.info("Employee save doPut");

        Employee emp = new Employee("Scott","Tiger");
        Employee emp1 = new Employee("John","Smith");
        Employee emp2 = new Employee("Marry","Jhons");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp);
        employeeList.add(emp1);
        employeeList.add(emp2);

        OfyService.ofy().save().entities(employeeList).now();

    }


}
