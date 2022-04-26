
package com.btl.pojo;

import java.sql.Date;

public class NhapSach {
    private int idSach;
    private Date ngayNhapSach;
    private int soLuong;

    public NhapSach() {
    }

    public NhapSach(int idSach, Date ngayNhapSach, int soLuong) {
        this.idSach = idSach;
        this.ngayNhapSach = ngayNhapSach;
        this.soLuong = soLuong;
    }

    /**
     * @return the ngayNhapSach
     */
    public Date getNgayNhapSach() {
        return ngayNhapSach;
    }

    /**
     * @param ngayNhapSach the ngayNhapSach to set
     */
    public void setNgayNhapSach(Date ngayNhapSach) {
        this.ngayNhapSach = ngayNhapSach;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
