/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author KH
 */
public class HoaDonCT {
    private int ID;
    private int IDHoaDon;
    private int IDSanPham;
    private int SoLuong;
    private String TenSanPham;
    private int Gia;

    public HoaDonCT() {
    }

    public HoaDonCT(int IDHoaDon, int IDSanPham, int SoLuong, String TenSanPham, int Gia) {
        this.IDHoaDon = IDHoaDon;
        this.IDSanPham = IDSanPham;
        this.SoLuong = SoLuong;
        this.TenSanPham = TenSanPham;
        this.Gia = Gia;
    }

    public HoaDonCT(int ID, int IDHoaDon, int IDSanPham, int SoLuong, String TenSanPham, int Gia) {
        this.ID = ID;
        this.IDHoaDon = IDHoaDon;
        this.IDSanPham = IDSanPham;
        this.SoLuong = SoLuong;
        this.TenSanPham = TenSanPham;
        this.Gia = Gia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(int IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public int getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(int IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }
    
    
}
