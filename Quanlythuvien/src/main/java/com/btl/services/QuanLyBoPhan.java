
package com.btl.services;

import com.btl.conf.jdbcUtils;
import com.btl.pojo.BoPhan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class QuanLyBoPhan {
    public List<BoPhan> getBoPhan() {
        List<BoPhan> kq = new ArrayList<>();
        
        Connection conn;
        try {
            conn = jdbcUtils.getConn();
            
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM bophan");
            
            while (rs.next()) {
                int id = rs.getInt("idbophan");
                String name = rs.getString("BoPhan");
                
                kq.add(new BoPhan(id, name));
            }
            
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyBoPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kq;
    }
}
