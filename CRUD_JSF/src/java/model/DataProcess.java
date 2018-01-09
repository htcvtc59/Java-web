package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entity.Product;
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
public class DataProcess {

    public Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=ProductJSFdb";
            conn = DriverManager.getConnection(url, "sa", "230697");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public boolean AddProduct(String name, Float price) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "insert into tblproduct values(?,?)";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            pstm.setFloat(2, price);

            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    public ArrayList<Product> listPro() {
        ArrayList<Product> list = new ArrayList<>();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblproduct";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setId(rs.getInt("id"));
                pro.setName(rs.getString("name"));
                pro.setPrice(rs.getFloat("price"));
                list.add(pro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return list;
    }

    public ArrayList<Product> listPage(int offset, int limit, int totalpages) {
        ArrayList<Product> list = new ArrayList<>();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select top(?)* from tblproduct where id between ? and ?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, totalpages);
            pstm.setInt(2, offset);
            pstm.setInt(3, limit);
             ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setId(rs.getInt("id"));
                pro.setName(rs.getString("name"));
                pro.setPrice(rs.getFloat("price"));
                list.add(pro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return list;
    }

    public boolean DeletePro(int id) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "delete from tblproduct where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    public boolean EditPro(int id, String name, Float price) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "update tblproduct set name=?,price=? where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            pstm.setFloat(2, price);
            pstm.setInt(3, id);
            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    public Product DetailPro(int id) {
        Product pro = new Product();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblproduct where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                pro.setId(rs.getInt("id"));
                pro.setName(rs.getString("name"));
                pro.setPrice(rs.getFloat("price"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return pro;
    }

}
