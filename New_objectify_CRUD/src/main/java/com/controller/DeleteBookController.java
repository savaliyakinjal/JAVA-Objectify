package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.googlecode.objectify.Objectify;
import com.model.Book;
import com.objectify.OfyFactory;

@WebServlet("/deleteBook")
public class DeleteBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long bid = Long.parseLong(request.getParameter("bid"));
//		System.out.println(bid);
		Objectify ofy = OfyFactory.init();
		Book book = ofy.load().type(Book.class).id(bid).now();
		System.out.println(book);

		Gson g = new Gson();
		String book1 = g.toJson(book);
		PrintWriter pw = response.getWriter();
		pw.write(book1);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request.getParameter("bid"));
		
		Long bid = Long.parseLong(request.getParameter("bid"));
		System.out.println("bid =="+bid);
		Objectify ofy = OfyFactory.init();
		Book book = ofy.load().type(Book.class).id(bid).now();
		ofy.delete().entity(book).now();
//		PrintWriter pw = response.getWriter();
//		pw.write("book deleted...");
	}

}
