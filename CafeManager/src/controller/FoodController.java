package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class FoodController {

    public int AddFood(String FoodName, String NameCategory, String Price) {
        try {
            if (FoodName.equals("") || Price.equals("")) {
                return 0;
            } else {
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
                PreparedStatement prestatement = Connect.getConnection().prepareStatement("insert dbo.Food (name, idCategory, price) values(?,?,?)");
                prestatement.setString(1, FoodName);
                prestatement.setString(2, IDCategory);
                prestatement.setString(3, Price);
                int check = prestatement.executeUpdate();
                return check;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }

    public void EditFood(String Id, String FoodName, String NameCategory, String Price) {
        try {
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
            PreparedStatement prestatement = Connect.getConnection().prepareStatement("update Food set name=?,idCategory=?,price=? where Id=?");
            prestatement.setString(4, Id);
            prestatement.setString(1, FoodName);
            prestatement.setString(2, IDCategory);
            prestatement.setString(3, Price);
            prestatement.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public void DeleteFood(String Id) {
        try {
            PreparedStatement prestatement = Connect.getConnection().prepareStatement("Delete FROM Food where id=?");
            prestatement.setString(1, Id);
            prestatement.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
}
