package com.hyoseop.jan192.member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberDAO {
	public static boolean loginCheck(HttpServletRequest req) {
		Member m = (Member)req.getSession().getAttribute("m");
		return (m != null);
	}
	
	//�α��� ���
	public static void login(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setCharacterEncoding("euc-kr");
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			//�α��� ������ ��������
			//	����Ʈ ��𼭵��� ��� ����
			//	��𰬴ٿ��� �α��� ���°� Ǯ����
			//	session�Ҽ��� attribute�� cookie
			//	cookie�� ������!
			if (id.equals("����") && pw.equals("me")) {
				Member m = new Member(id,pw);
				req.getSession().setAttribute("m", m);
				req.getSession().setMaxInactiveInterval(10);
			}
			
			//�ѹ� �α��ο� ����������, ������ �� ����Ʈ�� ��������
			//	<input>�� id�� �����־�����...
			//	������ ���, ������ص� �����ִ°�...-> cookie
			
			Cookie c = new Cookie("lastLoginId", id);
			c.setMaxAge(15);
			res.addCookie(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
