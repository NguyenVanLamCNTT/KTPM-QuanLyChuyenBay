package com.exercise.quanlychuyenbay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.quanlychuyenbay.entities.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String>{
    public List<ChuyenBay> findAllByGaDen(String gaDen);
}
