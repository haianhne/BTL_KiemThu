<<<<<<< HEAD:Quanlythuvien/src/test/java/com/btl/TestMenu/DanhMucTester.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.TestMenu;
=======

package com.btl.Sach;
>>>>>>> b31bc7df4534206831d3f4a154ab5b66117b7e32:Quanlythuvien/src/test/java/com/btl/Sach/DanhMucTester.java

import com.btl.TestObject.DocGiaTester;
import com.btl.pojo.DanhMuc;
import com.btl.services.QuanLyDanhMuc;
import java.sql.SQLException;
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
public class DanhMucTester {
    QuanLyDanhMuc qlDM = new QuanLyDanhMuc();
    @Test 
    public void TestSDTofDG1() {
       DanhMuc dm;
       try {
           dm = qlDM.getDanhMuc2(3);
           Assertions.assertNull(dm);
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
    @Test 
    public void TestSDTofDG2() {
       DanhMuc dm;
       try {
           dm = qlDM.getDanhMuc2(3);
           Assertions.assertEquals("Tài liệu", dm.getTenDanhMuc());
 
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
    
