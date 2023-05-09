/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import db.DBConnection;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.SanBong;
/**
 *
 * @author ADMIN
 */
public class SanBongDAO extends DBConnection{
    public ArrayList<SanBong> searchSan(String key,Date ngayBatdau ,Date ngayKetthuc) throws SQLException {
        Connection cons = DBConnection.getConnection();
        ArrayList<SanBong> result = new ArrayList<SanBong>();
        
        String sql = "select * from SanBong Where khungGio=?  and  maSan NOT IN (SELECT maSan FROM PhieuDatSan WHERE ngayKetthuc > ? AND ngayBatdau < ?)";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, key);
            ps.setString(2, sdf.format(ngayBatdau));
            ps.setString(3, sdf.format(ngayKetthuc));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanBong sanBong= new SanBong();
                sanBong.setMaSan(rs.getString(1));
                sanBong.setLoaiSan(rs.getString(2));
                sanBong.setKhungGio(rs.getString(3));
                sanBong.setGia(rs.getInt(4));
                result.add(sanBong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
