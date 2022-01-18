package com.hyoseop.db.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//기존 JDBC 프로그램구현 -> DBMS와 연동하는 작업
//클라이언트로부터 요청이 있을때마다 DB서버와 연결하기 위해서
//Connection 객체를 얻어내야 했음

//단점
//	1.Connection 과정은 일정 시간이 필요한 작업
//	2.불필요한 연결에 의한 서버 자원의 낭비

//단점 보완 -> DBCP(Data Connection Pool)
//		여러개의 DB Connection을 하나의 Pool에 모아놓고 관리
//		필요할때마다 Pool에서 불러다가 사용하면!
//		만약, 빌려줄 수 있는 Connection이 없다면, Connection객체가 반환할때까지 클라이언트는 대기 상태로 전환
//		사용이 끝난 Connection 객체는 다시 Pool 전환

//		JNDI(Java Naming and Directory Interface)

//DataSource : 커넥션 풀의 Connection을 관리하기 위한 객체
//		lookup 메소드를 통해서 관리
		
public class HyoseopDBManager {
	public static Connection connect(String poolName) throws NamingException, SQLException {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/" + poolName);
		return ds.getConnection();
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
		}
		try {
			pstmt.close();
		} catch (Exception e) {
		}
		try {
			con.close();
		} catch (Exception e) {
		}
	}
}
