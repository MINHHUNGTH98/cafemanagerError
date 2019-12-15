/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.Connect;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author tranm
 */
public class SearchController {
    
    public ResultSet SearchFoodName(String keyword) {
        ResultSet rs_name = null;
        try {
            Statement statement = Connect.getConnection().createStatement();
            String sql = "select * from Food";
            if (keyword.length() > 0) {
                sql = sql + " where name like '%" + keyword + "%'";
                rs_name = statement.executeQuery(sql);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs_name;
    }

    public ResultSet SearchFoodCategory(String NameCategory) {
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
        return rs;
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
