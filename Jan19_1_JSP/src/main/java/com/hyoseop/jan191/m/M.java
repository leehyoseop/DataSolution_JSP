package com.hyoseop.jan191.m;

import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class M {
	//-��
	//  ������û �Ҽ�
	//   parameter(a, b)
	//   attribute(cc)
	//  ������ ������ �� ���� ����� �� ����
	//  ���ο� ��û�� �Ͼ�� ��Ȳ������ �� ��� �Ұ�
	//  Third���� ��Ƽ� �� �� �ִ� ����� �ʿ�(���� Third�����δ� ���� ��û�� ���� ����)
	
	//-parameter
	//	GET : �ּҿ�(��Ʈ�ѷ�?�Ķ���͸�=��&�Ķ���͸�=��&...)
	//	POST : ��������(�ּҿ� ��Ʈ�ѷ�?�Ķ���͸�=�� �Ⱥ���)
	
	// V���� ���� ��
	// String or String[]
	// request �Ҽ�
	
	// �� �б�
	//	Java : request.getParameter("�Ķ���� ��")
	//	JSP(EL) : ${param.�Ķ���͸� }
	
	// -request�Ҽ� attribute
	//	M���� ���� ��
	//	Object
	//	request �Ҽ�
	
	// ���б�
	//	Java : request.getAttribute("��Ʈ����Ʈ��");
	//	JSP(EL) : ${��Ʈ����Ʈ�� }
	
	//////////////////////////////////////////////
	
	//HTTP �������� Ư������ ����
	//	1. Connectionless
	//	����ڰ� ��û�� �� �Ŀ� ����޾��� �� ������ ����� Ư¡
	//	2. Stateless
	//	����� ������ ���¸� ��������� Ư¡
	//	�� ������ �����ϱ� ���ؼ� ��Ű/���� ���
	
	//��Ű(Cookie) : 
	//	������� ���������� ��ǻ�Ϳ� ������ �ߴٰ� ���߿� ����
	//	����ڰ� ���� ��û�� ���ص� �������� ��û�� �ϸ�
	//	�ڵ����� ������ ��������
	//	��	�� �ð��� ���س����� ������ ���� ���ο� ������� ������ �� ����
	//		=> ID, ��� �����ϱ�, ���ι� ��ٱ���, �˾�â (���� �Ϸ� �����ʱ�),...
	
	//	M���� ���� ��
	//	String
	//	�⺻ �����ð� - 24�ð�?
	//	����� ��ǻ�Ϳ� ����Ǵµ�... -����� ��ȣȭ�� �ؼ� ������ ������...
	//	������! - �����ϸ� ������ ������ ��Ű�� �����ϸ� �ȵ�!
	
	//	���б�
	//	Java : ���� �������ǻ�Ϳ� ��������ִ� ��Ű���� -> ���߿� �� ������Ʈ���� ã�Ƽ�
	//	JSP(EL) : ${cookie.�̸�.value }
	
	
	//����(Session) : (�׸������� ��ũ������ ����)
	//	��Ű�� ������� ���� but ������������� Server���� ����
	//	���ӽð� ���� O, ���� �ð����� ������ ������ 
	//	��Ű���ٴ� ������ ����, �޸� ��뷮 ŭ
	//	������ ���� ���� �Ǹ� -> ���� ������ -> ���� ����
	
	//	session �Ҽ� attribute
	//	M���� ���� ��
	//	Object
	//	���Ḹ �Ǿ������� ��𼭵��� ����� ����
	//	�����ð� : �⺻ 30��, ���� ����, 
	//				�ð����� �ƹ���û�� ���ϸ� �ڵ����� ����.
	
	//	��Ű : ���س��� �ð��� ����ǰų�, ��Ű�� �����ϱ� �������� ����
	//	���� : ����Ǵ� �ð��� ������ �� ������, �������� ����Ǹ� �ٷ� ����
	
	
	public static void makeSecondData(HttpServletRequest req, HttpServletResponse res) {
		int c = 3000;
		req.setAttribute("cc", c);
		
		int d = 40000;
		HttpSession hs = req.getSession(); // ����ڿ� �������� �������
		hs.setMaxInactiveInterval(30); // session�� �����ð��� 30��
		hs.setAttribute("d", d); // session�Ҽ��� attribute
		
		String e = "50000";
		Cookie ck = new Cookie("e", e);
		ck.setMaxAge(15); //15�ʵ����� ����� ��ǻ�Ϳ� ���Ϸ� ����
		res.addCookie(ck); //���� ��ü�� ��Ű�� �߰�
	}
	
	public static void printSecondDataNew(HttpServletRequest req) {
		try {
			HttpSession hs = req.getSession();
			int d = (Integer) hs.getAttribute("d");
			System.out.println(d);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Cookie[] cks = req.getCookies(); //����Ǿ��ִ� ��Ű���̱� ������ �迭
		for (Cookie cookie : cks) {
			if (cookie.getName().equals("e")) { //��Ű �̸��� e�ΰ�
				System.out.println(cookie.getValue());
			}
		}
	}
	
	public static void printSecondData(HttpServletRequest req) {
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		int c = (Integer)req.getAttribute("cc");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}