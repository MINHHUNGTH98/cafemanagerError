/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import static Models.Time.showTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Datnv
 */
public class HoaDon {
    private String MaHD;
    private String TrangThai;
    private int Discout;
    private int TongTien;
    private String TenNV;
    private String MaBan;
    private String TimeCheckIn;
    private String TimeCheckOut;
   

    public HoaDon(String MaHD, String TrangThai, int Discout, int TongTien, String TenNV, String MaBan, String TimeCheckIn, String TimeCheckOut) {
        this.MaHD = MaHD;
        this.TrangThai = TrangThai;
        this.Discout = Discout;
        this.TongTien = TongTien;
        this.TenNV = TenNV;
        this.MaBan = MaBan;
        this.TimeCheckIn = TimeCheckIn;
        this.TimeCheckOut = TimeCheckOut;
        
    }
    public static void TimeCheckIn(){
        Calendar c = Calendar.getInstance();
//        showTime(c);
            Time t= new Time();
            t.showTime(c);
    }
    
    public String getTimeCheckIn(){
        return TimeCheckIn;
    }
    
    public String getTimeCheckOut(){
        return TimeCheckOut;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getDiscout() {
        return Discout;
    }

    public void setDiscout(int Discout) {
        this.Discout = Discout;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }
    
    public void setTimeCheckIn(String TimeCheckIn){
        this.TimeCheckIn=TimeCheckIn;
    }
    public void setTimeCheckOut(String TimeCheckOut){
        this.TimeCheckOut=TimeCheckOut;
         
    }

    
    
    
}
