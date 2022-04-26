
package com.btl.pojo;

public class DoiTuong {
    //private static int dem;
    private int maDT;
    private String doiTuong;
    public DoiTuong(int maDT, String tenDT) {
        this.maDT = maDT;
        this.doiTuong = tenDT; 
    }
     @Override
    public String toString() {
        return this.getDoiTuong();
    }
    

    /**
     * @return the maDT
     */
    public int getMaDT() {
        return maDT;
    }

    /**
     * @param maDT the maDT to set
     */
    public void setMaDT(int maDT) {
        this.maDT = maDT;
    }

    /**
     * @return the tenDT
     */

    /**
     * @return the doiTuong
     */
    public String getDoiTuong() {
        return doiTuong;
    }

    /**
     * @param doiTuong the doiTuong to set
     */
    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }
}
