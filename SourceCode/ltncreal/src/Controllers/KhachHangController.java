/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.KhachHang;
import java.sql.*;
import java.util.*;
import Config.ConnectDB;

/**
 *
 * @author KH
 */
public class KhachHangController {

    ConnectDB conn1 = new ConnectDB();
    private String sql;
    private PreparedStatement preState;
    ResultSet result;

    public KhachHangController() {
        conn1.getConnection();
    }

    public static void main(String[] args) {
        new KhachHangController();
    }

    public ArrayList<KhachHang> getList() {
        ArrayList<KhachHang> list = new ArrayList<>();
        sql = "SELECT * FROM `ltnc_add`.`KhachHang`";

        try {
            preState = conn1.getConnection().prepareStatement(sql);
            result = preState.executeQuery();

            while (result.next()) {
                KhachHang kh = new KhachHang();

                kh.setID(result.getInt("ID"));
                kh.setTenKhachHang(result.getString("TenKhachHang"));
                kh.setNgaySinh(result.getString("NgaySinh"));
                kh.setGioiTinh(result.getString("GioiTinh"));
                kh.setDiaChi(result.getString("DiaChi"));
                kh.setSDT(result.getString("SDT"));
                kh.setEmail(result.getString("Email"));

                list.add(kh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void add(KhachHang kh) {
        sql = "INSERT INTO `ltnc_add`.`KhachHang` (`TenKhachHang`,`NgaySinh`,`GioiTinh`,`DiaChi`,`SDT`,`Email`) VALUES"
                + "(?,?,?,?,?,?)";
        try {
            preState = conn1.getConnection().prepareStatement(sql);

            preState.setString(1, kh.getTenKhachHang());
            preState.setString(2, kh.getNgaySinh());
            preState.setString(3, kh.getGioiTinh());
            preState.setString(4, kh.getDiaChi());
            preState.setString(5, kh.getSDT());
            preState.setString(6, kh.getEmail());

            preState.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        sql = "DELETE FROM `ltnc_add`.`KhachHang` WHERE ID = ?";
        try {
            preState = conn1.getConnection().prepareStatement(sql);
            preState.setInt(1, id);

            preState.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(KhachHang kh) {
        sql = "UPDATE `ltnc_add`.`KhachHang` SET `TenKhachHang` = ?, `NgaySinh` = ?, `GioiTinh` = ?, `DiaChi` = ?, `SDT` = ?, `Email` = ?"
                + " WHERE ID = ?";
        try {
            preState = conn1.getConnection().prepareStatement(sql);

            preState.setString(1, kh.getTenKhachHang());
            preState.setString(2, kh.getNgaySinh());
            preState.setString(3, kh.getGioiTinh());
            preState.setString(4, kh.getDiaChi());
            preState.setString(5, kh.getSDT());
            preState.setString(6, kh.getEmail());
            preState.setInt(7, kh.getID());

            preState.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<KhachHang> findByChar(String kyTu) {
        ArrayList<KhachHang> list = new ArrayList<>();
        sql = "SELECT * FROM `ltnc_add`.`KhachHang` WHERE `TenKhachHang` like ? OR `SDT` like ?";

        try {
            preState = conn1.getConnection().prepareStatement(sql);
            preState.setString(1, "%" + kyTu + "%");
            preState.setString(2, "%" + kyTu + "%");
            result = preState.executeQuery();

            while (result.next()) {
                KhachHang kh = new KhachHang();

                kh.setID(result.getInt("ID"));
                kh.setTenKhachHang(result.getString("TenKhachHang"));
                kh.setNgaySinh(result.getString("NgaySinh"));
                kh.setGioiTinh(result.getString("GioiTinh"));
                kh.setDiaChi(result.getString("DiaChi"));
                kh.setSDT(result.getString("SDT"));
                kh.setEmail(result.getString("Email"));

                list.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public KhachHang findByID(int ID) {
        KhachHang kh = new KhachHang();
        sql = "SELECT * FROM `ltnc_add`.`KhachHang` WHERE `ID` = ?";

        try {
            preState = conn1.getConnection().prepareStatement(sql);
            preState.setInt(1, ID);
            result = preState.executeQuery();

            result.next();

            kh.setID(result.getInt("ID"));
            kh.setTenKhachHang(result.getString("TenKhachHang"));
            kh.setNgaySinh(result.getString("NgaySinh"));
            kh.setGioiTinh(result.getString("GioiTinh"));
            kh.setDiaChi(result.getString("DiaChi"));
            kh.setSDT(result.getString("SDT"));
            kh.setEmail(result.getString("Email"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }
}
