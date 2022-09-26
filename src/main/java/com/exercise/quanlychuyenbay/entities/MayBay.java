package com.exercise.quanlychuyenbay.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
    
    @Id
    @Column(name = "MaMB")
    private int maMB;

    @Column(name = "Loai")
    private String loai;

    @Column(name = "TamBay")
    private int tamBay;

    public int getMaMB() {
        return maMB;
    }

    public void setMaMB(int maMB) {
        this.maMB = maMB;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getTamBay() {
        return tamBay;
    }

    public void setTamBay(int tamBay) {
        this.tamBay = tamBay;
    }
}
