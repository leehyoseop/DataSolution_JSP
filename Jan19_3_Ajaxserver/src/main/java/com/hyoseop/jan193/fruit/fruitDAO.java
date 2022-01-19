package com.hyoseop.jan193.fruit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.hyoseop.db.manager.HyoseopDBManager;

public class fruitDAO {
	
	public static void getAllFruits(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = HyoseopDBManager.connect("HyoseopPool");
			String sql = "select * from fruit order by f_price";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ArrayList<Fruit> fruits = new ArrayList<Fruit>();
			Fruit f = null;
			while(rs.next()) {
				f = new Fruit();
				f.setF_name(rs.getString("f_name"));
				f.setF_price(rs.getInt("f_price"));
				fruits.add(f);
			}
			req.setAttribute("fruits", fruits);
		} catch (Exception e) {
			// TODO: handle exception
		}
		HyoseopDBManager.close(con, pstmt, rs);
	}
	
	public static void reg(HttpServletRequest req) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con =HyoseopDBManager.connect("HyoseopPool");
			
			// ������ �Է�
			req.setCharacterEncoding("EUC-KR");
			String name = req.getParameter("name");
			int price = Integer.parseInt(req.getParameter("price"));
			
			// sql�� �ۼ� (�̿ϼ�) - ������ ����� ������ �𸣱� ������
			String sql = "insert into fruit values(?, ?)";
			// DB�����۾� �Ѱ��Ŵ���(pstmt)
			pstmt = con.prepareStatement(sql);
			// sql�ϼ�
			pstmt.setString(1, name);
			pstmt.setInt(2, price);
			pstmt.executeUpdate();
			// ���� + ���ó��
//			if (pstmt.executeUpdate() == 1) {
//			
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		HyoseopDBManager.close(con, pstmt, null);
	}
}
