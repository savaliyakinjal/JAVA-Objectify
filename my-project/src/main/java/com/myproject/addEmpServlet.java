package com.myproject;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.googlecode.objectify.Objectify;
import com.myproject.dao.EmpDaoImpl;
import com.myproject.model.Employee;
import com.myproject.objectify.OfyFactory;

@WebServlet("/saveEmp")
public class addEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, RuntimeException {
		System.out.println("id" + request.getParameter("id"));
		System.out.println("Name" + request.getParameter("name"));
		System.out.println("Email" + request.getParameter("email"));
		String jsonPost = Util.readInputText(request);
		Long id = Long.parseLong(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		System.out.println("In Add Emp Serv.....");
		

		Objectify ofy = OfyFactory.init();
		ofy.transact(() -> {
			System.out.println("In Transact....");
			Employee employee = new Employee();
			employee.setId(id);
			employee.setName(name);
			employee.setEmail(email);
			System.out.println("Emp :" + employee);
			ofy.save().entity(employee).now();
			System.out.println("Save Done");
		});
		Util.responseOkJSON(response);

		request.getRequestDispatcher("index.jsp").forward(request, response);
		System.out.println("out Add Emp Serv.....");
	}

}
