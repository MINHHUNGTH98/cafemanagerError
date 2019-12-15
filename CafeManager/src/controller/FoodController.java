package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

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

    public void loadComobox(JComboBox cbCategory) {
        try {
            PreparedStatement ps = Connect.getConnection().prepareStatement("Select name from FoodCategory ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbCategory.addItem(rs.getString("name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void loadData(DefaultTableModel tbnFood, JTable tbFood, JTextField txtIdFood, JTextField tfUnitFood, JTextField tfNameFood, JComboBox cbCategory) {
        try {
            int number;
            Vector row, column;
            column = new Vector();
            Statement statement = Connect.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("SELECT Food.id, Food.name,food.price,FoodCategory.name FROM Food, FoodCategory WHERE Food.idCategory = FoodCategory.id;");
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();

            for (int i = 1; i <= number; i++) {
                column.add(metadata.getColumnName(i));
            }
            tbnFood.setColumnIdentifiers(column);

            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                tbnFood.addRow(row);
                tbFood.setModel(tbnFood);
            }

            tbFood.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (tbFood.getSelectedRow() >= 0) {
                        txtIdFood.setText(tbFood.getValueAt(tbFood.getSelectedRow(), 0) + "");
                        tfNameFood.setText(tbFood.getValueAt(tbFood.getSelectedRow(), 1) + "");
                        tfUnitFood.setText(tbFood.getValueAt(tbFood.getSelectedRow(), 2) + "");
                        cbCategory.setSelectedItem(tbFood.getModel().getValueAt(tbFood.getSelectedRow(), 3) + "");
                    }
                }
            });
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
}
