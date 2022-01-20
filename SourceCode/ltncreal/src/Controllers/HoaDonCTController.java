/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.sql.*;
import Models.HoaDonCT;
import Models.KhachHang;
import Models.NhanVien;
import Config.ConnectDB;

import java.util.ArrayList;

/**
 *
 * @author KH
 */
public class HoaDonCTController {

    ConnectDB conn1 = new ConnectDB();

    public HoaDonCTController() {
        conn1.getConnection();
    }

    public void Add(ArrayList<HoaDonCT> list) {
        String sql = "INSERT INTO ltnc_add.hoadonct(IDHoaDon,IDSanPham,SoLuong,TenSanPham,Gia) "
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement statement = conn1.getConnection().prepareStatement(sql);
            int count = 0;

            for (HoaDonCT hd : list) {
                statement.setInt(1, hd.getIDHoaDon());
                statement.setInt(2, hd.getIDSanPham());
                statement.setInt(3, hd.getSoLuong());
                statement.setString(4, hd.getTenSanPham());
                statement.setInt(5, hd.getGia());

                statement.addBatch();
                count++;
                // execute every 1000 rows or less
                if (count % 1000 == 0 || count == list.size()) {
                    statement.executeBatch();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<HoaDonCT> getListById(int id) {
        ArrayList<HoaDonCT> listHDCT = new ArrayList<>();
        String sql = String.format("SELECT * FROM ltnc_add.hoadonct WHERE IDHOADON = %d", id);
        try {
            PreparedStatement statement = conn1.getConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                HoaDonCT hd = new HoaDonCT();
                hd.setIDHoaDon(rs.getInt("IDHoaDon"));
                hd.setIDSanPham(rs.getInt("IDSanPham"));
                hd.setTenSanPham(rs.getString("TenSanPham"));
                hd.setSoLuong(rs.getInt("SoLuong"));
                hd.setGia(rs.getInt("Gia"));
                
                listHDCT.add(hd);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listHDCT;
    }

    public static void main(String[] args) {
        new HoaDonCTController();
    }
}
