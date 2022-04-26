
package com.btl.Sach;

import com.btl.docgia.DocGiaTester;
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
    public void TestDGbySDTInvlid() {
       DanhMuc dm;
       try {
           dm = qlDM.getDanhMuc2(10);
           Assertions.assertNull(dm);
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
    @Test 
    public void TestDGbySDTValid() {
       DanhMuc dm;
       try {
           dm = qlDM.getDanhMuc2(1);
           Assertions.assertEquals("Tài liệu", dm.getTenDanhMuc());
 
       } catch (SQLException ex) {
           Logger.getLogger(DocGiaTester.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
    
