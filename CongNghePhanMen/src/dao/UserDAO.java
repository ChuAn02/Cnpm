/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import db.DBConnection;
import java.util.ArrayList;
import model.User;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class UserDAO extends DBConnection {
    public boolean checkLogin(User user) throws SQLException {
        boolean result = false;
        Connection cons = DBConnection.getConnection();
        String sql = "SELECT chucVu FROM [User] WHERE maUser = ? AND passWord =  ?";
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, user.getMaUser());
            ps.setString(2, user.getPassWord());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                
                user.setChucVu(rs.getString(1));
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
