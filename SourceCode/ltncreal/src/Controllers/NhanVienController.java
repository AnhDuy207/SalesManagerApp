/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Models.NhanVien;
import Config.ConnectDB;

/**
 *
 * @author ADMIN
 */
public class NhanVienController {

    ConnectDB conn1 = new ConnectDB();
    private PreparedStatement preState;
    ResultSet result;

    public NhanVienController() {
        conn1.getConnection();
    }

    public ArrayList<NhanVien> getListStaff() {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM ltnc_add.nhanvien";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien a = new NhanVien();
                a.setID(rs.getInt("ID"));
                a.setMaNhanVien(rs.getString("MaNhanVien"));
                a.setTenNhanVien(rs.getString("TenNhanVien"));
                a.setGioiTinh(rs.getString("GioiTinh"));
                a.setIDChucVu(rs.getInt("IDChucVu"));
                a.setNgaySinh(rs.getString("NgaySinh"));
                a.setDiaChi(rs.getString("DiaChi"));
                a.setSDT(rs.getString("SDT"));
                a.setEmail(rs.getString("Email"));
                a.setLuong(rs.getInt("Luong"));
                list.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void AddStaff(NhanVien a) {
        String sql = "INSERT INTO ltnc_add.nhanvien (MaNhanVien, TenNhanVien , IDChucVu , NgaySinh , GioiTinh , DiaChi , SDT , Email , Luong)"
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setString(1, a.getMaNhanVien());
            ps.setString(2, a.getTenNhanVien());
            ps.setInt(3, a.getIDChucVu());
            ps.setString(4, a.getNgaySinh());
            ps.setString(5, a.getGioiTinh());
            ps.setString(6, a.getDiaChi());
            ps.setString(7, a.getSDT());
            ps.setString(8, a.getEmail());
            ps.setInt(9, a.getLuong());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteStaff(int id) {
        String sql = "DELETE FROM ltnc_add.nhanvien WHERE ID=?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareCall(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Update(NhanVien a) {
        String sql = "UPDATE ltnc_add.nhanvien SET MaNhanVien=?, TenNhanVien=? , IDChucVu=? , NgaySinh=? , GioiTinh=? , DiaChi=? , SDT=? , Email=? , Luong=? WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareCall(sql);
            ps.setString(1, a.getMaNhanVien());
            ps.setString(2, a.getTenNhanVien());
            ps.setInt(3, a.getIDChucVu());
            ps.setString(4, a.getNgaySinh());
            ps.setString(5, a.getGioiTinh());
            ps.setString(6, a.getDiaChi());
            ps.setString(7, a.getSDT());
            ps.setString(8, a.getEmail());
            ps.setInt(9, a.getLuong());
            ps.setInt(10, a.getID());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<NhanVien> findByName(String name) {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "SELECT * FROM `ltnc_add`.`nhanvien` WHERE `TenNhanVien` like ? OR `SDT` like ?";

        try {
            preState = conn1.getConnection().prepareStatement(sql);
            preState.setString(1, "%" + name + "%");
            preState.setString(2, "%" + name + "%");
            result = preState.executeQuery();

            while (result.next()) {
                NhanVien a = new NhanVien();
                a.setID(result.getInt("ID"));
                a.setMaNhanVien(result.getString("MaNhanVien"));
                a.setTenNhanVien(result.getString("TenNhanVien"));
                a.setIDChucVu(result.getInt("IDChucVu"));
                a.setNgaySinh(result.getString("NgaySinh"));
                a.setGioiTinh(result.getString("GioiTinh"));
                a.setDiaChi(result.getString("DiaChi"));
                a.setSDT(result.getString("SDT"));
                a.setEmail(result.getString("Email"));
                a.setLuong(result.getInt("Luong"));
                list.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public NhanVien findByID(int ID) {
        NhanVien a = new NhanVien();
        String sql = "SELECT * FROM `ltnc_add`.`nhanvien` WHERE `ID` = ?";

        try {
            preState = conn1.getConnection().prepareStatement(sql);
            preState.setInt(1, ID);
            result = preState.executeQuery();

            result.next();

            a.setID(result.getInt("ID"));
            a.setMaNhanVien(result.getString("MaNhanVien"));
            a.setTenNhanVien(result.getString("TenNhanVien"));
            a.setIDChucVu(result.getInt("IDChucVu"));
            a.setNgaySinh(result.getString("NgaySinh"));
            a.setGioiTinh(result.getString("GioiTinh"));
            a.setDiaChi(result.getString("DiaChi"));
            a.setSDT(result.getString("SDT"));
            a.setEmail(result.getString("Email"));
            a.setLuong(result.getInt("Luong"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    public static void main(String[] args) {
        new NhanVienController();
    }

}
