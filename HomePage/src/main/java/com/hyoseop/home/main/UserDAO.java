package com.hyoseop.home.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hyoseop.db.manager.HyoseopDBManager;


public class UserDAO {
	public static boolean loginCheck(HttpServletRequest req) {
//		Member m = (Member) req.getSession().getAttribute("m");
//		if (m != null) {
//			//로그인 성공 + 상태유지
//			//req.setAttribute("lp", "welcome.jsp");
//			return true;
//		}
//		//로그인 실패시
//		//req.setAttribute("lp", "login.jsp");
//		return false;
//		
		
		Member m = (Member)req.getSession().getAttribute("loginMember");
		return (m != null);
	}
	
	public static void login(HttpServletRequest req, HttpServletResponse res) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			req.setCharacterEncoding("euc-kr");
			String name = req.getParameter("name");
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			con = HyoseopDBManager.connect("HyoseopPool");
			String sql = "select * from Member ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Member> members = new ArrayList<Member>();
			Member m = null;
			while (rs.next()) {
				m = new Member();
				m.setName(rs.getString("m_name"));
				m.setId(rs.getString("m_id"));
				m.setPw(rs.getString("m_pw"));
				members.add(m);
			}
			for (Member mem : members) {
				System.out.println(mem.getId());
				if (id.equals(mem.getId()) && pw.equals(mem.getPw())) {
					Member loginMember = new Member(null, id, pw);
					req.getSession().setAttribute("loginMember", loginMember);
					req.getSession().setMaxInactiveInterval(100);
				}
			}
			
			Cookie c = new Cookie("LastloginId", id);
			c.setMaxAge(100);
			res.addCookie(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
		HyoseopDBManager.close(con, pstmt, rs);
	}
	
	public static String signup(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			req.setCharacterEncoding("euc-kr");
			String name = req.getParameter("name");
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			con = HyoseopDBManager.connect("HyoseopPool");
			String sql = "select * from Member ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Member> members = new ArrayList<Member>();
			Member m = null;
			while (rs.next()) {
				m = new Member();
				m.setName(rs.getString("m_name"));
				m.setId(rs.getString("m_id"));
				m.setPw(rs.getString("m_pw"));
				members.add(m);
			}
			for (Member mem : members) {
				System.out.println(mem.getId());
				if (id.equals(mem.getId())) {
					break;
				}
				else {
					sql = "insert into Member values(?,?,?)";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, id);
					pstmt.setString(3, pw);
					pstmt.executeUpdate();
					return "Success";
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		HyoseopDBManager.close(con, pstmt, rs);
		return "?";
		
	}
}
