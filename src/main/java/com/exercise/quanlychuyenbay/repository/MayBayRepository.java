package com.exercise.quanlychuyenbay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exercise.quanlychuyenbay.entities.MayBay;
@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
    
}
