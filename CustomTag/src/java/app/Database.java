/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MacOS
 */
public class Database {

    public static Connection getConnection(String db) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=" + db, "sa", "230697");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public ArrayList<Book> tableBook(String db, String table, int row, String rowname) {
        ArrayList<Book> list = new ArrayList<>();
        try {
            ArrayList<String> rowi = new ArrayList<>();
            for (String strrow : rowname.split(",")) {
                rowi.add(strrow);
            }
            Connection conn = Database.getConnection(db);
            Statement stmt = conn.createStatement();
            String sql = "select top(" + row + ") id,title,description,author,price,image from tblbook";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Book b = new Book();
                for (String s : rowi) {
                    int i = Integer.valueOf(s);
                    switch (i) {
                        case 1:
                            b.setId(rs.getInt(1));
                            break;
                        case 2:
                            b.setTitle(rs.getString(2));
                            break;
                        case 3:
                            b.setDes(rs.getString(3));
                            break;
                        case 4:
                            b.setAuthor(rs.getString(4));
                            break;
                        case 5:
                            b.setPrice(rs.getDouble(5));
                            break;
                        case 6:
                            b.setImage(rs.getString(6));
                            break;
                    }
                }
                 list.add(b);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
