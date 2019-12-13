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
public class TableFood {
    private String IDTable;
    private String NameTable;
    private String Status;

    public TableFood(String IDTable, String NameTable, String Status) {
        this.IDTable = IDTable;
        this.NameTable = NameTable;
        this.Status = Status;
    }
    
    

    public String getIDTable() {
        return IDTable;
    }

    public void setIDTable(String IDTable) {
        this.IDTable = IDTable;
    }

    public String getNameTable() {
        return NameTable;
    }

    public void setNameTable(String NameTable) {
        this.NameTable = NameTable;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}
