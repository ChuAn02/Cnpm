/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBConnection;
import model.KhachHang;
import model.SanBong;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.PhieuDatSan;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class PhieuDatSanDAO extends DBConnection {

    public void addBooking(PhieuDatSan phieuDatSan) throws SQLException {
        Connection cons = DBConnection.getConnection();
        String sql = "Insert into PhieuDatSan(  maDS,ngayDS,maKH, maSan,ngayBatdau, ngayKetthuc, soBuoi,tienThue, tienCoc, tienPhat) values(?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, phieuDatSan.getMaDS());
            ps.setDate(2, new java.sql.Date( phieuDatSan.getNgayDS().getTime()));
            
            ps.setString(3, phieuDatSan.getMaKH());
            ps.setString(4, phieuDatSan.getMaSan());
            ps.setDate(5, new java.sql.Date(phieuDatSan.getNgayBatdau().getTime()));
            ps.setDate(6, new java.sql.Date(phieuDatSan.getNgayKetthuc().getTime()));
            ps.setInt(7, phieuDatSan.getSoBuoi());
            ps.setInt(8, phieuDatSan.getTienThue());
            ps.setInt(9, phieuDatSan.getTienCoc());
            
            ps.setInt(10, phieuDatSan.getTienPhat());
            ps.executeUpdate();
            

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
