package com.example.Ecommerce.controller;


import com.example.Ecommerce.Model.Skincare;
import com.example.Ecommerce.service.Skincareservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Skincarecontroller {
    @Autowired
    Skincareservice skincareservice;

    @GetMapping("/Skincare")
    public ResponseEntity<List<Skincare>> getall(){
        return  new ResponseEntity<>(skincareservice.getall(), HttpStatus.OK);
    }
    @PostMapping("/addSkincare")
    public void add(@RequestBody Skincare skincare){
        skincareservice.add(skincare);

    }
    @GetMapping("/Skincare/{id}")
    public ResponseEntity<Skincare>getid(@PathVariable int id){
        return new ResponseEntity<>(skincareservice.getid(id),HttpStatus.FOUND);
    }
}
