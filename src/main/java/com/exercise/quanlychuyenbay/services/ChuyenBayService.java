package com.exercise.quanlychuyenbay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.quanlychuyenbay.entities.ChuyenBay;
import com.exercise.quanlychuyenbay.repository.ChuyenBayRepository;

@Service
public class ChuyenBayService implements IChuyenBayService{

    private final ChuyenBayRepository chuyenBayRepository;

    @Autowired
    public ChuyenBayService(ChuyenBayRepository chuyenBayRepository){
        this.chuyenBayRepository = chuyenBayRepository;
    }

    @Override
    public List<ChuyenBay> findChuyenBayByGaDen(String gaDen) {
        return chuyenBayRepository.findAllByGaDen(gaDen);
    }
    
}
