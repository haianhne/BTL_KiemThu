<<<<<<< HEAD:Quanlythuvien/src/test/java/com/btl/TestMenu/MuonSachTester.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.TestMenu;
=======

package com.btl.Sach;
>>>>>>> b31bc7df4534206831d3f4a154ab5b66117b7e32:Quanlythuvien/src/test/java/com/btl/Sach/MuonSachTester.java

import com.btl.TestObject.DocGiaTester;
import com.btl.pojo.ThueSach;
import com.btl.services.QuanLyThueSach;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD

=======
/**
 *
 * @author Acer
 */
>>>>>>> ff5cee7fc52be8a21d68598de5d86b858cf4b30f
public class MuonSachTester {
    QuanLyThueSach qlTS = new QuanLyThueSach();
    @Test
   public void addMuonSachTest() throws SQLException
   {
        ThueSach ts = new ThueSach();
        ts.setMaDG(1);
        ts.setIdSach(1);
        ts.setNgayMuon(java.sql.Date.valueOf(LocalDate.now()));
        ts.setHan(java.sql.Date.valueOf(LocalDate.now()));
        int a = qlTS.getThueSach(null).size();
        qlTS.addThueSach(ts);
        Assertions.assertEquals(a + 1, qlTS.getThueSach(null).size());
   }
    @Test 
    public void TestCheckInvlid() {
       int count;
       try {
           count = qlTS.Check(5);
           Assertions.assertNotEquals(1, count);
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
    @Test 
    public void TestCheckValid() {
       int count;
       try {
           count = qlTS.Check(3);
           Assertions.assertEquals(5, count);
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
