
package com.btl.services;

import com.btl.conf.jdbcUtils;
import com.btl.pojo.ViTri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class QuanLyViTri {
    public List<ViTri> getViTri () throws SQLException
    {
        List<ViTri> vt = new ArrayList<>();
        try(Connection connect = jdbcUtils.getConn())
        {
            try (Statement stm = connect.createStatement()) {
                ResultSet rs = stm.executeQuery("SELECT * FROM vitri");
                while(rs.next())
                {
                    int maVT = rs.getInt("idvitri");
                    String viTri = rs.getString("TenKe");
                    
                    vt.add(new ViTri(maVT,viTri));
                }
            }
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyViTri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vt;
    }
    public ViTri getViTri2(int maVT) throws SQLException{
        ViTri vt = new ViTri();
        try (Connection con = jdbcUtils.getConn()){
            String sql = "SELECT * FROM vitri WHERE idvitri = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, maVT);
            ResultSet rs = stm.executeQuery();
            vt.setViTriID(rs.getInt("idvitri"));
            vt.setMaKhu(rs.getInt("MaKhu"));
            vt.setTenKe(rs.getString("TenKe"));
        }
        return vt;
    }
}
