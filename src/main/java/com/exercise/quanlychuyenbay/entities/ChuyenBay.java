package com.exercise.quanlychuyenbay.entities;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
    @Id
    @Column(name = "MaCB")
    private String maCB;

    @Column(name= "Gadi")
    private String gaDi;

    @Column(name = "GaDen")
    private String gaDen;

    @Column(name = "DoDai")
    private int doDai;

    @Column(name = "GioDi")
    private Time gioDi;

    @Column(name = "GioDen")
    private Time gioDen;

    @Column(name = "ChiPhi")
    private int chiPhi;

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }

    public String getGaDi() {
        return gaDi;
    }

    public void setGaDi(String gaDi) {
        this.gaDi = gaDi;
    }

    public String getGaDen() {
        return gaDen;
    }

    public void setGaDen(String gaDen) {
        this.gaDen = gaDen;
    }

    public int getDoDai() {
        return doDai;
    }

    public void setDoDai(int doDai) {
        this.doDai = doDai;
    }

    public Time getGioDi() {
        return gioDi;
    }

    public void setGioDi(Time gioDi) {
        this.gioDi = gioDi;
    }

    public Time getGioDen() {
        return gioDen;
    }

    public void setGioDen(Time gioDen) {
        this.gioDen = gioDen;
    }

    public int getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }
}
