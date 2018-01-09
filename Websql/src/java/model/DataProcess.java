/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DTO.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MacOS
 */
public class DataProcess {

    public Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user = "sa";
            String pass = "230697";
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Account";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public boolean checkLogin(String user, String pass) {
        boolean status = false;
        try {
            String sql = "select * from tblAccount where _user=? and _pass=?";
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, user);
            prst.setString(2, pass);
            ResultSet rs = prst.executeQuery();
            status = rs.next();
            prst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public boolean addAcc(Account acc) {
        int result = 0;
        try {
            String sql = "insert into tblAccount values(?,?)";
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, acc.getUser());
            prst.setString(2, acc.getPass());
            result = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return result>0;
        }
    }

    public Account checkLoginAcc(Account acc) {
        Account accs = null;
        try {
            String sql = "select * from tblAccount where _user=? and _pass=?";
            PreparedStatement prst = getConnection().prepareStatement(sql);
            prst.setString(1, acc.getUser());
            prst.setString(2, acc.getPass());
            ResultSet rs = prst.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setUser(rs.getString("_user"));
                a.setPass(rs.getString("_pass"));
                accs = new Account(a.getUser(), a.getPass());
            }
            prst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return accs;
        }
    }

    public static void main(String[] args) {
        DataProcess dt = new DataProcess();
        Account acc = new Account("admin", "admin");
        if (dt.checkLoginAcc(acc) != null) {
            System.out.println(acc.getUser() + acc.getPass());
        }
    }

}
