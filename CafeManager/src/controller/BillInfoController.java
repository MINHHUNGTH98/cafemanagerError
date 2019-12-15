/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.BillInfo;
import Models.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qcuon
 */
public class BillInfoController {
    public static ArrayList<BillInfo> getListBillInfoByIdTable(int idTable){
        ArrayList<BillInfo> listBillInfo = null;
        try {
            Statement statement = Connect.getConnection().createStatement();
            String sql = "select id from Bill where idTable = " + idTable + " and status = 1";
            ResultSet resultSet = statement.executeQuery(sql);
            int idBill = 0;
            while (resultSet.next()) {                
                idBill = resultSet.getInt(1);
            }
            Connect.close();
            statement = Connect.getConnection().createStatement();
            sql = "select * from BillInfo where idBill = " + idBill;
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {                
                int idBillInfo = resultSet.getInt(1);
                int idFood = resultSet.getInt(3);
                int status = resultSet.getInt(4);
                BillInfo billInfo = new BillInfo(idBillInfo, idBill, idFood, status);
                listBillInfo.add(billInfo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillInfoController.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            Connect.close();
        }
        return listBillInfo;
    }
}
