/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbs;

import dao.Event;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Dbs {

    public Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=EventsDB";
            conn = DriverManager.getConnection(url, "sa", "230697");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public boolean addEvents(String dateevent, String timeevent, String planning, String whereevent,  String moreinfo) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "insert into tblEvent values(?,?,?,?,?)";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, dateevent);
            pstm.setString(2, timeevent);
            pstm.setString(3, planning);
            pstm.setString(4, whereevent);
            pstm.setString(5, moreinfo);

            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Dbs.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Dbs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    public ArrayList<Event> listEvents() {
        ArrayList<Event> list = new ArrayList<>();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblEvent";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Event e = new Event();
                e.setId(rs.getInt("id"));
                e.setDateevent(rs.getString("dateevent"));
                e.setTimeevent(rs.getString("timeevent"));
                e.setPlanning(rs.getString("planning"));
                e.setWhereevent(rs.getString("whereevent"));
                e.setMoreinfo(rs.getString("moreinfo"));
                list.add(e);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Dbs.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Dbs.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return list;
    }
    
    

}
