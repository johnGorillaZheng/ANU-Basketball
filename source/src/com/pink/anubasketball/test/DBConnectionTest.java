package com.pink.anubasketball.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pink.anubasketball.util.DBConnection;



public class DBConnectionTest {
	public void testConnection() {
		Connection conn = DBConnection.getConnection();
		String sql = "select * from competition_manager where uk_username='test'";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("id = " + rs.getInt(1));
				System.out.println("username = " + rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt);
			DBConnection.close(conn);
		}
	}
}
