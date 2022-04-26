
package com.btl.pojo;


public class ViTri {
    private int viTriID;
    private String tenKe;
    private int MaKhu;

    public ViTri() {
    }

    public ViTri(int viTriID, String tenKe, int MaKhu) {
        this.viTriID = viTriID;
        this.tenKe = tenKe;
        this.MaKhu = MaKhu;
    }
    public ViTri(int viTriID, String tenKe) {
        this.viTriID = viTriID;
        this.tenKe = tenKe;
    }
    
    @Override
    public String toString() {
        return this.getTenKe();
    }
    
    /**
     * @return the viTriID
     */
    public int getViTriID() {
        return viTriID;
    }

    /**
     * @param viTriID the viTriID to set
     */
    public void setViTriID(int viTriID) {
        this.viTriID = viTriID;
    }

    /**
     * @return the tenKe
     */
    public String getTenKe() {
        return tenKe;
    }

    /**
     * @param tenKe the tenKe to set
     */
    public void setTenKe(String tenKe) {
        this.tenKe = tenKe;
    }

    /**
     * @return the MaKhu
     */
    public int getMaKhu() {
        return MaKhu;
    }

    /**
     * @param MaKhu the MaKhu to set
     */
    public void setMaKhu(int MaKhu) {
        this.MaKhu = MaKhu;
    }
}
