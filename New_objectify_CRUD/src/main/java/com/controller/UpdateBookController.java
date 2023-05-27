package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Objectify;
import com.model.Book;
import com.objectify.OfyFactory;

/**
 * Servlet implementation class UpdateBookController
 */
@WebServlet("/updatebook")
public class UpdateBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("bid");
		String name = request.getParameter("bname");
		String price = request.getParameter("price");
		String qty = request.getParameter("qty");

		Book book = new Book();
		book.setId(Long.parseLong(id));
		book.setName(name);
		book.setPrice(Double.parseDouble(price));
		book.setQty(Integer.parseInt(qty));

		Objectify ofy = OfyFactory.init();
		ofy.save().entities(book).now();

//		request.setAttribute("msg", "Add Book successfully done......");
		request.getRequestDispatcher("index.jsp").forward(request, response);
//		PrintWriter pw = response.getWriter();
//		pw.write("Book inserted successfully !!!");
	}

}
