package com.hyoseop.db.apple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.hyoseop.db.manager.HyoseopDBManager;
import com.hyoseop.jan811.main.Apple;

public class appleDAO {
	
	private static final appleDAO appleDAO = new appleDAO();
	
	public appleDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static appleDAO getAppledao() {
		return appleDAO;
	}

	public void getAllApple(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = HyoseopDBManager.connect("HyoseopPool");
			String sql = "select*from apple order by a_price";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Apple> apples = new ArrayList<Apple>();
			Apple apple = null;
			while (rs.next()) {
				apple = new Apple();
				apple.setA_location(rs.getString("a_location"));
				apple.setA_color(rs.getString("a_color"));
				apple.setA_price(rs.getInt("a_price"));
				apples.add(apple);			
			}
			req.setAttribute("apples", apples);
		} catch (Exception e) {
			// TODO: handle exception
		}
		HyoseopDBManager.close(con, pstmt, rs);
	}
	
	public void registerApple(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		
		String location = req.getParameter("location");
		String color = req.getParameter("color");
		int price = Integer.parseInt(req.getParameter("price"));
		
		try {
			con = HyoseopDBManager.connect("HyoseopPool");
			String sql = "insert into apple " + "values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			//rs = pstmt.executeQuery();
			pstmt.setString(1, location);
			pstmt.setString(2, color);
			pstmt.setInt(3, price);
			pstmt.executeUpdate();
			
			String r = null;
			if (pstmt.executeUpdate() >= 1) {
		           r = "등록 성공";
		        } else {
		           r = "등록 실패";
		        }
		    req.setAttribute("r", r);
		} catch (Exception e) {
			// TODO: handle exception
		}
		HyoseopDBManager.close(con, pstmt, null);
	}
	
}
