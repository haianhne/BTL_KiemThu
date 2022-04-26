
package com.btl.pojo;


public class DanhMuc {
     private int maDanhMuc;
    private String tenDanhMuc;
    
    public DanhMuc()
    {
        
    }

    public DanhMuc(int maDanhMuc, String tenDanhMuc) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }

    @Override
    public String toString() {
        return this.tenDanhMuc; //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * @return the maDanhMuc
     */
    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    /**
     * @param maDanhMuc the maDanhMuc to set
     */
    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    /**
     * @return the tenDanhMuc
     */
    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    /**
     * @param tenDanhMuc the tenDanhMuc to set
     */
    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }
}
