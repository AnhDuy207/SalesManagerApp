/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author DuyNguyen
 */
public class SanPham {

    private int ID;
    private String MaSanPham, TenSanPham;
    private int SoLuong, Gia, IDLoaiSanPham;

    public SanPham() {
    }

    public SanPham(String MaSanPham, String TenSanPham, int IDLoaiSanPham, int SoLuong, int Gia) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.IDLoaiSanPham = IDLoaiSanPham;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public SanPham(int ID, String MaSanPham, String TenSanPham, int IDLoaiSanPham, int SoLuong, int Gia) {
        this.ID = ID;
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.IDLoaiSanPham = IDLoaiSanPham;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getIDLoaiSanPham() {
        return IDLoaiSanPham;
    }

    public void setIDLoaiSanPham(int IDLoaiSanPham) {
        this.IDLoaiSanPham = IDLoaiSanPham;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

}
