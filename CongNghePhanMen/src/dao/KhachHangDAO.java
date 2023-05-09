/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBConnection;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.KhachHang;
import db.DBConnection;
import java.security.interfaces.RSAKey;

/**
 *
 * @author ADMIN
 */
public class KhachHangDAO extends DBConnection {

    public ArrayList<KhachHang> searchKhachHang(String key) throws SQLException {
        Connection cons = DBConnection.getConnection();
        ArrayList<KhachHang> result = new ArrayList<KhachHang>();

        String sql = "SELECT * FROM KhachHang WHERE tenKH LIKE ?";
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKH(rs.getString(1));
                khachHang.setTenKH(rs.getString(2));
                khachHang.setSdt(rs.getString(3));
                khachHang.setDiaChi(rs.getString(4));
                result.add(khachHang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addClient(KhachHang khachHang) {
        String sql = "INSERT INTO KhachHang(maKH,tenKH,sdt,diaChi) values(?,?,?,?)";
try {
    Connection cons = DBConnection.getConnection();
            PreparedStatement ps = cons.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, khachHang.getMaKH());
            ps.setString(2, khachHang.getTenKH());
            ps.setString(3, khachHang.getSdt());
            ps.setString(4, khachHang.getDiaChi());
            ps.executeUpdate();
            ResultSet generatedKeys = ps.getGeneratedKeys();
            int id=0;
            if  (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            }
            ps.close();
            generatedKeys.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
