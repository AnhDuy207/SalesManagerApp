/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Config.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import Models.HoaDon;
/**
 *
 * @author DuyNguyen
 */
public class HoaDonController {

    ConnectDB conn1 = new ConnectDB();

    public HoaDonController() {
        conn1.getConnection();
    }

    //Lấy dữ liệu từ darabase ra
    public ArrayList<HoaDon> getlistHD() {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "SELECT * FROM ltnc_add.hoadon";
        try {
            //PreparedStatement trong java là một sub-interface của Statement. Nó được sử dụng để thực hiện truy vấn tham số.
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            //Đối tượng của ResultSet duy trì một con trỏ trỏ đến một hàng của một bảng. Ban đầu, con trỏ trỏ đến hàng đầu tiên.
            //ResultSet executeQuery (String SQL): Trả về một đối tượng ResultSet khi bạn thực thi câu lệnh SELECT.
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon s = new HoaDon();
                s.setID(rs.getInt("ID"));
                s.setIDKhachHang(rs.getInt("IDKhachHang"));
                s.setIDNhanVien(rs.getInt("IDNhanVien"));
                s.setNgayLap(rs.getString("NgayLap"));
                s.setThanhTien(rs.getInt("ThanhTien"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int AddHD(HoaDon hd) {
        String sql = "INSERT INTO ltnc_add.hoadon(IDKhachHang, IDNhanVien, NgayLap, ThanhTien)  VALUES (?, ?, ?, ?)";
        int id = 0;
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //setString(int paramIndex, String value)->đặt giá trị String cho chỉ số tham số đã cho.
            ps.setInt(1, hd.getIDKhachHang());
            ps.setInt(2, hd.getIDNhanVien());
            ps.setString(3, hd.getNgayLap());
            ps.setInt(4, hd.getThanhTien());

            ps.executeUpdate();
            ResultSet generatedKeysResultSet = ps.getGeneratedKeys();
            generatedKeysResultSet.next();
            id = generatedKeysResultSet.getInt(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public void DeleteHD(int id) {
        String sql = "DELETE FROM ltnc_add.hoadon WHERE ID = ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<HoaDon> findbyDate(String date) {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "SELECT * FROM ltnc_add.hoadon WHERE NgayLap like ?";
        try {
            PreparedStatement ps = conn1.getConnection().prepareStatement(sql);
            ps.setString(1, "%" + date + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setID(rs.getInt("ID"));
                hd.setNgayLap(rs.getString("NgayLap"));
                hd.setThanhTien(rs.getInt("ThanhTien"));
                list.add(hd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<HoaDon> findById(int id) {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = String.format("SELECT * FROM ltnc_add.hoadon WHERE IDKhachHang = %d", id);
        try {
            PreparedStatement statement = conn1.getConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setID(rs.getInt("ID"));
                hd.setIDKhachHang(rs.getInt("IDKhachHang"));
                hd.setIDNhanVien(rs.getInt("IDNhanVien"));
                hd.setNgayLap(rs.getString("NgayLap"));
                hd.setThanhTien(rs.getInt("ThanhTien"));
                
                list.add(hd);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static void main(String[] args) {
        new HoaDonController();
    }

}
