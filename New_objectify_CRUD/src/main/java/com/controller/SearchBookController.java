package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/searchbook")
public class SearchBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String keyword=request.getParameter("keyword");
		System.out.println(keyword);
		Objectify ofy = OfyFactory.init();
		List<Book> searchList=ofy.load().type(Book.class).filter("name >=", keyword).filter("name <", keyword + "\uFFFD").list();
		System.out.println(searchList);
		PrintWriter pw = response.getWriter();
		Gson g = new Gson();
		String data = g.toJson(searchList);
		pw.write(data);
	}

	

}
