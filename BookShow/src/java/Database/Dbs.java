/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import DTO.Book;
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
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=BooksDB";
            conn = DriverManager.getConnection(url, "sa", "230697");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public boolean AddBooks(String title, String description, String author, float price, String image) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "insert into tblbook values(?,?,?,?,?)";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, title);
            pstm.setString(2, description);
            pstm.setString(3, author);
            pstm.setFloat(4, price);
            pstm.setString(5, image);

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

    public ArrayList<Book> listBook() {
        ArrayList<Book> list = new ArrayList<>();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblbook";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setDescription(rs.getString("description"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getFloat("price"));
                book.setImage(rs.getString("image"));
                list.add(book);
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

    public boolean DeleteBook(int id) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "delete from tblbook where id=?";
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

    public boolean EditBook(int id, String title, String description, String author, float price, String image) {
        int result = 0;
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "update tblbook set title=?,description=?,author=?,price=?,image=? where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, title);
            pstm.setString(2, description);
            pstm.setString(3, author);
            pstm.setFloat(4, price);
            pstm.setString(5, image);
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

    public Book EditListBook(int id) {
        Book book = new Book();
        PreparedStatement pstm = null;
        Connection conn = null;
        try {
            String sql = "select * from tblbook where id=?";
            conn = getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {

                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setDescription(rs.getString("description"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getFloat("price"));
                book.setImage(rs.getString("image"));
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

        return book;
    }
    public static void main(String[] args) {
          if(new Dbs().AddBooks("Book4", "Des4", "au4", 120,"1.jpg")){
              System.out.println("abc");
          }
    }

}
