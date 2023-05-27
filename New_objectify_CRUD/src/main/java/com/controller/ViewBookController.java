package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.googlecode.objectify.Objectify;
import com.model.Book;
import com.objectify.OfyFactory;

/**
 * Servlet implementation class ViewBookController
 */
@WebServlet("/viewBook")
public class ViewBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Objectify ofy = OfyFactory.init();
		List<Book> bookList = ofy.load().type(Book.class).list();
		// System.out.println(bookList);

		PrintWriter pw = response.getWriter();
		Gson g = new Gson();
		String data = g.toJson(bookList);
		pw.write(data);
	}

}
