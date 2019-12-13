/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Datnv
 */
public class BillInfo {
    private String ID;
    private String IDBill;
    private String IDFood;
    private int Count;

    public BillInfo(String ID, String IDBill, String IDFood, int Count) {
        this.ID = ID;
        this.IDBill = IDBill;
        this.IDFood = IDFood;
        this.Count = Count;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDBill() {
        return IDBill;
    }

    public void setIDBill(String IDBill) {
        this.IDBill = IDBill;
    }

    public String getIDFood() {
        return IDFood;
    }

    public void setIDFood(String IDFood) {
        this.IDFood = IDFood;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    
    
}
