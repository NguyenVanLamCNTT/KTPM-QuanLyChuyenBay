package com.exercise.quanlychuyenbay.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ChungNhanKey implements Serializable{
    @ManyToOne
    @JoinColumn(name = "MaNV")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "MaMB")
    private MayBay mayBay;

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public MayBay getMayBay() {
        return mayBay;
    }

    public void setMayBay(MayBay mayBay) {
        this.mayBay = mayBay;
    }
}
