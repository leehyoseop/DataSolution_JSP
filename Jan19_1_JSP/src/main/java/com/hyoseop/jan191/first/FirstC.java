package com.hyoseop.jan191.first;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstC
 */

//Controller
//	JSP환경에서 상황판단을 한다.
//	(Get, Post) 하기에는 Servlet이 적합
//		계산을 해야하면 M(Model)으로
//		보여줘야하면 V(View)로 흐름을 제어
//	흐름제어

@WebServlet("/FirstC") // FirstC를 톰캣에 등록

public class FirstC extends HttpServlet {
	
	//이 프로젝트에는 Main메소드가 없음
	//톰캣이 실행(main은 톰캣에) -> 알아서 FirstC객체를 만들고...
	//이 프로젝트가 처음 시작할 때
	
	public FirstC() {
		// TODO Auto-generated constructor stub
		super();
		//처음 실행했을때 사과 데이터 총 개수를 받아오기 위해서 써먹었음
	}
	
	//웹사이트의 페이지 전환 : C로 요청 -> M에 가서 작업 -> view로 포워딩
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사이트에 처음 들어오면
		//FirstC로 파라미터 하나도 없이 GET방식으로 요청을 하면, 
		if (!request.getParameterNames().hasMoreElements()) {
			//fistV.jsp로 지금 일어난 요청을 제보해주는 객체
			RequestDispatcher rd = request.getRequestDispatcher("firstV.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
