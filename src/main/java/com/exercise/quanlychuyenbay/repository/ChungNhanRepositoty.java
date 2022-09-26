package com.exercise.quanlychuyenbay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.quanlychuyenbay.entities.ChungNhan;
import com.exercise.quanlychuyenbay.entities.ChungNhanKey;

@Repository
public interface ChungNhanRepositoty extends JpaRepository<ChungNhan, ChungNhanKey>{
    
}
