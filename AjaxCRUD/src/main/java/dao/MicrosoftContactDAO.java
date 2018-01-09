/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controller.ContactController;
import dto.Contact;
import iconnectdb.MicrosoftDAOFactory;
import iconnectdb.idao.ContactDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MacOS
 */
public class MicrosoftContactDAO implements ContactDAO {

    private static MicrosoftContactDAO instance = null;

    public static MicrosoftContactDAO getIntance() {
        if (instance == null) {
            instance = new MicrosoftContactDAO();
        }
        return instance;
    }

    @Override
    public int insertContact(Contact c) {
        int result = 0;
        Connection conn = null;
        CallableStatement cStmt = null;
        String sql = "{?=Call insertContact(?,?,?)}";
        try {
            conn = MicrosoftDAOFactory.createConnection();
            cStmt = conn.prepareCall(sql);
            cStmt.registerOutParameter(1, Types.INTEGER);
            cStmt.setString(2, c.getName());
            cStmt.setString(3, c.getAge());
            cStmt.setString(4, c.getAddress());

            cStmt.execute();
            result = cStmt.getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (cStmt != null) {
                try {
                    cStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return result;
    }

    @Override
    public boolean deleteContact(int id) {
        int result = 0;
        Connection conn = null;
        CallableStatement cStmt = null;
        String sql = "{?=Call deleteContact(?)}";
        try {
            conn = MicrosoftDAOFactory.createConnection();
            cStmt = conn.prepareCall(sql);
            cStmt.registerOutParameter(1, Types.INTEGER);
            cStmt.setInt(2, id);

            cStmt.execute();
            result = cStmt.getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (cStmt != null) {
                try {
                    cStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return result == 1;

    }

    @Override
    public boolean updateContact(Contact c, int id) {
        int result = 0;
        Connection conn = null;
        CallableStatement cStmt = null;
        String sql = "{?=Call updateContact(?,?,?,?)}";

        try {

            conn = MicrosoftDAOFactory.createConnection();
            cStmt = conn.prepareCall(sql);
            cStmt.registerOutParameter(1, Types.INTEGER);
            cStmt.setString(2, c.getName());
            cStmt.setString(3, c.getAge());
            cStmt.setString(4, c.getAddress());
            cStmt.setInt(5, id);

            cStmt.execute();
            result = cStmt.getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (cStmt != null) {
                try {
                    cStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return result == 1;

    }

    @Override
    public Contact getNewContact() {
        Contact c = new Contact();
        Connection conn = null;
        CallableStatement cStmt = null;
        String sql = "{Call newContact}";

        try {

            conn = MicrosoftDAOFactory.createConnection();
            cStmt = conn.prepareCall(sql);

            ResultSet rs = cStmt.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setAge(rs.getString(3));
                c.setAddress(rs.getString(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (cStmt != null) {
                try {
                    cStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return c;

    }

    @Override
    public ArrayList<Contact> searchContact(String keysearch, String key) {
        ArrayList<Contact> arrContact = new ArrayList<>();
        Connection conn = null;
        CallableStatement cStmt = null;
        String sql = "{Call searchContact(?,?,?)}";

        try {
            conn = MicrosoftDAOFactory.createConnection();
            cStmt = conn.prepareCall(sql);

            if (key.equals("name")) {
                cStmt.setString(1, keysearch);
                cStmt.setString(2, null);
                cStmt.setString(3, null);

                ResultSet rs = cStmt.executeQuery();
                while (rs.next()) {
                    Contact c = new Contact();
                    c.setId(rs.getInt(1));
                    c.setName(rs.getString(2));
                    c.setAge(rs.getString(3));
                    c.setAddress(rs.getString(4));
                    arrContact.add(c);
                }
            }
            if (key.equals("age")) {
                cStmt.setString(1, null);
                cStmt.setString(2, keysearch);
                cStmt.setString(3, null);

                ResultSet rs = cStmt.executeQuery();
                while (rs.next()) {
                    Contact c = new Contact();
                    c.setId(rs.getInt(1));
                    c.setName(rs.getString(2));
                    c.setAge(rs.getString(3));
                    c.setAddress(rs.getString(4));
                    arrContact.add(c);
                }
            }

            if (key.equals("address")) {
                cStmt.setString(1, null);
                cStmt.setString(2, null);
                cStmt.setString(3, keysearch);

                ResultSet rs = cStmt.executeQuery();
                while (rs.next()) {
                    Contact c = new Contact();
                    c.setId(rs.getInt(1));
                    c.setName(rs.getString(2));
                    c.setAge(rs.getString(3));
                    c.setAddress(rs.getString(4));
                    arrContact.add(c);
                }
            }

            if (key.equals("null")) {
                cStmt.setString(1, null);
                cStmt.setString(2, null);
                cStmt.setString(3, null);

                ResultSet rs = cStmt.executeQuery();

                while (rs.next()) {
                    Contact c = new Contact();
                    c.setId(rs.getInt(1));
                    c.setName(rs.getString(2));
                    c.setAge(rs.getString(3));
                    c.setAddress(rs.getString(4));
                    arrContact.add(c);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (cStmt != null) {
                try {
                    cStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return arrContact;

    }

    @Override
    public Contact viewDetail(int id) {
        Contact c = new Contact();
        Connection conn = null;
        CallableStatement cStmt = null;
        String sql = "{Call viewDetail(?)}";

        try {

            conn = MicrosoftDAOFactory.createConnection();
            cStmt = conn.prepareCall(sql);
            
            cStmt.setInt(1, id);

            ResultSet rs = cStmt.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setAge(rs.getString(3));
                c.setAddress(rs.getString(4));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            if (cStmt != null) {
                try {
                    cStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MicrosoftContactDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        return c;

    }

}
