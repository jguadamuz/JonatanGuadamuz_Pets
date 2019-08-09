package com.jonatan.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jonatan.beans.Cat;

/**
 * Servlet implementation class Cats
 */
@WebServlet("/animals/cat")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int weight;
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		if (request.getParameter("weight") == null) 
			weight = 0; 
		else 
			weight = Integer.parseInt(request.getParameter("weight"));
		
        Cat c = new Cat(name, breed, weight);
        
        request.setAttribute("cat", c);
		
        RequestDispatcher view = request.getRequestDispatcher("/html/showCat.jsp");
        view.forward(request, response);
	}

}
