/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.docgia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.btl.conf.jdbcUtils;
import com.btl.pojo.DocGia;
import com.btl.services.QuanLyDocGia;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author My
 */
public class DocGiaTester {
   QuanLyDocGia qlDG = new QuanLyDocGia();
   @Test
   public void testQuantity() throws SQLException{
       Connection conn = jdbcUtils.getConn ();
       Statement stm = conn.createStatement();
       ResultSet rs = stm.executeQuery("SELECT maDG, CONCAT(Ho,' ',Ten) AS hoTen,DoiTuong FROM docgia INNER JOIN doituong ON doituong.iddoituong  = docgia.maDoiTuong;"); 
       //ResultSet rs = stm.executeQuery("SELECT * FROM category");
       List<String> kq = new ArrayList<>();
       while(rs.next()){
//           String name = rs.getString("name");
//           System.out.println(name);
           int id = rs.getInt("maDG");
           System.out.println(id);
           String tenDG = rs.getString("hoTen");
//           System.out.println(hoDG);
//           String tenDG = rs.getString("Ten");
           System.out.println(tenDG);
           String maDT = rs.getString("DoiTuong");
           System.out.println(maDT);
//           String tenDT = rs1.getString("DoiTuong");
//           System.out.println(tenDT);
       }
       Set<String> kq2 = new HashSet<>(kq);
       Assertions.assertEquals(kq.size(), kq2.size());
       if(conn != null)
           conn.close();
   }
   @Test
   //Them doc gia
    public void Test1() throws SQLException{
       DocGia d = new DocGia("Tran","Hau", "Nam", null , 1, 4, java.sql.Date.valueOf(LocalDate.now()), java.sql.Date.valueOf(LocalDate.now()), "av212@gmail.com", "129 Lương ", "0129375483");
       int a = qlDG.getDocGia(null).size();
       qlDG.addDG(d);
       Assertions.assertNotNull(qlDG.get1DocGia(d.getSdt()));
       Assertions.assertEquals(a + 1, qlDG.getDocGia(null).size());
    }
    @Test
    public void Test2() throws SQLException{
       DocGia d = qlDG.get1DocGia("0129375483");
       d.setEmail("hien123@gmail.com");
       qlDG.updateDG(d);
       Assertions.assertEquals("hien123@gmail.com", qlDG.get1DocGia("0129375483").getEmail());
    }
    @Test
    public void Test3() throws SQLException{
       DocGia d = qlDG.get1DocGia("0129375483");
       int a = qlDG.getDocGia(null).size();
       Assertions.assertNotNull(qlDG.get1DocGia("0129375483"));
       qlDG.delDG(d.getMaDG()); 
       Assertions.assertNull(qlDG.get1DocGia("0129375483"));
       Assertions.assertEquals(a - 1, qlDG.getDocGia(null).size());
    }
    @Test 
    public void TestDGbySDTInvlid() {
       DocGia dg;
       try {
           dg = qlDG.get1DocGia("0988345123");
           Assertions.assertNull(dg);
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
    @Test 
    public void TestDGbySDTValid() {
       DocGia dg;
       try {
           dg = qlDG.get1DocGia("0894562137");
           Assertions.assertEquals(dg.getTen(),"A");
           Assertions.assertEquals(dg.getEmail(),"dgxcbx@ou.edu.vn" );
           Assertions.assertEquals(dg.getDiaChi(),"Huế");
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
