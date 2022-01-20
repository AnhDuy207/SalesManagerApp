/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private int ID, Luong;
    private String MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, DiaChi, SDT, Email;
    private int IDChucVu;

    public NhanVien() {
    }

    public NhanVien(int Luong, String MaNhanVien, String TenNhanVien, int IDChucVu, String NgaySinh, String GioiTinh, String DiaChi, String SDT, String Email) {
        this.Luong = Luong;
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.IDChucVu = IDChucVu;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
    }
    
    
    public NhanVien(int ID, int Luong, String MaNhanVien, String TenNhanVien, int IDChucVu, String NgaySinh, String GioiTinh, String DiaChi, String SDT, String Email) {
        this.ID = ID;
        this.Luong = Luong;
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.IDChucVu = IDChucVu;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public int getIDChucVu() {
        return IDChucVu;
    }

    public void setIDChucVu(int IDChucVu) {
        this.IDChucVu = IDChucVu;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
     
    @Override
    public String toString() {
        return MaNhanVien;
    }
}
