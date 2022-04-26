
module com.btl.quanlythuvien {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;
    
    opens com.btl.quanlythuvien to javafx.fxml;
    exports com.btl.quanlythuvien;
    exports com.btl.pojo;
}
