package com.pink.anubasketball.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pink.anubasketball.bean.CompetitionManager;
import com.pink.anubasketball.dao.CompetitionManagerDAO;
import com.pink.anubasketball.util.DBConnection;

public class CompetitionManagerDAOImpl implements CompetitionManagerDAO {
    @Override
    public CompetitionManager getManagerByUserName(String userName) {
        Connection conn = DBConnection.getConnection();
        String sql = "select * from competition_manager where uk_username=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        CompetitionManager competitionManager = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userName);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                competitionManager = new CompetitionManager();
                competitionManager.setId(rs.getInt(1));
                competitionManager.setUserName(rs.getString(2));
                competitionManager.setPassword(rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(rs);
            DBConnection.close(pstmt);
            DBConnection.close(conn);
        }
        return competitionManager;
    }

}
