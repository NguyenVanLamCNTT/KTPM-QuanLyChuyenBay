package com.exercise.quanlychuyenbay.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.quanlychuyenbay.entities.ChuyenBay;
import com.exercise.quanlychuyenbay.services.IChuyenBayService;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
    private final IChuyenBayService chuyenBayService;

    @Autowired
    public ChuyenBayController(IChuyenBayService chuyenBayService){
        this.chuyenBayService = chuyenBayService;
    }

    @GetMapping("")
    public ResponseEntity<?> getAllByGaDen() {
        List<ChuyenBay> chuyenBays = chuyenBayService.findChuyenBayByGaDen("DAD");
        return ResponseEntity.ok().body(chuyenBays);
    }
}
