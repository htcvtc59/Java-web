/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import model.AccountBank;

/**
 *
 * @author MacOS
 */
@Stateless(mappedName = "mrBean")
public class MyBankSessionBean implements MyBankSessionBeanRemote {

    public MyBankSessionBean() {

    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=bankdb";
            conn = DriverManager.getConnection(url, "sa", "230697");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    @Override
    public AccountBank receivercode(String passcode) {
        AccountBank bank = new AccountBank();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblAccount where passcode=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, passcode);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                bank.setCusNo(rs.getString("cusNo"));
                bank.setCusName(rs.getString("cusName"));
                bank.setPasscode(rs.getString("passcode"));
                bank.setBalance(rs.getString("balance"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return bank;
    }

    @Override
    public boolean transfer(String user, float amount) {
        int result = 0;
        AccountBank bank = new AccountBank();
        PreparedStatement pstm = null;
        PreparedStatement pstm1 = null;
        Connection conn = null;
        try {
            String sql = "update tblAccount set balance=? where cusNo=?";
            String sql1 = "select * from tblAccount where cusNo=?";

            conn = getConnection();
            pstm1 = conn.prepareStatement(sql1);
            pstm1.setString(1, user);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                bank.setCusNo(rs.getString("cusNo"));
                bank.setCusName(rs.getString("cusName"));
                bank.setPasscode(rs.getString("passcode"));
                bank.setBalance(rs.getString("balance"));
            }

            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setFloat(1, Float.valueOf(bank.getBalance()) - amount);
            pstm.setString(2, user);
            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    @Override
    public boolean transferreciver(String transferuser, float amount) {
        int result = 0;
        AccountBank bank = new AccountBank();
        PreparedStatement pstm = null;
        PreparedStatement pstm1 = null;
        Connection conn = null;
        try {
            String sql = "update tblAccount set balance=? where cusNo=?";
            String sql1 = "select * from tblAccount where cusNo=?";

            conn = getConnection();
            pstm1 = conn.prepareStatement(sql1);
            pstm1.setString(1, transferuser);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                bank.setCusNo(rs.getString("cusNo"));
                bank.setCusName(rs.getString("cusName"));
                bank.setPasscode(rs.getString("passcode"));
                bank.setBalance(rs.getString("balance"));
            }

            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setFloat(1, amount + Float.parseFloat(bank.getBalance()));
            pstm.setString(2, transferuser);
            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    @Override
    public boolean withdraw(String user, float amount) {
        int result = 0;
        AccountBank bank = new AccountBank();
        PreparedStatement pstm = null;
        PreparedStatement pstm1 = null;
        Connection conn = null;
        try {
            String sql = "update tblAccount set balance=? where cusNo=?";
            String sql1 = "select * from tblAccount where cusNo=?";

            conn = getConnection();
            pstm1 = conn.prepareStatement(sql1);
            pstm1.setString(1, user);
            ResultSet rs = pstm1.executeQuery();
            while (rs.next()) {
                bank.setCusNo(rs.getString("cusNo"));
                bank.setCusName(rs.getString("cusName"));
                bank.setPasscode(rs.getString("passcode"));
                bank.setBalance(rs.getString("balance"));
            }

            pstm = conn.prepareStatement(sql);
            pstm.setFloat(1, Float.parseFloat(bank.getBalance()) - amount);
            pstm.setString(2, user);
            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    @Override
    public AccountBank checklogin(String user, String pass) {
        AccountBank bank = new AccountBank();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblAccount where cusNo=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, user);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                bank.setCusNo(rs.getString("cusNo"));
                bank.setCusName(rs.getString("cusName"));
                bank.setPasscode(rs.getString("passcode"));
                bank.setBalance(rs.getString("balance"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MyBankSessionBean.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return bank;
    }

}
