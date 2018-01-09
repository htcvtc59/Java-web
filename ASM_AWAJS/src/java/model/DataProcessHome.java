/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.News;
import entity.TypeCate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataProcessHome {

    public Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=ASMAWAJS";
            conn = DriverManager.getConnection(url, "sa", "230697");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public boolean addType(String type) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "insert into tblType values(?)";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, type);

            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    public ArrayList<TypeCate> listType() {
        ArrayList<TypeCate> list = new ArrayList<>();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblType";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                TypeCate pro = new TypeCate();
                pro.setId(rs.getInt("id"));
                pro.setType(rs.getString("type"));
                list.add(pro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return list;
    }

    public boolean deleteType(int id) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "delete from tblType where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    public boolean editType(int id, String type) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "update tblType set type=? where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, type);
            pstm.setInt(2, id);
            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result > 0;
    }

    public TypeCate detailType(int id) {
        TypeCate pro = new TypeCate();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblType where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                pro.setId(rs.getInt("id"));
                pro.setType(rs.getString("type"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return pro;
    }

//    News
    public ArrayList<News> getAll() throws SQLException {
        ArrayList<News> list = new ArrayList();
        Connection conn = getConnection();
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sql = "select * from tblNews";

        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt(1));
                n.setTitle(rs.getString(2));
                n.setType(rs.getString(3));
                n.setSubcontent(rs.getString(4));
                n.setContent(rs.getString(5));
                n.setDate(rs.getString(6));
                n.setImage(rs.getString(7));
                list.add(n);

            }
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public boolean addNews(String title, String type, String subcontent, String content, String date, String image) throws SQLException {
        int count = 0;
        String sql = "insert into tblNews values(?,?,?,?,?,?)";
        Connection conn = getConnection();
        PreparedStatement prst = null;

        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, title);
            prst.setString(2, type);
            prst.setString(3, subcontent);
            prst.setString(4, content);
            prst.setString(5, date);
            prst.setString(6, image);

            count = prst.executeUpdate();

            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count > 0;
    }

    public boolean deleteNews(int id) throws SQLException {
        int count = 0;
        Connection conn = getConnection();
        PreparedStatement prst = null;
        String sql = "delete from tblNews where id = ?";

        try {
            prst = conn.prepareStatement(sql);
            prst.setInt(1, id);
            count = prst.executeUpdate();

            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count > 0;
    }

    public boolean updateNews(int id, String title, String type, String subcontent, String content, String date, String image) throws SQLException {
        int count = 0;
        Connection conn = getConnection();
        String sql = "update tblNews set title = ? , type = ? , subcontent = ? , content = ? , date = ? , image = ? where id = ?";
        PreparedStatement prst = null;

        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, title);
            prst.setString(2, type);
            prst.setString(3, subcontent);
            prst.setString(4, content);
            prst.setString(5, date);
            prst.setString(6, image);
            prst.setInt(7, id);

            count = prst.executeUpdate();
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count > 0;

    }

    public News getNewsById(int id) throws SQLException {
        Connection conn = getConnection();
        News n = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sql = "select * from tblNews where id=?";
        try {
            prst = conn.prepareStatement(sql);
            prst.setInt(1, id);
            rs = prst.executeQuery();
            while (rs.next()) {
                n = new News();
                n.setId(id);
                n.setTitle(rs.getString(2));
                n.setType(rs.getString(3));
                n.setSubcontent(rs.getString(4));
                n.setContent(rs.getString(5));
                n.setDate(rs.getString(6));
                n.setImage(rs.getString(7));

            }
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public ArrayList<News> SearchByTitle(String title) throws SQLException {
        ArrayList<News> list = new ArrayList();
        Connection conn = getConnection();
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sql = "select * from tblNews where title like ? ";

        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1, "%" + title + "%");
            rs = prst.executeQuery();
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt(1));
                n.setTitle(rs.getString(2));
                n.setType(rs.getString(3));
                n.setSubcontent(rs.getString(4));
                n.setContent(rs.getString(5));
                n.setDate(rs.getString(6));
                n.setImage(rs.getString(7));
                list.add(n);

            }
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public ArrayList<News> SearchByDate(String date) throws SQLException {
        ArrayList<News> list = new ArrayList();
        Connection conn = getConnection();
        PreparedStatement prst = null;
        ResultSet rs = null;
        String sql = "select * from tblNews where date = ?";

        try {
            prst = conn.prepareStatement(sql);

            prst.setString(1, date);
            rs = prst.executeQuery();
            while (rs.next()) {
                News n = new News();
                n.setId(rs.getInt(1));
                n.setTitle(rs.getString(2));
                n.setType(rs.getString(3));
                n.setSubcontent(rs.getString(4));
                n.setContent(rs.getString(5));
                n.setDate(rs.getString(6));
                n.setImage(rs.getString(7));
                list.add(n);

            }
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcessHome.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(new DataProcessHome().SearchByTitle("aaa"));
    }

}
