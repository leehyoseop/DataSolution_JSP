package com.hyoseop.jan192.member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberDAO {
	public static boolean loginCheck(HttpServletRequest req) {
		Member m = (Member)req.getSession().getAttribute("m");
		return (m != null);
	}
	
	//로그인 기능
	public static void login(HttpServletRequest req, HttpServletResponse res) {
		try {
			req.setCharacterEncoding("euc-kr");
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			//로그인 성공한 유저정보
			//	사이트 어디서든지 사용 가능
			//	어디갔다오면 로그인 상태가 풀리게
			//	session소속의 attribute나 cookie
			//	cookie는 위험해!
			if (id.equals("헬프") && pw.equals("me")) {
				Member m = new Member(id,pw);
				req.getSession().setAttribute("m", m);
				req.getSession().setMaxInactiveInterval(10);
			}
			
			//한번 로그인에 성공했으면, 다음에 이 사이트에 들어왔을때
			//	<input>에 id가 남아있었으면...
			//	접속을 끊어도, 재부팅해도 남아있는것...-> cookie
			
			Cookie c = new Cookie("lastLoginId", id);
			c.setMaxAge(15);
			res.addCookie(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
