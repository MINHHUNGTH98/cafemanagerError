/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.Connect;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tranm
 */
public class BillController {

    public void loadDataBill(DefaultTableModel tbnBill,JTable tbBill) {
        try {
            int number;
            Vector row, column;
            column = new Vector();
            Statement statement = Connect.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("Select * From Bill ");
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();

            column.add("Mã hóa đơn");
            column.add("Ngày ");
            column.add("Giờ vào");
            column.add("Giờ ra");
            column.add("Mã bàn");
            column.add("Trạng thái");
            column.add("Giảm giá");
            column.add("Tổng tiền");
            column.add("Nhân viên");
            tbnBill.setColumnIdentifiers(column);

            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                tbnBill.addRow(row);
                tbBill.setModel(tbnBill);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally{
            Connect.close();
        }
    }
}
