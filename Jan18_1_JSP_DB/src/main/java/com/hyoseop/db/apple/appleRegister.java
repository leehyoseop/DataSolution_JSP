package com.hyoseop.db.apple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class appleRegister
 */
@WebServlet("/appleRegister")
public class appleRegister extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			request.setAttribute("content", "register.jsp");			
		} else {
			appleDAO.getAppledao().registerApple(request);
			//request.setAttribute("content", "register.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
