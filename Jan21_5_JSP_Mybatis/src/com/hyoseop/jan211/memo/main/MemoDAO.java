package com.hyoseop.jan211.memo.main;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.hyoseop.db.manager.HyoseopDBManager;

public class MemoDAO {
	//select
	public static void getMemo(HttpServletRequest req) {
		SqlSession ss = null;
		try {
			//패키지까지 전부 명시해야!!
			ss = HyoseopDBManager.connect("com/hyoseop/db/manager/config.xml");
			
//			List<Memo> memos = ss.selectList("memoMapper.getMemo");
//			req.setAttribute("memos", memos);
			
			req.setAttribute("memos", ss.selectList("memoMapper.getMemo"));
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		ss.close();
	}
	
	//insert
	public static void write(HttpServletRequest req) {
		SqlSession ss = null;
		
		try {
			ss = HyoseopDBManager.connect("com/hyoseop/db/manager/config.xml");
			
			String content = req.getParameter("content");
			content = content.replace("\r\n", "<br>");
			String d = req.getParameter("date");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date d2 = sdf.parse(d);
			
			Memo m = new Memo(null, content, d2);
			
			if ((ss.insert("memoMapper.writeMemo", m)) == 1) {
				req.setAttribute("r", "메모성공");
				ss.commit();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			req.setAttribute("r", "메모실패");
		}
		ss.close();
	}
	
	//update
	public static void update(HttpServletRequest req, String u_no) {
		SqlSession ss =null;
		try {
			ss = HyoseopDBManager.connect("com/hyoseop/db/manager/config.xml");
			
			req.setCharacterEncoding("utf-8");
			
			BigDecimal no = new BigDecimal(u_no);
			System.out.println("함수내부");
			System.out.println(no);
			
			String content = req.getParameter("content");
			content = content.replace("\r\n", "<br>");
			String d = req.getParameter("date");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date d2 = sdf.parse(d);
			Memo m = new Memo(no, content, d2);
		
			if ((ss.update("memoMapper.updateMemo", m)) == 1) {
				req.setAttribute("r", "메모성공");
				ss.commit();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			req.setAttribute("r", "메모실패");
		}
		ss.close();
	}
	
	//delete
	public static void delete(HttpServletRequest req) {
		SqlSession ss =null;
		try {
			ss = HyoseopDBManager.connect("com/hyoseop/db/manager/config.xml");
			
			BigDecimal no = new BigDecimal(req.getParameter("m_no").toString());
			System.out.println(no);
			Memo m = new Memo(no, null, null);
			ss.delete("memoMapper.deleteMemo",m);
			ss.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			req.setAttribute("r", "메모실패");
		}
		ss.close();
	}

	private static BigDecimal BigDecimal(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
