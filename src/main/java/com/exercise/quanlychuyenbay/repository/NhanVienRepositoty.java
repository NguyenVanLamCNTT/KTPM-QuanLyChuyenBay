package com.exercise.quanlychuyenbay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.quanlychuyenbay.entities.NhanVien;

@Repository
public interface NhanVienRepositoty extends JpaRepository<NhanVien, String>{
    
}
