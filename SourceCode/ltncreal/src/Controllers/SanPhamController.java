/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Config.ConnectDB;
import Models.HoaDonCT;
import java.sql.*;
import java.util.ArrayList;
import Models.SanPham;

/**
 *
 * @author DuyNguyen
 */
public class SanPhamController {

    ConnectDB conn1 = new ConnectDB();

    public SanPhamController() {
        conn1.getConnection();
    }

    public ArrayList<SanPham> getlistSP() {
        ArrayList<SanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM ltnc_add.sanpham";
        try {
            //PreparedStatement trong java là một sub-interface của Statement. Nó được sử dụng để thực hiện truy vấn tham số.
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //Đối tượng của ResultSet duy trì một con trỏ trỏ đến một hàng của một bảng. Ban đầu, con trỏ trỏ đến hàng đầu tiên.
            //ResultSet executeQuery (String SQL): Trả về một đối tượng ResultSet khi bạn thực thi câu lệnh SELECT.
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setID(rs.getInt("ID"));
                sp.setMaSanPham(rs.getString("MaSanPham"));
                sp.setTenSanPham(rs.getString("TenSanPham"));
                sp.setIDLoaiSanPham(rs.getInt("IDLoaiSanPham"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setGia(rs.getInt("Gia"));
                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void AddSP(SanPham sp) {
        String sql = "INSERT INTO ltnc_add.sanpham(MaSanPham, TenSanPham, IDLoaiSanPham, SoLuong, Gia)  VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //setString(int paramIndex, String value)->đặt giá trị String cho chỉ số tham số đã cho.
            ps.setString(1, sp.getMaSanPham());
            ps.setString(2, sp.getTenSanPham());
            ps.setInt(3, sp.getIDLoaiSanPham());
            ps.setInt(4, sp.getSoLuong());
            ps.setInt(5, sp.getGia());
            //executeUpdate: thực hiện truy vấn. Nó được sử dụng để create, drop, insert, update, delete, vv.
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteSP(int id) {
        String sql = "DELETE FROM ltnc_add.sanpham WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Update(SanPham sp) {
        String sql = "UPDATE ltnc_add.sanpham SET MaSanPham = ?, TenSanPham = ?, IDLoaiSanPham = ?, SoLuong = ?, Gia = ? WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //setString(int paramIndex, String value)->đặt giá trị String cho chỉ số tham số đã cho.
            ps.setString(1, sp.getMaSanPham());
            ps.setString(2, sp.getTenSanPham());
            ps.setInt(3, sp.getIDLoaiSanPham());
            ps.setInt(4, sp.getSoLuong());
            ps.setInt(5, sp.getGia());
            ps.setInt(6, sp.getID());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<SanPham> findByChar(String kyTu) {
        ArrayList<SanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM ltnc_add.sanpham WHERE TenSanPham like ? OR MaSanPham like ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + kyTu + "%");
            ps.setString(2, "%" + kyTu + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setID(rs.getInt("ID"));
                sp.setMaSanPham(rs.getString("MaSanPham"));
                sp.setTenSanPham(rs.getString("TenSanPham"));
                sp.setIDLoaiSanPham(rs.getInt("IDLoaiSanPham"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setGia(rs.getInt("Gia"));
                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void UpdateQuantity(ArrayList<HoaDonCT> list) {
        for (HoaDonCT hdct : list) {
            //String sql = "SELECT x AS SoLuong FROM ltnc_add.sanpham WHERE ID = ?";
            String sql = "SELECT SoLuong FROM ltnc_add.sanpham WHERE ID = ?";
            try {
                PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
                ps.setInt(1, hdct.getIDSanPham());
                ResultSet rs = ps.executeQuery();

                int soLuong = 0;
                while (rs.next()) {
                    soLuong = rs.getInt("SoLuong");
                    //1??? vì nó là cột đầu tiên và duy nhất trong ResultSet
                    //soLuong = rs.getInt(1);
                }

                soLuong -= hdct.getSoLuong();
                String sql2 = "UPDATE ltnc_add.sanpham SET SoLuong = ? WHERE ID = ?";
                try {
                    ps = conn1.getConnection().prepareStatement(sql2);
                    ps.setInt(1, soLuong);
                    ps.setInt(2, hdct.getIDSanPham());
                    ps.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SanPhamController();
    }
}
