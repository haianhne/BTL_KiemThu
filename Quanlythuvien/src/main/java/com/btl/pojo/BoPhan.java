
package com.btl.pojo;


public class BoPhan {
    private int maBP;
    private String tenBP;
    public BoPhan(int maBP, String tenBP) {
        this.maBP = maBP;
        this.tenBP = tenBP; 
    }
    
     @Override
    public String toString() {
        return this.getTenBP();
    }
    /**
     * @return the maBP
     */
    public int getMaBP() {
        return maBP;
    }

    /**
     * @param maBP the maBP to set
     */
    public void setMaBP(int maBP) {
        this.maBP = maBP;
    }

    /**
     * @return the tenBP
     */
    public String getTenBP() {
        return tenBP;
    }

    /**
     * @param tenBP the tenBP to set
     */
    public void setTenBP(String tenBP) {
        this.tenBP = tenBP;
    }
}
