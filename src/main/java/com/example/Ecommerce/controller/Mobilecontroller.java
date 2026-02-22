package com.example.Ecommerce.controller;


import com.example.Ecommerce.Model.Mobile;
import com.example.Ecommerce.service.Mobileservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin
public class Mobilecontroller {
    @Autowired
    Mobileservice mobileservice;

    @GetMapping("/mobile")
    public ResponseEntity<List<Mobile>> getmobile(){
            return new ResponseEntity<>(mobileservice.getall(),HttpStatus.OK);
    }
    @PostMapping("/addmobiles")
    public ResponseEntity<Mobile> addmobile(@RequestBody Mobile mobile){
        return new ResponseEntity<>(mobileservice.addmobile(mobile),HttpStatus.CREATED);
    }
    @GetMapping("/mobile/{id}")
    public ResponseEntity<Mobile> getid(@PathVariable int id){
        return  new ResponseEntity<>(mobileservice.getid(id),HttpStatus.OK);
    }
}