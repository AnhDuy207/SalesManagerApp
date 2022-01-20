/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author KH
 */
public class HoaDon {
    private int ID;
    private int IDKhachHang;
    private int IDNhanVien;
    private String NgayLap;
    private int ThanhTien;

    public HoaDon() {
        
    }

    public HoaDon(String NgayLap, int ThanhTien) {
        this.NgayLap = NgayLap;
        this.ThanhTien = ThanhTien;
    }

    public HoaDon(int IDKhachHang, int IDNhanVien, String NgayLap, int ThanhTien) {
        this.IDKhachHang = IDKhachHang;
        this.IDNhanVien = IDNhanVien;
        this.NgayLap = NgayLap;
        this.ThanhTien = ThanhTien;
    }

    public HoaDon(int ID, int IDKhachHang, int IDNhanVien, String NgayLap, int ThanhTien) {
        this.ID = ID;
        this.IDKhachHang = IDKhachHang;
        this.IDNhanVien = IDNhanVien;
        this.NgayLap = NgayLap;
        this.ThanhTien = ThanhTien;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(int IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public int getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(int IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
}
