/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DuyNguyen
 */
public class ConnectDB {

    public ConnectDB() {

    }

    public Connection getConnection() {
        Connection conn;
        try {
//            String url="jdbc:mysql://localhost:3306/quanlybanhang";
//            String user="root";
//            String password="123456789";
//            conn=DriverManager.getConnection(url,user,password);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltnc_add?verifyServerCertificate=false&useSSL=true", "root", "123456789");
            if (conn != null) {
                System.out.println("Connected to database successfully");
            }
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        new ConnectDB();
    }
}
