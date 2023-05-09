/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class PhieuDatSan {
    private String  maDS;
    private Date ngayDS;
    private String  maKH, maSan;
    private Date ngayBatdau, ngayKetthuc;
    private int tienThue, tienCoc, soBuoi, tienPhat;
    public PhieuDatSan() {
    }
    public PhieuDatSan(String maDS,Date ngayDS, String maKH, String maSan, Date ngayBatdau, Date ngayKetthuc, int tienThue, int tienCoc, int soBuoi, int tienPhat) {
        this.ngayDS = ngayDS;
        this.maDS = maDS;
        this.maKH = maKH;
        this.maSan = maSan;
        this.ngayBatdau = ngayBatdau;
        this.ngayKetthuc = ngayKetthuc;
        this.tienThue = tienThue;
        this.tienCoc = tienCoc;
        this.soBuoi = soBuoi;
        this.tienPhat = tienPhat;
    }

    public Date getNgayDS() {
        return ngayDS;
    }

    public void setNgayDS(Date ngayDS) {
        this.ngayDS = ngayDS;
    }
    public String getMaDS() {
        return maDS;
    }

    public void setMaDS(String maDS) {
        this.maDS = maDS;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaSan() {
        return maSan;
    }

    public void setMaSan(String maSan) {
        this.maSan = maSan;
    }

    public Date getNgayBatdau() {
        return ngayBatdau;
    }

    public void setNgayBatdau(Date ngayBatdau) {
        this.ngayBatdau = ngayBatdau;
    }

    public Date getNgayKetthuc() {
        return ngayKetthuc;
    }

    public void setNgayKetthuc(Date ngayKetthuc) {
        this.ngayKetthuc = ngayKetthuc;
    }

    public int getTienThue() {
        return tienThue;
    }

    public void setTienThue(int tienThue) {
        this.tienThue = tienThue;
    }

    public int getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(int tienCoc) {
        this.tienCoc = tienCoc;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }
    
}
