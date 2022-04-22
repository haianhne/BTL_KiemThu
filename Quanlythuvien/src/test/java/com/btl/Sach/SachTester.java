/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.Sach;

import com.btl.conf.jdbcUtils;
import com.btl.docgia.DocGiaTester;
import com.btl.pojo.DocGia;
import com.btl.pojo.Sach;
import com.btl.pojo.TacGia;
import com.btl.services.QuanLyDanhMuc;
import com.btl.services.QuanLyTacGia;
import com.btl.services.QuanLyViTri;
import com.btl.services.QuanLySach;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author DELL
 */
public class SachTester {
    
    QuanLySach sachService = new QuanLySach();
    QuanLyTacGia tacGiaService = new QuanLyTacGia();
    QuanLyDanhMuc danhMucService = new QuanLyDanhMuc();
    QuanLyViTri viTriService = new QuanLyViTri();
    
    private static Connection conn;
   @BeforeAll
   public static void beforeAll() throws SQLException{
       conn = jdbcUtils.getConn ();
   }
   @AfterAll
   public static void afterAll() throws SQLException{
       if(conn != null)
           conn.close();
   }
   
    @Test 
   public void TestSachIDInvlid() {
       Sach s;
       try {
           s = sachService.get1Sach("8");
           Assertions.assertNull(s);
       } catch (SQLException ex) {
           Logger.getLogger(SachTester.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   @Test 
   public void TestSachIDValid() {
       Sach s;
       try {
           s = sachService.get1Sach("1");
           Assertions.assertEquals(s.getTenSach(),"Cấu trúc dữ liệu");
           Assertions.assertEquals(s.getNamXuatBan(),2021);
           Assertions.assertEquals(s.getDanhMuc(),"CNTT");
           Assertions.assertEquals(s.getNoiXuatBan(),"Thông tin truyền thông");
       } catch (SQLException ex) {
           Logger.getLogger(SachTester.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
           
//   @Test
//   public void themSachTest() throws SQLException
//   {
//        Sach s = new Sach();
//        TacGia tg = new TacGia();
//        s.setMaSach(9);
//        s.setTenSach("Trẻ em");
//        s.setMoTa("hấp dẫn");
//        s.setNamXuatBan(2020);
//        s.setNoiXuatBan("TPHCM");
//        s.setMaDanhMuc(4);
//        s.setMaViTri(5);
//        s.setSoLuong(100);
//        tg.setIdSach(9);
//        tg.setTenTacGia("Lê Lai");
//        int a = sachService.getSach(null).size();
//        int b = tacGiaService.getTG(null).size();
//        sachService.addSach(s);
//        tacGiaService.addTG(tg);
//        Assertions.assertEquals(a + 1, sachService.getSach(null).size());
//        Assertions.assertEquals(b + 1, tacGiaService.getTG(null).size());
//   }

//    @Test
//    public void suaSachTest() throws SQLException{
//       Sach s = sachService.get1Sach("4");
//       s.setNamXuatBan(2018);
//       sachService.updateSach(s);
//       Assertions.assertEquals(2018, sachService.get1Sach("4").getNamXuatBan());
//    }
   
//    @Test
//    public void xoaSachTest() throws SQLException{
//       sachService = new QuanLySach();
//       tacGiaService = new QLTacGia();
//       int a = sachService.getSach(null).size();
//       int b = tacGiaService.getTG(null).size();
//       tacGiaService.delTG(maSach);
//       sachService.delSach(maSach);
//       
//       Assertions.assertEquals(b - 1, tacGiaService.getTG(null).size());
//       Assertions.assertEquals(a - 1, sachService.getSach(null).size());
//    }
   @Test
   public void tenSachTrung() throws SQLException{
       Statement stm = conn.createStatement();
       ResultSet rs = stm.executeQuery("SELECT * FROM sach");
       List<String> kq = new ArrayList<>();
       while(rs.next())
       {
           String tenSach = rs.getString("TenSach");
           System.out.println(tenSach);
           kq.add(tenSach);
           
       }
       Set<String> kq2 = new HashSet<>(kq);
       Assertions.assertEquals(kq.size(), kq2.size());
   }
}
