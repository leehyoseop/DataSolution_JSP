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
//	JSPȯ�濡�� ��Ȳ�Ǵ��� �Ѵ�.
//	(Get, Post) �ϱ⿡�� Servlet�� ����
//		����� �ؾ��ϸ� M(Model)����
//		��������ϸ� V(View)�� �帧�� ����
//	�帧����

@WebServlet("/FirstC") // FirstC�� ��Ĺ�� ���

public class FirstC extends HttpServlet {
	
	//�� ������Ʈ���� Main�޼ҵ尡 ����
	//��Ĺ�� ����(main�� ��Ĺ��) -> �˾Ƽ� FirstC��ü�� �����...
	//�� ������Ʈ�� ó�� ������ ��
	
	public FirstC() {
		// TODO Auto-generated constructor stub
		super();
		//ó�� ���������� ��� ������ �� ������ �޾ƿ��� ���ؼ� ��Ծ���
	}
	
	//������Ʈ�� ������ ��ȯ : C�� ��û -> M�� ���� �۾� -> view�� ������
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����Ʈ�� ó�� ������
		//FirstC�� �Ķ���� �ϳ��� ���� GET������� ��û�� �ϸ�, 
		if (!request.getParameterNames().hasMoreElements()) {
			//fistV.jsp�� ���� �Ͼ ��û�� �������ִ� ��ü
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
