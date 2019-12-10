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
public class TTHoaDon {
    private String MaTTHoaDon;
    private String MaHD;
    private String MaDoUong;
    private int SoLuong;

    public TTHoaDon(String MaTTHoaDon, String MaHD, String MaDoUong, int SoLuong) {
        this.MaTTHoaDon = MaTTHoaDon;
        this.MaHD = MaHD;
        this.MaDoUong = MaDoUong;
        this.SoLuong = SoLuong;
    }

    public String getMaTTHoaDon() {
        return MaTTHoaDon;
    }

    public void setMaTTHoaDon(String MaTTHoaDon) {
        this.MaTTHoaDon = MaTTHoaDon;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaDoUong() {
        return MaDoUong;
    }

    public void setMaDoUong(String MaDoUong) {
        this.MaDoUong = MaDoUong;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}
