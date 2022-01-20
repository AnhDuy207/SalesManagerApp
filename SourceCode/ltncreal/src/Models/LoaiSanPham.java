/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author DuyNguyen
 */
public class LoaiSanPham {
    private int ID;
    private String TenLoaiSanPham;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String TenLoaiSanPham) {
        this.TenLoaiSanPham = TenLoaiSanPham;
    }

    public LoaiSanPham(int ID, String TenLoaiSanPham) {
        this.ID = ID;
        this.TenLoaiSanPham = TenLoaiSanPham;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTenLoaiSanPham(String TenLoaiSanPham) {
        this.TenLoaiSanPham = TenLoaiSanPham;
    }
    
    public int getID() {
        return ID;
    }

    public String getTenLoaiSanPham() {
        return TenLoaiSanPham;
    }

    @Override
    public String toString() {
        return TenLoaiSanPham; 
    }
}
