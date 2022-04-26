
package com.btl.Sach;

import com.btl.docgia.DocGiaTester;
import com.btl.pojo.DanhMuc;
import com.btl.pojo.ViTri;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.btl.services.QuanLyViTri;


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
           Assertions.assertEquals(vt.getTenKe(),"A");
           Assertions.assertEquals(vt.getMaKhu(), 1);
 
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
