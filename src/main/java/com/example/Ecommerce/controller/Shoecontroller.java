package com.example.Ecommerce.controller;

import com.example.Ecommerce.Model.Shoe;
import com.example.Ecommerce.service.Shoeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Shoecontroller {
    @Autowired
        Shoeservice shoeservice;


    @GetMapping("/shoes")
    public ResponseEntity<List<Shoe>> getshoe(){
        return new ResponseEntity<>(shoeservice.getall(), HttpStatus.OK);
    }
    @PostMapping("/addshoe")
    public void addshoe(@RequestBody Shoe shoe){
        shoeservice.addshoe(shoe);
    }
    @GetMapping("/shoe/{id}")
    public ResponseEntity<Shoe>getid(@PathVariable int id){
        return new ResponseEntity<>(shoeservice.getid(id),HttpStatus.OK);
    }
}
