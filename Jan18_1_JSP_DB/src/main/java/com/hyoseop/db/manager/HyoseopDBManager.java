package com.hyoseop.db.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//���� JDBC ���α׷����� -> DBMS�� �����ϴ� �۾�
//Ŭ���̾�Ʈ�κ��� ��û�� ���������� DB������ �����ϱ� ���ؼ�
//Connection ��ü�� ���� ����

//����
//	1.Connection ������ ���� �ð��� �ʿ��� �۾�
//	2.���ʿ��� ���ῡ ���� ���� �ڿ��� ����

//���� ���� -> DBCP(Data Connection Pool)
//		�������� DB Connection�� �ϳ��� Pool�� ��Ƴ��� ����
//		�ʿ��Ҷ����� Pool���� �ҷ��ٰ� ����ϸ�!
//		����, ������ �� �ִ� Connection�� ���ٸ�, Connection��ü�� ��ȯ�Ҷ����� Ŭ���̾�Ʈ�� ��� ���·� ��ȯ
//		����� ���� Connection ��ü�� �ٽ� Pool ��ȯ

//		JNDI(Java Naming and Directory Interface)

//DataSource : Ŀ�ؼ� Ǯ�� Connection�� �����ϱ� ���� ��ü
//		lookup �޼ҵ带 ���ؼ� ����
		
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
