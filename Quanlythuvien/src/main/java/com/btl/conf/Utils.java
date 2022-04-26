
package com.btl.conf;

import javafx.scene.control.Alert;


public class Utils {
    public static Alert getBox(String content, Alert.AlertType type) {
        Alert a = new Alert(type);
        a.setContentText(content);
        
        return a;
    }
}
