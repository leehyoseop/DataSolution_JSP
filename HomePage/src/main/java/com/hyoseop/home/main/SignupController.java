package com.hyoseop.home.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupController
 */
@WebServlet("/SignupController")
public class SignupController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//db와 id 비교해서 회원가입
		String result = UserDAO.signup(request);
		//System.out.println(result);
		if (result.equals("Success")) {			
			request.setAttribute("detail", "SignupSuccessView.jsp");
			request.getRequestDispatcher("HomeView.jsp").forward(request, response);
		} else {
			request.setAttribute("detail", "SignupFailView.jsp");
			request.getRequestDispatcher("HomeView.jsp").forward(request, response);
		}
	}

}
