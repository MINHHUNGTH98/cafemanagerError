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
public class Menu {
    private int MaDoUong;
    private String TenDoUong;
    private String MaLoaiDoUong;
    private int DonGia;

    public Menu(int MaDoUong, String TenDoUong, String MaLoaiDoUong, int DonGia) {
        this.MaDoUong = MaDoUong;
        this.TenDoUong = TenDoUong;
        this.MaLoaiDoUong = MaLoaiDoUong;
        this.DonGia = DonGia;
    }

    public int getMaDoUong() {
        return MaDoUong;
    }

    public void setMaDoUong(int MaDoUong) {
        this.MaDoUong = MaDoUong;
    }

    public String getTenDoUong() {
        return TenDoUong;
    }

    public void setTenDoUong(String TenDoUong) {
        this.TenDoUong = TenDoUong;
    }

    public String getMaLoaiDoUong() {
        return MaLoaiDoUong;
    }

    public void setMaLoaiDoUong(String MaLoaiDoUong) {
        this.MaLoaiDoUong = MaLoaiDoUong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }
    
}
