
package com.btl.services;

import com.btl.conf.jdbcUtils;
import com.btl.pojo.DoiTuong;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class QuanLyDoiTuong {
    public List<DoiTuong> getDoiTuong() {
        List<DoiTuong> kq = new ArrayList<>();
        
        Connection conn;
        try {
            conn = jdbcUtils.getConn();
            
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM doituong");
            
            while (rs.next()) {
                int id = rs.getInt("iddoituong");
                String name = rs.getString("DoiTuong");
                
                kq.add(new DoiTuong(id, name));
            }
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kq;
    }
}
