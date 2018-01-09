/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbs;

import dao.contact;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MacOS
 */
public class Dbs {

    public Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=ContactDBs";
            conn = DriverManager.getConnection(url, "sa", "230697");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public boolean addContacts(String username, String gender, String country, String about, boolean likes) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "insert into tblcontact values(?,?,?,?,?)";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, gender);
            pstm.setString(3, country);
            pstm.setString(4, about);
            pstm.setBoolean(5, likes);

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

    public ArrayList<contact> listContact() {
        ArrayList<contact> list = new ArrayList<>();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblcontact";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                contact contact = new contact();
                contact.setId(rs.getInt("id"));
                contact.setUsername(rs.getString("username"));
                contact.setGender(rs.getString("gender"));
                contact.setCountry(rs.getString("country"));
                contact.setAbout(rs.getString("about"));
                contact.setLikes(rs.getBoolean("likes"));
                list.add(contact);
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

    public boolean deleteContact(int id) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "delete from tblcontact where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
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

    public boolean editContact(int id, String username, String gender, String country, String about, boolean likes) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "update tblcontact set username=?,gender=?,country=?,about=?,likes=? where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, gender);
            pstm.setString(3, country);
            pstm.setString(4, about);
            pstm.setBoolean(5, likes);
            pstm.setInt(6, id);
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

    public contact editlistContact(int id) {
        contact contact = new contact();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblcontact where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                contact.setId(rs.getInt("id"));
                contact.setUsername(rs.getString("username"));
                contact.setGender(rs.getString("gender"));
                contact.setCountry(rs.getString("country"));
                contact.setAbout(rs.getString("about"));
                contact.setLikes(rs.getBoolean("likes"));

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

        return contact;
    }

}
