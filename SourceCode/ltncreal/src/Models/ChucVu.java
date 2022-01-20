/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author DuyNguyen
 */
public class ChucVu {
    private int ID;
    private String TenChucVu;

    public ChucVu() {
    }

    public ChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }

    public ChucVu(int ID, String TenChucVu) {
        this.ID = ID;
        this.TenChucVu = TenChucVu;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTenChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }
    
    public int getID() {
        return ID;
    }

    public String getTenChucVu() {
        return TenChucVu;
    }
    
    @Override
    public String toString() {
        return TenChucVu; 
    }
}
