<<<<<<< HEAD:Quanlythuvien/src/test/java/com/btl/TestMenu/ViTriTester.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.TestMenu;
=======

package com.btl.Sach;
>>>>>>> b31bc7df4534206831d3f4a154ab5b66117b7e32:Quanlythuvien/src/test/java/com/btl/Sach/ViTriTester.java

import com.btl.TestObject.DocGiaTester;
import com.btl.pojo.ViTri;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.btl.services.QuanLyViTri;

<<<<<<< HEAD

=======
/**
 *
 * @author Acer
 */
>>>>>>> ff5cee7fc52be8a21d68598de5d86b858cf4b30f
public class ViTriTester {
    QuanLyViTri qlVT = new QuanLyViTri();
    @Test 
    public void TestDGbySDTInvlid() {
       ViTri vt;
       try {
           vt = qlVT.getViTri2(10);
           Assertions.assertNull(vt);
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
    @Test 
    public void TestDGbySDTValid() {
       ViTri vt;
       try {
           vt = qlVT.getViTri2(1);
           Assertions.assertEquals("A", vt.getTenKe());
           Assertions.assertEquals(1, vt.getMaKhu());
 
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
}
