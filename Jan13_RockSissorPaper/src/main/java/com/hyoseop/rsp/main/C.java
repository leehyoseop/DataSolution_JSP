package com.hyoseop.rsp.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hyoseop.oddeven.main.Model;

/**
 * Servlet implementation class C
 */
@WebServlet("/C")
public class C extends HttpServlet {
//	public static int cnt = 0;
//	public static int win = 0;
//	public static int draw = 0;
//	public static int lose = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if (!request.getParameterNames().hasMoreElements()) {
			
		} else {
			Computer.Judge(request);		
		}
		request.getRequestDispatcher("USERView.jsp").forward(request, response);
		//int userhand = Integer.parseInt(request.getParameter("userhand"));
		//System.out.println(userhand);  
//		cnt += (Integer)request.getAttribute("cnt"); 
//		win += (Integer)request.getAttribute("win"); 
//		draw += (Integer)request.getAttribute("draw"); 
//		lose += (Integer)request.getAttribute("lose");
//		  
//		System.out.printf("%dÀü %d½Â %d¹« %dÆÐ",cnt, win, draw, lose);
		//RequestDispatcher rd = request.getRequestDispatcher("Third.jsp");
		 
		//request.setAttribute("cnt", cnt);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Computer.Judge(request);
		
	}

}
