/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Config.ConnectDB;
import Models.LoaiSanPham;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author DuyNguyen
 */
public class LoaiSanPhamController {
    ConnectDB conn1 = new ConnectDB();

    public LoaiSanPhamController() {
        conn1.getConnection();
    }

    public ArrayList<LoaiSanPham> getlistSP() {
        ArrayList<LoaiSanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM ltnc_add.loaisanpham";
        try {
            //PreparedStatement trong java là một sub-interface của Statement. Nó được sử dụng để thực hiện truy vấn tham số.
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //Đối tượng của ResultSet duy trì một con trỏ trỏ đến một hàng của một bảng. Ban đầu, con trỏ trỏ đến hàng đầu tiên.
            //ResultSet executeQuery (String SQL): Trả về một đối tượng ResultSet khi bạn thực thi câu lệnh SELECT.
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham();
                lsp.setID(rs.getInt("ID"));
                lsp.setTenLoaiSanPham(rs.getString("TenLoaiSanPham"));
                list.add(lsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public LoaiSanPham GetById(int id) {
        LoaiSanPham lsp = new LoaiSanPham();
        String sql = "SELECT * FROM ltnc_add.loaisanpham WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lsp.setID(rs.getInt("ID"));
                lsp.setTenLoaiSanPham(rs.getString("TenLoaiSanPham"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lsp;
    }
    
    public void Add(LoaiSanPham lsp) {
        String sql = "INSERT INTO ltnc_add.loaisanpham(TenLoaiSanPham)  VALUES (?)";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //setString(int paramIndex, String value)->đặt giá trị String cho chỉ số tham số đã cho.
            ps.setString(1, lsp.getTenLoaiSanPham());
            //executeUpdate: thực hiện truy vấn. Nó được sử dụng để create, drop, insert, update, delete, vv.
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Delete(int id) {
        String sql = "DELETE FROM ltnc_add.loaisanpham WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Update(LoaiSanPham lsp) {
        String sql = "UPDATE ltnc_add.loaisanpham SET TenLoaiSanPham = ? WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //setString(int paramIndex, String value)->đặt giá trị String cho chỉ số tham số đã cho.
            ps.setString(1, lsp.getTenLoaiSanPham());
            ps.setInt(2, lsp.getID());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<LoaiSanPham> findByChar(String kyTu) {
        ArrayList<LoaiSanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM ltnc_add.loaisanpham WHERE TenLoaiSanPham like ? OR ID like ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + kyTu + "%");
            ps.setString(2, "%" + kyTu + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSanPham lsp = new LoaiSanPham();
                lsp.setID(rs.getInt("ID"));
                lsp.setTenLoaiSanPham(rs.getString("TenLoaiSanPham"));
                list.add(lsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        new LoaiSanPhamController();
    }
}
