package com.exercise.quanlychuyenbay.services;

import java.util.List;

import com.exercise.quanlychuyenbay.entities.ChuyenBay;

public interface IChuyenBayService {
    public List<ChuyenBay> findChuyenBayByGaDen(String gaDen);
}
