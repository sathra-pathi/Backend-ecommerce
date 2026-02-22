package com.example.Ecommerce.controller;


import com.example.Ecommerce.Model.Laptop;
import com.example.Ecommerce.Model.Shoe;
import com.example.Ecommerce.service.Laptopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Laptopcontroller {
    @Autowired
    private Laptopservice laptopservice;

    @GetMapping("/laptops")
    public List<Laptop> getlap(){
        return laptopservice.get();
    }
    @PostMapping("/addlaptops")
    public void Addlaptop(@RequestBody Laptop laptop){
         laptopservice.addlaptop(laptop);
    }
    @GetMapping("/laptops/{id}")
    public ResponseEntity<Laptop> getid(@PathVariable int id){
    return  new ResponseEntity<>(laptopservice.getid(id), HttpStatus.OK);
    }
}
