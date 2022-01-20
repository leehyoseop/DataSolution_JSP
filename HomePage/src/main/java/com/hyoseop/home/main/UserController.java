package com.hyoseop.home.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.If;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//회원가입
		if (!request.getParameterNames().hasMoreElements()) {
			request.getRequestDispatcher("SignUpView.jsp").forward(request, response);
		} else {
		//null	
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 확인
		UserDAO.login(request, response);
		//로그인 유지확인
		if (UserDAO.loginCheck(request)) {
			request.setAttribute("detail", "LoginSuccessView.jsp");
			request.getRequestDispatcher("HomeView.jsp").forward(request, response);		
		}
		else {
			request.setAttribute("detail", "LoginFailView.jsp");
			request.getRequestDispatcher("HomeView.jsp").forward(request, response);	
		}
	}
	
}
