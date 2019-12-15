/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.Find;

/**
 *
 * @author tranm
 */
public class SearchController {
    
    public void SearchFoodName(String keyword, DefaultTableModel tbnFood, JTable tbFood)  {
        ResultSet rs = null;
        try {
            Statement statement = Connect.getConnection().createStatement();
            String sql = "select * from Food";
            if (keyword.length() > 0) {
                sql = sql + " where name like '%" + keyword + "%'";
                rs = statement.executeQuery(sql);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Vector data = null;
            tbnFood.setRowCount(0);
            if (rs != null) {
                while (rs.next()) {
                    data = new Vector();
                    data.add(rs.getString("id"));
                    data.add(rs.getString("name"));
                    data.add(rs.getString("price"));
                    // Thêm một dòng vào table model
                    tbnFood.addRow(data);
                }
            } else {
                ;
                }            
            tbFood.setModel(tbnFood);
        } catch (Exception ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SearchFoodCategory(String NameCategory, DefaultTableModel tbnFood, JTable tbFood) {
        ResultSet rs = null;
        try {
            Statement statement = Connect.getConnection().createStatement();
            String IDCategory = null;
            if (NameCategory.equals("Cà phê")) {
                IDCategory = "1";
            }
            if (NameCategory.equals("Sinh tố")) {
                IDCategory = "2";
            }
            if (NameCategory.equals("Nước ép")) {
                IDCategory = "3";
            }
            if (NameCategory.equals("Đá xay")) {
                IDCategory = "4";
            }
            if (NameCategory.equals("Sữa chua")) {
                IDCategory = "5";
            }

            String sql = "select * from Food";
            if (IDCategory.length() > 0) {
                sql = sql + " where idCategory like '%" + IDCategory + "%'";
                rs = statement.executeQuery(sql);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Vector data = null;
            tbnFood.setRowCount(0);
            if (rs != null) {
                while (rs.next()) {
                    data = new Vector();
                    data.add(rs.getString("id"));
                    data.add(rs.getString("name"));
                    data.add(rs.getString("price"));
                    // Thêm một dòng vào table model
                    tbnFood.addRow(data);
                }
            } else {
                ;
                }            
            tbFood.setModel(tbnFood);
        } catch (Exception ex) {
            Logger.getLogger(Find.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet SearchBillUserStaff(String keyword) {
        ResultSet rs = null;
        try {
            Statement statement = Connect.getConnection().createStatement();
            String sql = "select * from Bill";
            if (keyword.length() > 0) {
                sql = sql + " where userStaff like '%" + keyword + "%'";
                rs = statement.executeQuery(sql);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    
}
